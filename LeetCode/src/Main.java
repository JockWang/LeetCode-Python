import java.util.List;

public class Main {
    public static void main(String args[]){
        System.out.println(new Solution43().multiply("123456789","987654321"));
    }
    public static void print(List<List<Integer>> list){
        for(List li:list){
            for(Object i:li){
                System.out.print((int)i);
            }
            System.out.println("");
        }
    }
}
