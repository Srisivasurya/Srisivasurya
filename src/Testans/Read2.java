package Testans;

import java.io.FileReader;
import java.io.BufferedReader;

class Read2 {
    public static void main(String[] args) {
        char[] array = new char[100];

        try {
            FileReader file = new FileReader("surya1.txt");
            BufferedReader input = new BufferedReader(file);
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            file.close();
            input.close();

        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
