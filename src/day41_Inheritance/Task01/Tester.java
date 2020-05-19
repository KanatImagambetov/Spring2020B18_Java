package day41_Inheritance.Task01;

public class Tester extends Employee {
    public void reporting(){
        System.out.println(name+" is reporting");
    }
    public void testing(){
        System.out.println(name+" is testing");
    }
    public Tester(int salary, String name, long id, String jobTitle, char gender) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

}
