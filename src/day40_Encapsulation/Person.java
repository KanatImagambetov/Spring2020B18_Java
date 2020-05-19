package day40_Encapsulation;

public class Person {
    private long SSN;
    private long ID;
    public String name;

    public Person(String name){
        this.name=name;
    }
    public long getSSN(){
        return SSN;
    }
    public void setSSN(long SSN){
        this.SSN=SSN;
    }
    public long getID(){
        return SSN;
    }
    public void setID(long ID){
        this.ID=ID;
    }
    public void setIDandSSN(long ID, long SSN){
        this.ID=ID;
        this.SSN=SSN;

    }
}
