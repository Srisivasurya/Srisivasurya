class Student{
    int rollno;
    String name;
    static String college = "SSS";

    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
class staticvm1{
    public static void main(String args[]){
        Student s1 = new Student(01,"S");
        Student s2 = new Student(02,"I");
        Student s3 = new Student(03,"R");
        s1.display();
        s2.display();
        s3.display();
    }
}