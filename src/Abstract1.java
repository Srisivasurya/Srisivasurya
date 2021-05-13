abstract class Bank{
    abstract int getInterestRate();
}
class Citi extends Bank{
    int getInterestRate(){return 7;}
}
class CBI extends Bank{
    int getInterestRate(){return 5;}
}
class Bank2{
    public static void main(String args[]){
        Bank b;
        b = new Citi ();
        System.out.println("Citi Rate of Interest is: "+b.getInterestRate()+"%");
        b = new CBI ();
        System.out.println("HSBC Rate of Interest is: "+b.getInterestRate()+"%");
    }
}
