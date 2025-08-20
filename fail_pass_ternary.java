import java.util.Scanner;

public class fail_pass_ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float marks = sc.nextFloat();
        String type = (marks>=33)?"pass":"fail";
        System.out.println(type);
    }
}
