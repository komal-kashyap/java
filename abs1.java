public class abs1 {
    public static void main(String[] args){
        Horse h = new Horse();
        h.breath();
        h.eat();
        Fish f = new Fish();
        f.walk();
        f.eat();
    }
}
abstract class Ani{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
    abstract void breath();
}
class Horse extends Ani{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void breath(){
        System.out.println("breath by nose");
    }
}
class Fish extends Ani {
    void walk() {
        System.out.println("cannot walk.....only swims");
    }

    void breath() {
        System.out.println("breath by gills");
    }
}