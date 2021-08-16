package Testans;
import java.util.*;
import java.util.HashMap;
public class Pincode {
    public void pincodeDisplay() throws Exception{
        HashMap< Integer , String > area = new HashMap<>();
        area.put(600020 , " Adyar ");
        area.put(600024 , " Mylapore ");
        area.put(600022 , " Nugabakkam ");
        Scanner s = new Scanner(System.in);
        Integer pin = s.nextInt();
        if(String.valueOf(pin.intValue()).length() !=6 || pin == null){
            throw new Exception(" Length of pincode allowed only 6 digits only");
        }
        if(area.containsKey(pin)){
            System.out.println(area.get(pin));
        }
        else
        {
            System.out.println(" Invalid zipcode");
        }


    }

}
