package day12_practice;

public class SwitchPractice {
    public static void main(String[] args) {


        switch(3){
            default:
                System.out.println("invalid");
                break;
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
 //               break;

 //               break;
        }
        System.out.println("==========================================================");

        int st=5000;
        String resulkt="";
        switch(st){
            case 200:
                resulkt="OK";
                break;
            case 201:
                resulkt="Created";
                break;
            case 202:
                resulkt="Accepted";
                break;
            default:
                resulkt="invalid";
                break;
        }
        System.out.println(resulkt);


    }

}
