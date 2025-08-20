import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of p :"+" ");
        int p = sc.nextInt();
        System.out.print("Enter the value of r :"+" ");
        int r = sc.nextInt();
        System.out.print("Enter the value of t :"+" ");
        int t = sc.nextInt();
        int interest = (p*r*t)/100;
        System.out.print("Simple interest :"+" "+interest);
    }
}
