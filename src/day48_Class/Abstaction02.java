package day48_Class;
interface  A1{
void method();
}
interface  B1{
abstract void method1();
}
interface  C1{
    abstract void method2();
}
public class Abstaction02 implements A1, B1, C1{
    @Override
    public void method() {
   }

    @Override
    public void method1() {
   }

    @Override
    public void method2() {
   }
}
