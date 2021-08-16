package Testans;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
 class Dateformat{
    public static boolean validateJavaDate(String strDate)
    {
        SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy");
            try
            {
                Date javaDate = sdfrmt.parse(strDate);
                System.out.println(strDate+" is valid date format");
            }
            catch (ParseException e)
            {
                System.out.println(strDate+" is Invalid Date format");
                return false;
            }
            return true;

    }
    public static void main(String args[]){
        validateJavaDate("29/12/2021");
        validateJavaDate("29-12-2021");
        validateJavaDate("29,12,2021");
    }
}
