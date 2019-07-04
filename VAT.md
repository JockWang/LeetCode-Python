## 什么是虚拟对抗训练（$VAT$）？

以局部分布平滑度（$LDS$）作为正则化项的模型称为$VAT$。

## 什么是局部分布平滑度（$LDS$）？

一个模型在输入数据的上的$LDS$定义为基于**模型分布对数据点周围局部扰动的鲁棒性**的**KL-散度**（KL-散度又称为**信息增益**或**相对熵**）。

## 什么是KL-散度/信息增益/相对熵？

KL-散度：KL散度是两个概率分布P和Q差别的非对称性的度量。

信息增益：在决策树中，它定义为一个特征能够为分类系统带来多少信息，带来的信息越多，说明该特征越重要，相应的信息增益也就越大。

相对熵：用来衡量两个取值为正的函数或概率分布之间的差异。

## VAT和AT区别？

VAT很类似与AT，区别在于VAT不适用标签信息来确定对抗方向，而是单独从模型分布来确定对抗方向，这就使其可以适用于监督、半监督学习任务。而AT只适用与监督学习。

## VAT有什么优点？

* 计算成本低：$LDS$的近似梯度可以使用不超过三对前向和反向传播来计算；

* 表现优秀；

## 公式说明

$$
\Delta_{\mathrm{KL}}\left(r, x^{(n)}, \theta\right) \equiv \mathrm{KL}\left[p\left(y | x^{(n)}, \theta\right) \| p\left(y | x^{(n)}+r, \theta\right)\right]
$$

这里是论文中的公式，用来KL-散度定义，其中$r$是对抗扰动，$\theta$是$p(y|x^{(n)})$的参数，$p(y|x^{(n)})$则表示输入为$x^{(n)}$的条件下输出为$y$的概率，同理，$p(y|x^{(n)}+r)$表示输入为$x^{(n)}$添加一个扰动$r$输出为$y$的概率，即是求这两个概率的$KL-散度$。

这里的扰动$r$的定义为：
$$
r_{\mathrm{vadv}}^{(n)} \equiv \arg \max _{r}\left\{\Delta_{\mathrm{KL}}\left(r, x^{(n)}, \theta\right) ;\|r\|_{2} \leq \epsilon\right\}
$$
即，使$KL-散度$最大化且满足$||r||_2<\epsilon$的那个扰动，也就是针对$p(y|x^{(n)})$的$KL-散度$**最敏感的方向**，$KL-散度$越大说明两个概率函数差异越大。

接下来就能定义$LDS$（局部分布平滑度）了：
$$
\operatorname{LDS}\left(x^{(n)}, \theta\right) \equiv-\Delta_{\mathrm{KL}}\left(r_{\mathrm{v}-\mathrm{adv}}^{(n)}, x^{(n)}, \theta\right)
$$
**这个$\Delta_{\mathrm{KL}}\left(r_{\mathrm{v}-\mathrm{adv}}^{(n)}, x^{(n)}, \theta\right)$值越小，说明输入为$x$的$p(y|x^{(n)})$的光滑度就越大，也就是其模型在$x$为输入的鲁棒性越好**。

针对整个模型，当然是整体的$LDS$值了，目标函数是这个
$$
\frac{1}{N} \sum_{n=1}^{N} \log p\left(y^{(n)} | x^{(n)}, \theta\right)+\lambda \frac{1}{N} \sum_{n=1}^{N} \operatorname{LDS}\left(x^{(n)}, \theta\right)
$$
这种训练称为虚拟对抗训练。