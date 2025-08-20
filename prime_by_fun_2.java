public class prime_by_fun_2 {
    public static boolean prime(int a){
        for (int i=2;i<=a;i++){
            if(a%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(prime(7));
    }
}
