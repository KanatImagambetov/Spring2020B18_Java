package day35_Static;

public class StudentObj {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Mukhtar";
        System.out.println(student1);

        Student student2=new Student();
        student2.name="Kuzzat";
        System.out.println(student2);
        Student.printSchoolName();
        String s="03:22:22";
        String hour=s.substring(0,2);
        String minute=s.substring(3,5);
        String second=s.substring(6,8);
        System.out.println(hour+minute+second);

    }
}
