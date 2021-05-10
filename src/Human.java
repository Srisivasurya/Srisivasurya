public class Human {
    public int legCount;
    public int handcount;
    public void display2() {
        System.out.println("I am a Human.");
        System.out.println("I have " + legCount + " legs.");
        System.out.println("I have " + handcount + " hands.");
    }
}
class Display2 {
    public static void main( String[] args ) {
        Human human = new Human();
        human.legCount = 2;
        human.handcount=2;
        human.display2();
    }
}