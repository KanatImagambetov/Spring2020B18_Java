package day40_Encapsulation;

public class PersonObj {
    public static void main(String[] args) {
        Person Zarina=new Person("Zarina");
        System.out.println(Zarina.name);
     //   System.out.println(Zarina.getSSN());
    Zarina.setSSN(12345);
        System.out.println("Zarina "+Zarina.getSSN());
     //   System.out.println(Zarina.setIDandSSN(););
        Zarina.setID(344);
        System.out.println(Zarina.getID());

    }
}
