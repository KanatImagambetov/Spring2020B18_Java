package day16_Forloop;

public class repl9 {
    public static void main(String[] args) {

        String split="Yes";
        double NumberOfpeople=4;
        double CheckAmount=476;
        String ServiceQuality="Excellent";

        int num=0;
        if(split.equals("Yes")){
            num=ServiceQuality.equalsIgnoreCase("Poor") ? 5: (ServiceQuality.equals("Fair")) ? 10: (ServiceQuality.equals("Good")) ? 15: (ServiceQuality.equals("Great")) ? 20: (ServiceQuality.equals("Excellent")) ? 25: 0;
        }else{

        }

        String people="";

        if(split.equals("Yes")){
            people=(NumberOfpeople==1) ? "&": (NumberOfpeople==2) ? "&&": (NumberOfpeople==3) ? "&&&": (NumberOfpeople==4) ? "&&&&": (NumberOfpeople==5) ? "&&&&&": (NumberOfpeople==6) ? "&&&&&&": (NumberOfpeople==7) ? "&&&&&&&": (NumberOfpeople==8) ? "&&&&&&&&": (NumberOfpeople==9) ? "&&&&&&&&&": " ";
        }else{

        }
        double Totaltopay=(1.0+num/100.0)*CheckAmount;
        double Totaltip=num/100.0*CheckAmount;
        double Totalperperson=(1.0+num/100.0)*CheckAmount/NumberOfpeople;
        double Tipperperson=num/100.0*CheckAmount/NumberOfpeople;

        System.out.println("Number of people entered: "+people);
        System.out.println("Total to pay: "+Totaltopay);
        System.out.println("Total tip: "+Totaltip);
        System.out.println("Total per person: "+Totalperperson);
        System.out.println("Tip per person: "+Tipperperson);

    }
}
