package day42_Inheritance.Task01;

public class Company {
    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

static{
    employee1=new Employee();
    employee1.setEmployeeInfo("KAnat",32,'M',140, 1223,"Fulltime");

    employee2=new Employee();
    employee2.setEmployeeInfo("KAnat",32,'M',140, 1223,"Fulltime");

    employee3=new Employee();
    employee3.setEmployeeInfo("KAnat",32,'M',140, 1223,"Fulltime");
}

    public static void main(String[] args) {
        Employee[] employees={employee1,employee2,employee3};

        for (int i=0; i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }
}
