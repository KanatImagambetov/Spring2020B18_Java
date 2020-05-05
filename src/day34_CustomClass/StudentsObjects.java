package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObjects {
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        Student student4=new Student();
        student1.setStudentInfo("Kanat","Kazakh",22,4.5,'M',true);
        student2.setStudentInfo("Gulya","American",34,4.0,'F',false);
        student3.setStudentInfo("Zhuldyz","Canadian",20,3.0,'F',false);
        student4.setStudentInfo("Sanzhar","British",30,3.50,'M',true);
        System.out.println(student1+"\n==============================="+student2);

        Student[] students={student1,student2,student3,student4};
        ArrayList<Student> canGraduate=new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p->p.gpa<=4.0);
  //      System.out.println(canGraduate.size());
        System.out.println("===============================");
        for(int i=0;i<canGraduate.size();i++){
            Student each=canGraduate.get(i);
            System.out.println(each.name+" can graduate");
        }

        ArrayList<Student> cantGraduate=new ArrayList<>(Arrays.asList(students));
        cantGraduate.removeIf(p->p.gpa>4.0);
        //      System.out.println(canGraduate.size());
        System.out.println("===============================");
        for(Student each:cantGraduate){
            System.out.println(each.name+" can NOT graduate");
        }
    }
}
