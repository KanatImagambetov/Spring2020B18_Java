package day24_Methods;

public class repl {
    public static void main(String[] args) {
        String model="Extra vagant";
        int year=2015;
        String res="";
            //2010-2012
        //================================================================
        if(model.equals("Guzzler")) {
            for (int i = 2010; i <= 2012; i++) {
                if (year == i && model.equals("Guzzler")) {
                    res = "true";
                    break;
                } else {
                    res = "false";
                }
            }
            System.out.println(res);
        }else if(model.equals("Extravagant")) {
            for (int i = 2015; i <= 2018; i++) {
                if (year == i && model.equals("Extravagant")) {
                    res = "true";
                    break;
                } else {
                    res = "false";
                }
            }
            System.out.println(res);
        }else{
            System.out.println(false);
        }
        //==================================================================
        }
    }

