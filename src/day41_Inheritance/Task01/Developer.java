package day41_Inheritance.Task01;

public class Developer extends Employee{
    public Developer(int salary, String name, long id, String jobTitle, char gender) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = "Busienss Analyst";
        this.gender = gender;
    }
    public void fixingBug(){
        System.out.println(name+" is fixing the bug");
    }
    public void coding(){
        System.out.println(name+" is testing");
    }
}
