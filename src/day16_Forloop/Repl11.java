package day16_Forloop;

public class Repl11<backyard1> {
    public static void main(String[] args) {

    String houseType="Single Family Home";
    int numberOfBedrooms=10;
    boolean garage=true;
    int garageSpots=11;
    boolean backyard=true;
    boolean smoking=false;
    float metroAccessibility=1.0f;
    float schoolScore=1.0f;
    float highwayAccessibility=1.0f;

    //Condo = 50000,  for Townhouse = 75000, Single Family Home = 95000
        System.out.println("Enter your property:");
        System.out.println(houseType);
        System.out.println("How many bedrooms do you have?");
        System.out.println(numberOfBedrooms);
        System.out.println("Do you have a backyard?");
        System.out.println(backyard);

        if(houseType=="Condo"){
            System.out.println("Backyard is not available for condo!");
        }else{
        }
        System.out.println("Do you have garage?");
        System.out.println(garage);
        System.out.println("How many spots?");
        System.out.println(garageSpots);
        if(garageSpots>10){
            System.out.println("Pardon, it's not a public parking!");
        }else{
        }
        System.out.println("How close is metro station?");
        System.out.println(metroAccessibility);
        System.out.println("How close is highway?");
        System.out.println(highwayAccessibility);
        System.out.println("What's the rating of nearest school?");
        System.out.println(schoolScore);
        System.out.println("Does any of your family members smoking?");
        System.out.println(smoking);
//=================================================
        int houseType1=0;
        if(houseType=="Condo"){
            houseType1=50000;
        }else if(houseType.equalsIgnoreCase("Townhouse")){
            houseType1=75000;
        }else if(houseType=="Single Family Home"){
            houseType1=95000;
        }else{
            houseType1=0;
        }
//====================================
        int numberOfBedrooms1=numberOfBedrooms*30000;

        int backyard1=(houseType.equalsIgnoreCase("Condo") || !backyard) ? 0 : 5000;

        int garage1=(garage && garageSpots<=10) ? (20000*garageSpots): 0;
//====================================
        int metroAccessibility1=0;
        if(metroAccessibility<=1.0) {
            metroAccessibility1=10000;
        }else if(metroAccessibility>1.0 && metroAccessibility<=3.0) {
            metroAccessibility1=5000;
        }else {
            metroAccessibility1=0;
        }
//====================================
        int schoolScore1=0;
        if(schoolScore>=8.0 && schoolScore<=10.0) {
            schoolScore1=45000;
        }else if(schoolScore>=4.0 && schoolScore<8.0) {
            schoolScore1=20000;
        }else{
            schoolScore1=5000;
        }
//====================================
        int highwayAccessibility1=0;
        if(highwayAccessibility<=1.0) {
            highwayAccessibility1=15000;
        }else if(highwayAccessibility>1.0 && highwayAccessibility<=5.0) {
            highwayAccessibility1=8000;
        }else if(highwayAccessibility>5.0 && highwayAccessibility<=20.0) {
            highwayAccessibility1 = 4000;
        }else{
            highwayAccessibility1=0;
        }
//====================================
        int smoking1=(smoking) ? -5000: 0;
//====================================
        int Price=(schoolScore1+houseType1+numberOfBedrooms1+backyard1+garage1+metroAccessibility1+smoking1+highwayAccessibility1);
//====================================
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+Price+"$");
    }
}