import java.util.Scanner;

public class fun_div {
    public static float calculateDivide(float a,float b){
        float divide = a/b;
        return divide;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float divide = calculateDivide(a,b);
        System.out.println(divide);
    }
}
