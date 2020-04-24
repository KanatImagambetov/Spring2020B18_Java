package day12_practice;

import java.util.Scanner;

/*
Screen size is equals to 13.3, add  $200, 15.0 - add  $300, 17.3 - add  $400.
CPU type equals to i3, add  $150 to i5, add  $250 to i7, add  $350 .
RAM size. Add  $50 for every 4GB of ram.
Storage type. SSD and HDD. HDD - add $50 for every 500gb.  SSD - add $100 for every 500GB.
Screen resolution. FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
 */
public class repl2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Select screen size: ");
        double ss=scan.nextDouble();

        System.out.println("Select CPU type: ");
        String cpu=scan.next();

        System.out.println("Select RAM size: ");
        int ram=scan.nextInt();

        System.out.println("Select storage type: ");
        String storage=scan.next();

        System.out.println("Select memory size: ");
        int msize=scan.nextInt();

        System.out.println("Select screen resolution: ");
        String screenres=scan.next();


        int ss1=(ss==13.3) ? 200: (ss==15.0) ? 300: (ss==17.3) ? 400: 0;
        //===========================
        int cpu1=(cpu.equals("i3")) ? 150:(cpu.equals("i5")) ? 250: (cpu.equals("i7")) ? 350: 0;
//===============================================
        int ram1=ram/4*50;
//===============================================
        int storage1= (storage.equals("HDD")) ? msize/500*50: (storage.equals("SSD")) ? msize/500*100: 0;
//================================================
        int sres= (screenres.equals("FULLHD")) ? 100: (screenres.equals("4K")) ? 200: -100000;

        System.out.println("Laptop price is: $"+(ss1+cpu1+ram1+storage1+sres));

    }



}