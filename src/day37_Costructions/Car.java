package day37_Costructions;

public class Car {
    String Brand;
    String model;
    String year;
    double price;
    public Car(String Brand, String model, String year, double price){
        this.Brand=Brand;
        this.model=model;
        this.year=year;
        this.price=price;
    }
        public String toString(){
            return year+" year \n"+ Brand+" Brand\n"+model+" \n$"+price;
    }
}
