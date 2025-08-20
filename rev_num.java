import java.util.Scanner;

public class rev_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        do {
            int lastDigit = number%10;
            System.out.print(lastDigit);
            number=number/10;
        }while(number>0);
    }
}
