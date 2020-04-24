package day09_Nested_Ternary;

public class warmup2 {
    public static void main(String[] args) {
        //DO NOT CHANGE:
//        Scanner input = new Scanner(System.in);

//        System.out.println("Enter age:");
        int age = 4;

        String res="";

        if(age<2){
            res="Enter: "+age+"\n"+"ineligible";
        }else if(age>=2 && age<=3){
            res="Enter: "+age+"\n"+"toddler";
        }else if(age>=4 && age<=5){
            res="Enter: "+age+"\n"+"early childhood";
        }else if(age>=6 && age<=7){
            res="Enter: "+age+"\n"+"young reader";
        }else if(age>=8 && age<=10){
            res="Enter: "+age+"\n"+"elementary";
        }else if(age>=11 && age<=12){
            res="Enter: "+age+"\n"+"middle";
        }else if(age>12 && age<=13){
            res="Enter: "+age+"\n"+"impossible";
        }else if(age>=14 && age<=16){
            res="Enter: "+age+"\n"+"high school";
        }else if(age>=17 && age<=18){
            res="Enter: "+age+"\n"+"scholar";
        }else if(age>18){
            res="Enter: "+age+"\n"+"ineligible";
        }else{
            res="invalid";
        }
        System.out.println(res);

        //WRITE YOUR CODE HERE




    }
}



