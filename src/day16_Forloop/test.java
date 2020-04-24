package day16_Forloop;
public class test {
    public static void main(String[] args) {
        String email = "kanatimagam@gmail.com";
//        int num = email.indexOf("_");
//        System.out.print(num);
        String fname = email.substring(0, email.indexOf("_"));
        String lname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String ename = email.substring(email.indexOf("@"));

 //       if(Password.contains(" ")||Password.contains("$")){
        String res="";
        if(email.contains("_")||email.contains("$")){
            res=lname + "_" + fname + ename;
        }else{
            res=""+email;
        }
        System.out.println(res);


    }

}





