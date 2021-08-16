class stat {
    static int count = 0;

    stat() {
        count++;
    }
    public static void main(String arr[]) {
        stat t1 = new stat();
        stat t2 = new stat();
        System.out.println("Total " + count + " objects created");
    }
}