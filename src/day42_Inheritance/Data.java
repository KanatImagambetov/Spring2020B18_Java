package day42_Inheritance;

import Resources.Inheritance;

public class Data {
    public static String publicData="public";
    protected static String protectedDAta="protected";
    static String defaultData="defaults";
    private String privateData="private";

}
class testing extends Data{
    public static void main(String[] args) {
        System.out.println(testing.publicData);
        System.out.println(testing.protectedDAta);
        System.out.println(testing.defaultData);
      //  System.out.println(testing.privateData);
    }
}
