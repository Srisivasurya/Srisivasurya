package Testans;

import java.util.Arrays;

public class Asort {
    public static void main(String[] args){
        int array[]={6,89,34,67,99};
        Arrays.sort(array);
        System.out.println("highest number is "+array[array.length-2]);
    }
}