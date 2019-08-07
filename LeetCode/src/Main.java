import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] number = str.split(" ");
        String [] arr = new String[num];
        int max = 0;
        for (int i = 0;i < num;i ++){
            if(max < Integer.parseInt(number[i])){
                arr[i] = number[i];
                max = Integer.parseInt(number[i]);
            }
            else {
                arr[i] = arr[i-1];
            }
        }
        for(int i = 0; i < num; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
