public class find_all_prime_in_range {
    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n){
        for (int i = 2;i<=n;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        primeInRange(9);
    }
}
