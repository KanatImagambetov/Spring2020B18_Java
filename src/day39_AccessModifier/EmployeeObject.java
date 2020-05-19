package day39_AccessModifier;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Kanat");
        System.out.println(employee1);
        System.out.println("===========================");
        Employee employee2=new Employee("Dina", "Senior Engineer", 1234, 100000);
        System.out.println(employee2);
        System.out.println("===========================");
        Employee employee3=new Employee("Dina", "Senior Engineer", 1234, 100000,'M');
        System.out.println(employee3);
        System.out.println("===========================");
    }
}
