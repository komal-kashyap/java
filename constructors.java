public class constructors {
    public static void main(String[] args){
        Student sc = new Student();
        Student sc1 = new Student("kashyap");
        Student sc2 = new Student("ankit",80);
    }
}
class Student{
    String name;
    int roll;
    //default constructor
    Student() {
        System.out.println("constructor is called");
    }
    //parameterised constructor
    Student(String name){
        this.name=name;
    }
    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
}