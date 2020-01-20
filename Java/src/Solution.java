import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

public class Solution {
    /**
     * 动态规划的思想：
     * 前i天的最大收益 = max(前i-1天的最大收益，第i天的股价-前i-1天中的最小值)
    * */
    public int maxProfit(int[] prices) {
        int max = 0;
        if(prices.length <= 1)
            return max;
        int min = prices[0];
        for(int i = 1; i < prices.length;i ++){
            if(prices[i] - min > max){
                max = prices[i]-min;
            }
            if(min > prices[i])
                min = prices[i];
        }
        return max;
    }
    /**
     * 动态规划：
     *
    * */
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0];
        int res = nums[0];
        for(int i = 1;i < nums.length;i ++){
            if(nums[i] < 0){
                int temp = min;
                min = max;
                max = temp;
            }
            max = Math.max(nums[i]*max, nums[i]);
            min = Math.min(nums[i]*min, nums[i]);
            res = Math.max(max,res);
        }
        return res;
    }
    /*
    * 合并两个排序的链表
    * */
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode list = new ListNode(0);
        ListNode point = list;
        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                point.next = list1;
                point = point.next;
                list1 = list1.next;
            } else {
                point.next = list2;
                point = point.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            point.next = list1;
        }
        if(list2 != null){
            point.next = list2;
        }
        return list.next;
    }
    /*
    * 树的子结构
    * */
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)
            return false;
        return (isSubtree(root1.left, root2) || isSubtree(root1.right, root2) || isSubtree(root1, root2));
    }
    public boolean isSubtree(TreeNode root1,TreeNode root2){
        if(root2 == null) return true;
        if(root1 == null) return false;
        if(root1.val == root2.val){
            return (isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right));
        }
        return false;
    }
    /*
    *二叉树的镜像
    * */
    public void Mirror(TreeNode root) {
        if(root != null){
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
    /*
    * 顺时针打印矩阵
    * */
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix.length <= 0 || matrix[0].length <= 0)
            return list;
        int startx = 0, starty = 0, endx = matrix.length, endy = matrix[0].length;
        int i = 0, j = 0;
        while (list.size() < endx*endy){
            for(int i = starty;i < endy; j ++)
                list.add(matrix[startx][i]);
            startx ++;
        }
//    }
}
