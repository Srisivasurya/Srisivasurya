abstract class Ban{
    abstract int getInterestRate();
}

class ICICI extends Ban{
    int getInterestRate(){return 7;}
}

class HDFC extends Ban{
    int getInterestRate(){return 6;}
}

class Abt2{
    public static void main(String args[]){
        Ban b;
        b = new ICICI ();
        System.out.println("Citi Rate of Interest is: "+b.getInterestRate()+"%");
        b = new HDFC ();
        System.out.println("HSBC Rate of Interest is: "+b.getInterestRate()+"%");
    }
}