public class inheritance2 {
    public static void main(String[] args){
        fish shark=new fish();
        gaurav obs=new gaurav();
        obs.barks();
        obs.dance_like_monkey();
        obs.eat();
    }
}
//base  class
class animal{
    String color;
    void eat(){
        System.out.println("gaurav eats garbage");
    }
    void breathe(){
        System.out.println("inhale/exhale");
    }
}
//child class /derived class
class fish extends animal{
    int fins;
    void swims(){
        System.out.println("swims");
    }
}
class gaurav extends animal{
    int legs;
    void barks(){
        System.out.println("gaurav always barks");
    }
    void dance_like_monkey(){
        System.out.println("gaurav behave like donkey and dance like monkey");
    }
}