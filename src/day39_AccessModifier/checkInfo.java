package day39_AccessModifier;

public class checkInfo {
    public static void main(String[] args) {
        System.out.println(Student.gender+" "+Student.name);
    //    System.out.println(Student.grade);
        System.out.println(Student.age);
        Student ob1=new Student();
        System.out.println(ob1.name);
        System.out.println(ob1.age);

    }
}
