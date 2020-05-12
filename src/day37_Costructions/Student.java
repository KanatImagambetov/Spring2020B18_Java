package day37_Costructions;

public class Student {
    String name;
    int age;
    char gender;
    String university;
    public Student(String name, int age, char gender, String university){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.university=university;
    }

    public void setInfo(String name, int age, char gender, String university){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.university=university;
    }
    public String toString(){
        return "Name is "+name+"\nage is "+age+"\ngender is "+gender+"\nUniver is "+university;
    }
}
