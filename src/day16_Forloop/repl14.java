package day16_Forloop;

import java.util.Scanner;

public class repl14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your property:");
        String house=scan.nextLine();
        System.out.println("How many bedrooms do you have?");
        int bedrooms=scan.nextInt();
        System.out.println("Do you have a backyard?");
        boolean backyardS=scan.nextBoolean();

        if(house.equalsIgnoreCase("Condo")){
            System.out.println("Backyard is not available for condo!");
        }else{
        }

        System.out.println("Do you have garage?");
        boolean garageS=scan.nextBoolean();
        System.out.println("How many spots?");
        int garageSpotsS=scan.nextInt();
        if(garageSpotsS>10){
            System.out.println("Pardon, it's not a public parking!");
        }else{
        }
        System.out.println("How close is metro station?");
        double metroAccessibilityS=scan.nextDouble();
        System.out.println("How close is highway?");
        double highwayAccessibilityS=scan.nextDouble();
        System.out.println("What's the rating of nearest school?");
        double schoolScoreS=scan.nextDouble();
        System.out.println("Does any of your family members smoking?");
        boolean smokingS=scan.nextBoolean();
//=================================================
        int house1=0;
        if(house.equalsIgnoreCase("Condo")){
            house1=50000;
        }else if(house.equalsIgnoreCase("Townhouse")){
            house1=75000;
        }else if(house.equalsIgnoreCase("Single Family Home")){
            house1=95000;
        }else{
            house1=0;
        }
//====================================
        int numberOfBedrooms1=bedrooms*30000;

        int backyard1=(house.equalsIgnoreCase("Condo") || !backyardS) ? 0 : 5000;

        int garage1=(garageS && garageSpotsS<=10) ? (20000*garageSpotsS): 0;
//====================================
        int metroAccessibility1=0;
        if(metroAccessibilityS<=1.0) {
            metroAccessibility1=10000;
        }else if(metroAccessibilityS>1.0 && metroAccessibilityS<=3.0) {
            metroAccessibility1=5000;
        }else {
            metroAccessibility1=0;
        }
//====================================
        int schoolScore1=0;
        if(schoolScoreS>=8.0 && schoolScoreS<=10.0) {
            schoolScore1=45000;
        }else if(schoolScoreS>=4.0 && schoolScoreS<8.0) {
            schoolScore1=20000;
        }else{
            schoolScore1=5000;
        }
//====================================
        int highwayAccessibility1=0;
        if(highwayAccessibilityS<=1.0) {
            highwayAccessibility1=15000;
        }else if(highwayAccessibilityS>1.0 && highwayAccessibilityS<=5.0) {
            highwayAccessibility1=8000;
        }else if(highwayAccessibilityS>5.0 && highwayAccessibilityS<=20.0) {
            highwayAccessibility1 = 4000;
        }else{
            highwayAccessibility1=0;
        }
//====================================
        int smoking1=(smokingS) ? -5000: 0;
//====================================
        int Price=(schoolScore1+house1+numberOfBedrooms1+backyard1+garage1+metroAccessibility1+smoking1+highwayAccessibility1);
//====================================
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+Price+"$");
    }
}


