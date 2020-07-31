package day43_MethodOverriding;

class Test{
public void method(){
    System.out.println("Onur");
     }
}
public class MethodOVerriding extends Test{
  //  @Override
    public MethodOVerriding(){

    }
    public void method(){
        System.out.println("Zarina");
    }
    public static void main(String[] args) {
        Test o1=new Test();
        o1.method();
        MethodOVerriding o2=new MethodOVerriding();
        o2.method();
    }
}
