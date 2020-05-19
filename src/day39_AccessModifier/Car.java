package day39_AccessModifier;

public class Car {
    String brand;
    String model;
    int year;
    double price;
    public Car(String brand){
        this.brand=brand;
//        this.model=model;
//        this.year=year;
//        this.price=price;
    }
    public Car(String brand, String model){
//        this.Brand=Brand;
        this(brand);
        this.model=model;
//        this.year=year;
//        this.price=price;
    }
    public Car(String brand, String model, int year){
         this(brand, model);
         this.year=year;
//        this.price=price;
    }
    public Car(String brand, String model, int year, double price){
        this(brand, model, year);
 //       this.year=year;
        this.price=price;
    }
    public String toString(){
        return "Brand "+brand+"\nYear " +year+"\nModel " +model+"\nPrice "+price;
    }
}
