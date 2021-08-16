package Testans;

import java.util.Scanner;
class VaccineException extends Exception
{

    String age;
    public VaccineException (String age)
    {
        this.age=age;
    }
}
