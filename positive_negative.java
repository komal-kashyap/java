import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        String type = (number>0)?"positive":"negative";
        System.out.println(type);
    }
}
