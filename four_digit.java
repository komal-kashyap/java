import java.util.Scanner;

public class four_digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four digit number");
        int num = sc.nextInt();
        int a = num/1000;
        int b = (num/100)%10;
        int c = (num/10)%10;
        int d = (num/1)%10;
        int sum = a+b+c+d;
        System.out.println("sum is :"+ " "+sum);
    }
}
