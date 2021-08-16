package Testans;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int array[] = {6,4,3,2,1,5,10,0};
        Arrays.sort(array);
        System.out.println("highest number is " + array[array.length - 1]);
        System.out.println("lowest number is " + array[array.length - 8]);
        int sum=0;
        int len = array.length;
        int count=0;

        for(int i=0;i<len;i++)
        {
            sum=sum+array[i];
            count++;
        }
        System.out.println(sum);
        System.out.println(count);

    }
}
