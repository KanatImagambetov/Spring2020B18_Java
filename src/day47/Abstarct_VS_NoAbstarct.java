package day47;

abstract class A{
    public abstract void method1();
    public void method2(){}

}

public  class Abstarct_VS_NoAbstarct extends A{
@Override
public void method1(){}
}

abstract class B extends A{

}
class C extends B{
    public void method1(){}
}
