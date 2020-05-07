package day35_Static;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;

    public  void setInfo(String location, String company, double salary, boolean isFullTime) {
        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isFullTime=isFullTime;
    }
    public String toString(){
        return "Location of the job is "+location+
                "\nCompany name is "+company+
                "\nSalary is $"+salary+
                "\nIs it fulltime job "+isFullTime;
    }
}
