package Test;
import java.util.Scanner;

public class citizen {
    public static void main(String[] args){
        int senior,semisenior,minor,age;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the senior");
        senior=input.nextInt();
        semisenior=input.nextInt();
        System.out.println("what is citizen age");
        age=input.nextInt();
        if(age>60)
        {
            System.out.println("Senior");
            senior+=1;
        }
        else
        {
            System.out.println("Semisenior");
            semisenior+=1;
        }
        System.out.println("New Senior citizen count"+senior);
        System.out.println("New semisenior count"+semisenior);



    }
}
