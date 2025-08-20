//method overriding
public class constructor2 {
    public static void main(String[] args){
        bike obs=new bike();
        obs.run();
    }
}
class vehical{
    void run(){
        System.out.println("vehical is running");
    }
}
class bike extends vehical {
    @Override
    void run() {
        System.out.println("vehical is running safely");
    }
}