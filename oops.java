public class oops {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);

    }
}
class Pen {
    //property+function
    String color;
    int tip;

    public void setColor(String color) {
        this.color = color;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}
