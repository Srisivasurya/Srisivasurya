package Testans;

public class Test {
    public static void main(String args[]) {
        Bbase1 b1 = new Bbase1();
        Bbase2 b2 = new Bbase2();

        Demo base[] = {b1,b2};
        for (Demo s :base ) {
            s.sample("Instance of b1 and b2");

        }

    }
}
