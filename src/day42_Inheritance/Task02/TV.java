package day42_Inheritance.Task02;

public class TV extends Device{
    public TV(String brand, String model, double price, String type, String size){
    setDevice(brand, model, price, "TV", size);
    }
    public void watch(){

        System.out.println("I am watching "+brand+" "+model+" "+price+" "+type+" "+size);
    }
}
