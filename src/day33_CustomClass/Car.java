package day33_CustomClass;

public class Car {
    String Brand;
    String model;
    int year;
    String color;

    public void start() {
        System.out.println(Brand + " is started");
    }
    public void drive() {
        System.out.println("Driving "+Brand+" "+model);
    }
    public void getCarInfo() {
        System.out.println("Brand of the car "+Brand);
        System.out.println("Model of the car is "+model+" "+year);

    }
    public void setCarInfo(String carBrand, String carmodel, int caryear, String carcolor) {
        Brand=carBrand;
        year=caryear;
        model=carmodel;
        color=carcolor;
    }
    public String toString(){
        String res=year+" "+Brand+" "+model+" "+color;
        return res;
    }
}







