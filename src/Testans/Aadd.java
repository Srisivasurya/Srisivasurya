package Testans;

class Aadd {

     public int calculate(int a, int b) {
         return (a + b);
     }

     public int calculate(int a, int b, int c) {
         return (a + b + c);
     }

     public static void main(String args[]) {
         Aadd a = new Aadd();
         System.out.println(a.calculate(10, 30));
         System.out.println(a.calculate(10, 20, 30));
     }
 }
