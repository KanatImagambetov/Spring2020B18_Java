package day14_StringClass;

public class Practice {
    public static void main(String[] args) {
        String gmail="cybertekschool@gmail.com";

        String userinput="CybertekSchool@gmail.com";

        boolean res=gmail.equalsIgnoreCase(userinput);

        if(res){
            System.out.println("Logged in");
        }

        String s1="Cybertek School";
        boolean s=s1.contains("School");

        System.out.println(s);

        System.out.println("=================================");

        /*
        valid password must contain a special character such as (!, _, $)
        vslid password shouldnt contain space
         */
        String Password="mmmda$1234";

        if(Password.contains(" ")||Password.contains("$")){
            System.out.println("Password cannot have space in it");
        }else{
            System.out.println("valid password");
        }

        String s3="United States";
        System.out.println(s3.startsWith("U"));

        System.out.println("=============================");

        String web="WWW.amazon.com";
        web=web.toLowerCase();

        if(web.startsWith("www.")){
            System.out.println("valid");
        }else{
            System.out.println("false");
        }

        String s4="Cybertek School";
        System.out.println(s4.endsWith("l"));
        System.out.println(s4.endsWith("Cybertek"));

        String email="CybertekSchool@yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid gmail");
        }else{
            System.out.println("Invalid gmail");
        }



    }
}
