class Student{
    int rollno;
    String name;
    static String college = "ITS";
    static void change(){
        college = "BBDIT";
    }
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class Staticvm{
    public static void main(String args[]){
        Student.change();
        Student s1 = new Student(01,"Surya");
        Student s2 = new Student(02,"Prabhakar");
        Student s3 = new Student(03,"Sudalai Muthu");
        s1.display();
        s2.display();
        s3.display();
    }
}