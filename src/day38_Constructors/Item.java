package day38_Constructors;

public class Item {
    String name;
    double unitPrice;
    int quntity;
    public Item(String name, double unitPrice, int quntity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quntity=quntity;
    }
    public double calcCost(){
        return unitPrice*quntity;
    }
    public String toString(){
        return "Item is "+name+": Unit Price of Item is $"+unitPrice+": Quantity is "+quntity+": Total cost of Item $"+calcCost();
    }
}
