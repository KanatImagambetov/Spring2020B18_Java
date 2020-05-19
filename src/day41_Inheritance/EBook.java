package day41_Inheritance;

public class EBook extends Book{
    public String size;
    public int pages;
    public void readbook(){
        System.out.println("reading "+title);
    }
}
