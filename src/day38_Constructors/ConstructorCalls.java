package day38_Constructors;

public class ConstructorCalls {
    public ConstructorCalls(){
        method();
        method2();
    }
    public ConstructorCalls(int a){

    }
    public static void method(){
        method2();
//        ConstructorCalls();
    }
    public static void method2(){
        method();
    }
}
