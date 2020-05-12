package day37_Costructions;

public class Employee {
    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, long id, long ssn, String jobTitle, double salary, char gender){
        name=name;
        id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }
    public String toString(){
        return "Name is "+name+
                " ID is "+id+
                " SSN is "+ssn+
                " Job Title is "+ jobTitle+
                " Salary is "+salary+
                " Gender is "+gender;
    }
}
