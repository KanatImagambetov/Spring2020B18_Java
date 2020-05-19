package day39_AccessModifier;

public class kll {
    public kll(){
        System.out.println("a");
    }
    public kll(int a){
        this(2.5);
        System.out.println("b");

    }
    public kll(double a){
        this();
        System.out.println("c");

    }
    public static void main(String[] args) {
        kll obj=new kll(100);
    }
}
