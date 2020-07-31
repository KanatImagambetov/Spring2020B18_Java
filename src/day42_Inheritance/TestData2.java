package day42_Inheritance;

public class TestData2 extends AccessModifiers{
    public static void main(String[] args) {
        System.out.println(TestData2.publicVariables);
        System.out.println(TestData2.protectedVariables);
        System.out.println(TestData2.defaultVariables);

        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();


    }
}
