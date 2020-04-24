package day16_Forloop;
import java.util.Scanner;
public class repl10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Select screen size: ");
        double screensize=scan.nextDouble();
        System.out.println("Select CPU type: ");
        String cpu=scan.next();
        System.out.println("Select RAM size: ");
        int ram=scan.nextInt();
        System.out.println("Select storage type: ");
        String storageType=scan.next();
        System.out.println("Select memory size: ");
        int memorysize=scan.nextInt();
        System.out.println("Select screen resolution: ");
        String screenType=scan.next();
 //       double price = 0;
 //       String storageType, screenType, cpu;
 //       int ram = 0 ;

 /*
     String screenType="4K";
     String cpu="i3";
     int ram=8;
     String storageType="HDD";
     double screensize=13.3;
     int memorysize=500;

 */


    double ss1=(screensize==13.3) ? 200: (screensize==15.0) ? 300: (screensize==17.3) ? 400: 0;
    //==========================
    double cpu1=(cpu.equals("i3")) ? 150:(cpu.equals("i5")) ? 250: (cpu.equals("i7")) ? 350: 0;
    //===============================================
    double ram1=ram/4*50;
    //===============================================
    double storage1= (storageType.equals("HDD")) ? memorysize/500*50: (storageType.equals("SSD")) ? memorysize/500*100: 0;
    //================================================
    double sres= (screenType.equals("FULLHD")) ? 100: (screenType.equals("4K")) ? 200: 0;

    System.out.println("Laptop price is: $"+(ss1+cpu1+ram1+storage1+sres));
    }



}
