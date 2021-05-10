class Data
{
    private int stuID;
    private String stuName;
    private int stuAge;
    Data()
    {
        stuID = 100;
        stuName = "New Student";
        stuAge = 18;
    }
    Data(int num1, String str, int num2)
    {
        stuID = num1;
        stuName = str;
        stuAge = num2;
    }
    public int getStuID() {
        return stuID;
    }
    public void setStuID(int stuID) {
        this.stuID = stuID;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public int getStuAge() {
        return stuAge;
    }
    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public static void main(String args[])
    {
        Data myobj = new Data();
        System.out.println("Student Name is: "+myobj.getStuName());
        System.out.println("Student Age is: "+myobj.getStuAge());
        System.out.println("Student ID is: "+myobj.getStuID());


        Data myobj2 = new Data(555, "Chaitanya", 25);
        System.out.println("Student Name is: "+myobj2.getStuName());
        System.out.println("Student Age is: "+myobj2.getStuAge());
        System.out.println("Student ID is: "+myobj2.getStuID());
    }
}