package day41_Inheritance.Task01;

import day38_Constructors.SalaryCalculator;

public class Employee {
    public int salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString(){
        return "Name, "+ name+", JobTitle "+jobTitle+", Salary "+ salary+", ID "+id+", Gender "+gender;
    }
}
