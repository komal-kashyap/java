public class Oops1 {
    public static void main(String[] args) {
        Bank myAcc = new Bank();
        myAcc.name = "kashyap";

    }

}
class Bank {
    public String name;
    //not accessible because it is private
    private String password;
    //function to change password
    public void setPassword(String pwd){
        password = pwd;
    }
}