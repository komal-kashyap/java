public class Oops2 {
    public static void main(String[] args){
        Pencil sc = new Pencil();
        sc.setColour("blue");
        System.out.println(sc.getColour());
        sc.setTip(5);
        System.out.println(sc.getTip());
        sc.setColour("yellow");
        System.out.println(sc.getColour());

    }
}
class Pencil{
    private String colour;
    private int tip;

    String getColour(){
        return this.colour;
    }

    int getTip(){
        return this.tip;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}
