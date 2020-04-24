package day16_Forloop;

import java.util.Scanner;

public class Repl17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
 //       scan.nextLine();
        String fullname=scan.nextLine();
//========================================================
        System.out.println("Do you have a US driver license?");
        String USlicense=scan.next();
        if(USlicense.equalsIgnoreCase("No")){
            System.out.println("Invalid data!");
            System.exit(0);
        }
//========================================================
        System.out.println("Enter your zip code");
        int zip=scan.nextInt();

        double price=0;
        if(zip==20910||zip==20740){
            price+=60;
        }else if(zip==22102||zip==22103){
            price+=30;
        }else{
            price+=50;
        }
//========================================================
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        String ofl=scan.next();
        if(ofl.equalsIgnoreCase("Owned")){
            price+=10;
        }else{
            price+=20;
        }
//=========================================================
        System.out.println("How is this vehicle primarily used?");
        String primary=scan.next();
        if(primary.equalsIgnoreCase("Business")){
            price+=50;
        }else if(primary.equalsIgnoreCase("Pleasure")){
            price+=10;
        }else if(primary.equalsIgnoreCase("Commute")){
            System.out.println("Days Driven To Work And/Or School");
            int days=scan.nextInt();
            System.out.println("Miles Driven To Work And/Or School");
            int miles=scan.nextInt();
            price+=(20+5*days+1*miles);
        }else{
        }
    //=====================================================
        System.out.println("How old are you?");
        int age=scan.nextInt();

        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if(age>=16&&age<18){
            price*=20;
        }else if(age>=18&&age<=21){
            price*=6;
        }else if(age>21&&age<25){
            price*=2;
        }else if (age>=25){
            price+=0;
        }
    //================================================
        System.out.println("How many years you've been driving?");
        int driving=scan.nextInt();
        if(driving>0&&(age-driving)>=16){
            price-=(5*driving);
        }else{
            System.out.println("Invalid data!");
            System.exit(0);
        }
   //====================================================
        System.out.println("Have you had any accidents in the last 5 years?");
        String accidents=scan.next();
        if(accidents.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int accidentNum=scan.nextInt();
            double calaccidentNum=(price*20/100*accidentNum);
            price+=calaccidentNum;
        }else{
        }

   //====================================================
        System.out.println("Have you had continuous insurance for the past 12 months?");
        String insurance=scan.next();
        if(insurance.equalsIgnoreCase("no")){
            price*=2;
        }else{
        }
  //==================================================================
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String heducation=scan.nextLine();
        if(heducation.equalsIgnoreCase("PhD")||heducation.equalsIgnoreCase("Masters")||heducation.equalsIgnoreCase("Bachelors")){
            price*=0.95;
        }else if(heducation.equalsIgnoreCase("Doctors")){
            price*=0.9;
        }else if (heducation.equalsIgnoreCase("Less than High School")) {
            price *= 1.05;
        }
            //=========================================================
        String fname="";
        if(fullname.contains(" ")) {
            fname = fullname.substring(0, fullname.indexOf(" "));
        }else{
            fname=fullname;
        }

        //===============================================================
        System.out.println(fname+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+price);
        String education2 = heducation.replace(" ","").toUpperCase();

//        String ref=name.substring(0,2).toUpperCase()+age+fname.substring(fname.length()-2).toUpperCase()+zip+education.toUpperCase();



        String ref="";
        if(fullname.contains(" ")) {
             ref = fullname.substring(0, 2).toUpperCase() + age + fname.substring(fname.length() - 2).toUpperCase() + zip + education2;
              }else{
             ref = fullname.substring(0, 2).toUpperCase() + age + fname.substring(fullname.length() - 2).toUpperCase() + zip + education2;
        }


        System.out.println("Reference number: "+ref);


        }
    }


