package day42_Inheritance;

class A{
    int a=100;
    public A(double b){

    }
}

public class SuperKeyword extends A {
    int a=200;
   public SuperKeyword(){
       super(3.0);
   }
}
