class Finally {
    public static void main(String args[]) {
        int num[] = new int[10];
        try {
            System.out.println("Accessing the fifth element of the array:" + num[5]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown:" + e);
        }
        finally {
            num[2] = 0;
            System.out.println("The value of the third element of the array  is: " + num[0]);
            System.out.println("The finally always executes");
        }
    }
}