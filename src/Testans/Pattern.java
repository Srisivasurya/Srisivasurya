package Testans;

public class Pattern {
    public static void main(String args[]) {
        int rows=4;
        int k=0;
        for(int i=0;i<5;i++) {
            System.out.print("* ");
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int z= 5-1; z>=0 ; z--) {
                for (k = 0; k <= rows; k++) {
                    System.out.print("* ");
                }
                System.out.println();
                if (k == rows + 1) {
                    rows--;
                    break;
                }
            }

        }

    }
}
