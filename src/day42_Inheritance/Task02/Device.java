package day42_Inheritance.Task02;

public class Device {
    public String brand;
    public String model;
    public double price;
    public static String country="China";
    public String type;
    public String size;

    public void setDevice(String brand, String model, double price, String type, String size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;
        this.size=size;
    }
    public String toString() {
        return "Device" +", brand " + brand  +", model " + model  +
                ", price " + price +", type " + type + ", Country "+country;
    }
}
