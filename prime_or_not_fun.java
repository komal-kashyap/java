import java.util.Scanner;

public class prime_or_not_fun {
    public static boolean prime(int n){
        boolean prime = true;
        for (int i=2;i<=n-1;i++){
            if (n%2==0){//completely divisible by 2
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
}
