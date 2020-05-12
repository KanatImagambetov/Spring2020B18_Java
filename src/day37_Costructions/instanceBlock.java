package day37_Costructions;

public class instanceBlock {

    {System.out.println("instance block1");}
    public static void main(String[] args) {
        instanceBlock obj=new instanceBlock();
        instanceBlock obj1=new instanceBlock();
    }
    {System.out.println("instance block2");}
    static {
        System.out.println("static block");
    }
}
