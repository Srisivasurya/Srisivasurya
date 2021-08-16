package Testans;

public class AreaCode {
    public static void main(String args[]){
        Pincode p = new Pincode();
        try
        {
            p.pincodeDisplay();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
