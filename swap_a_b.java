import java.util.Scanner;

public class swap_a_b {
    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
    public static void main(String[] args){
        swap(67,78);
    }
}
