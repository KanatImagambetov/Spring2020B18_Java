package day38_Constructors;

public class ConstructorCalls3 {
    public ConstructorCalls3(){
        this(1);
        System.out.println("default");
    }
    public ConstructorCalls3(int a){

        System.out.println("Int argument");
    }
    public ConstructorCalls3(String str){
        this();
        System.out.println("Int argument");
    }

    public static void main(String[] args) {
        new ConstructorCalls3();
    }
    public void method1(){

    }
}
