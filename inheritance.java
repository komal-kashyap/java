public class inheritance {
    public static void main(String[] args){
        SBI sc = new SBI();
        HDFC h = new HDFC();
        ICICI i = new ICICI();
        System.out.println(sc.GetRateOfInterest());
        System.out.println(h.GetRateOfInterest());
    }
}
class bank{
    int GetRateOfInterest(){
        ;return(0);
    }
}
class SBI extends bank{
    @Override
    int GetRateOfInterest() {
        return (8);
    }
}
class  ICICI extends bank{
    int GetRateOfInterest(){
        return(7);
    }
}
class  HDFC extends bank {
    int GetRateOfInterest() {
        return (9);
    }
}