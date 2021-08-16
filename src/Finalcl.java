final class Finalcl {
    void showdata(){
        System.out.println("Final class");
    }
}
/*class Child extends Finalcl{
    void showdata(){
        System.out.println("Child class");
    }
}*/
class F{
    public static void main(String[] args){
        Finalcl o=new Finalcl();
        o.showdata();
    }
}