package day16_Forloop;

import java.util.Scanner;

public class repl15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Select screen size:");
        double screensize=scan.nextDouble();
        System.out.println("Select CPU type:");
        String cp=scan.next();
        System.out.println("Select RAM size:");
        int rm=scan.nextInt();
        System.out.println("Select storage type:");
        String storageT=scan.next();
        System.out.println("Enter memory size:");
        int memorysize=scan.nextInt();
        System.out.println("Enter screen resolution:");
        String screenT=scan.next();

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
        double cp1=(cp.equalsIgnoreCase("i3")) ? 150 : (cp.equalsIgnoreCase("i5")) ? 250: (cp.equalsIgnoreCase("i7")) ? 350: 0;
        //===============================================
        double rm1=rm/4*50;
        //===============================================
        double storage1= storageT.equals("HDD") ? (memorysize/500*50): storageT.equals("SSD") ? (memorysize/500*100): 0;
        //================================================
        double sres= screenT.equals("FULLHD") ? 100: screenT.equals("4K") ? 200: 0;

        System.out.println("Laptop price is: $"+(ss1+cp1+rm1+storage1+sres));
    }



}

