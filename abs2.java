public class abs2 {
    public static void main(String[] args){
        Horses hc = new Horses();
        hc.breath();
        hc.eat();
        System.out.println(hc.color);

    }
}
abstract class Anim{
    String color;
    Anim(){
        color = "brown";
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
    abstract void breath();
}
class Horses extends Anim {
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void breath(){
        System.out.println("breath by nose");
    }
}
class Fishes extends Anim {
    void changeColor(){
        color = "pink";
    }
    void walk() {
        System.out.println("cannot walk.....only swims");
    }
    void breath() {
        System.out.println("breath by gills");
    }
}

