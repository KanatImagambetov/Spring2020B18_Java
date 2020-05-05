package day34_CustomClass;

public class warmup {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    public double calcCost(){
        double total=(width+length)*unitPrice;
        if(isPersian){
            return  total+200;
        }else {
            return total;
        }
    }
    public void customOrder(double CarpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersian){
        width=CarpetWidth;
        length=carpetLength;
        unitPrice=carpetUnitPrice;
        isPersian=carpetPersian;
    }
    public String toString(){
        return "width: "+width+
                "\nlength: "+length+
                "\nunitPrice: $"+unitPrice+
                "\ncosts: $"+calcCost();
    }
}
