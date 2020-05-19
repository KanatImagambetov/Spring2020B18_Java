package day41_Inheritance.Task01;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(int salary, String name, long id, String jobTitle, char gender) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }
    public void writingReg(){
        System.out.println(name+" writing requerements");
    }
    public void gathering(){
        System.out.println(name+" is gathering documents");
    }

}
