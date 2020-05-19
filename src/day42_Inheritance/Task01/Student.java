package day42_Inheritance.Task01;

public class Student extends Person{
    public long studentId;
    public String clazz;
    public String schoolName="Cybertek";

    public void setStudentInfo(String name, int age, char gender, long studentId, String clazz){
        setPErsonInfo(name, age, gender);
        this.studentId=studentId;
        this.clazz=clazz;
    }
    public void attendClass(){
        System.out.println(name+" is attending "+clazz);
    }
    public void code(){
        System.out.println(name+" is coding");
    }
    public String toString() {
        return "Student{" +"studentId=" + studentId +", clazz='" + clazz + '\'' +
                ", name='" + name + '\'' +", age=" + age +", gender=" + gender +"School "+schoolName+'}';
    }
}
