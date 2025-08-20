public class calculate {
    public static void main(String[] args){
        cal sc = new cal();
        data dc = new data();
        sc.sum(10, 9);
        sc.sum(12, 5,53);
        dc.sum(6.7f,9.8f);
        dc.sum(5.6,7.6);

    }
}
class cal{
    //method overloading by changing number of parameters or arguments
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
//method overloading by changing data types
class data{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(float a,float b){
        System.out.println(a+b);
    }
    void sum(double a , double b){
        System.out.println(a+b);
    }
}