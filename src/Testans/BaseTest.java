package Testans;

public class BaseTest implements Interface1 , Interface2 {

    @Override
    public void test1() {
        System.out.println("This is test1");
    }

    @Override
    public void test2() {
        System.out.println("This is test2");
    }
}
