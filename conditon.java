import java.util.Scanner;

public class conditon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
