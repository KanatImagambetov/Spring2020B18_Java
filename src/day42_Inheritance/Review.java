package day42_Inheritance;
class B{
    public B(int a){
        System.out.println("int");
    }
    public B(double a){
        System.out.println("double");
    }
    public B(long a){
        System.out.println("long");
    }
}
public class Review extends B{
    public Review (String a) {
        super(19l);
        System.out.println("String");
    }
    public static void main(String[] args) {
        Review ob=new Review("Hello");
    }
}
