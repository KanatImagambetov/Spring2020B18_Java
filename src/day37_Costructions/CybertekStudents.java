package day37_Costructions;

public class CybertekStudents {
    static String schoolName;
    //    static String schoolName="Cybertek School";
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch){
        schoolName="Cybertek University";
        this.batch=batch;
        this.groupNumber=groupNumber;
        this.studentName=studentName;
    }
    public String toString(){
        return "School Name: "+schoolName+"\nGroup Number: "+ groupNumber+"\nStudent Name: "+studentName+"\nBatch: "+batch;
    }
}
class CObject{
    public static void main(String[] args) {
        CybertekStudents student1=new CybertekStudents("Kanat", 123,"18");

        System.out.println(student1);
        System.out.println("========================================================");
        CybertekStudents student2=new CybertekStudents("Gjlya", 34,"18");
        student2.schoolName="Cybertek School";

        System.out.println(student2);

    }
}
