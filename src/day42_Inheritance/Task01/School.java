package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();

        student1.setStudentInfo("Kajnat",12,'F',1234, "Focal");
        student2.setStudentInfo("Dina",22,'F',456, "Splo");
        student3.setStudentInfo("Gulya",33,'F',234, "Soccer");

        ArrayList<Student> students=new ArrayList<>();
        students.addAll(Arrays.asList(student1, student2, student3));

        for(Student each:students){
            System.out.println("name" +each.name +" ID, "+each.studentId);
        }
    }
}
