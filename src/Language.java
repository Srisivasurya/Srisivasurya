class Language {
    public void displayInfo() {
        System.out.println("Common English Language");
    }
}

class Java extends Language {
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }
}
class Display {
    public static void main(String[] args) {
        Java j1 = new Java();
        j1.displayInfo();
        Language l1 = new Language();
        l1.displayInfo();
    }
}
