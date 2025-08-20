import java.util.Scanner;

public class fun_mul {
    public static int calculateDiv(int a, int b){
        int mul = a/b;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = calculateDiv(a,b);
        System.out.println(mul);
    }
}
