package Testans;

public class Spattern {
    public static void main(String args[]) {
        for(int i = 0; i < 5 ; i++ ) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
                for(int x = 0; x < 5 ; x++ ) {
                    for (int y = x; y < 5; y++) {
                        System.out.print(" * ");

                    }
                    System.out.println(" * ");
                }
            }
            System.out.println(" * ");
        }

    }
}

