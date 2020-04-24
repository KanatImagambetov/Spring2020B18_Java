package day14_StringClass;

public class webAddressValidation {
    public static void main(String[] args) {
        String web="www.cybertek.Gov";
        web=web.toLowerCase();

        if(web.startsWith("www.")){
            if(web.endsWith(".com") || web.endsWith(".Gov") || web.endsWith(".edu")){
                System.out.println("Valid address");
            }else{
                System.out.println("indaliv");
            }
        }else {
            System.out.println("Invalid address");
        }

    }

}
