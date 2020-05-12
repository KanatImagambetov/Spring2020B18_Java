package day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {
        SalaryCalculator ob1 = new SalaryCalculator(12, 40, 0.0, 0.12);
        SalaryCalculator ob2 = new SalaryCalculator(60, 39, 0.0, 0.0825);
        SalaryCalculator ob3 = new SalaryCalculator(45, 40, 0.1, 0.0825);

        System.out.println(ob1.netSalary());
        System.out.println(ob1);
        System.out.println("====================================");

        System.out.println(ob3);
    }
}
