import java.util.Scanner;

public class print_num_with_bre {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter your number : ");
            int number = sc.nextInt();
            if (number%10==0){
                break;
            }
            System.out.println(number);
        }while(true);
    }
}