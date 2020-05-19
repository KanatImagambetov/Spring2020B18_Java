package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {
        EmployeeInfo AB=new EmployeeInfo();
        AB.setAddress("Virginia");
        AB.setSalary(123444.3);

        System.out.println(AB.getAddress());
        System.out.println(AB.companyName);
        System.out.println(AB.getSalary());
    }
}
