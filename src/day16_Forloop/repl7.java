package day16_Forloop;

//import java.util.Scanner;

public class repl7 {
    public static void main(String[] args) {
 //       Scanner scan = new Scanner(System.in);
        /*
        <Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
         */
        String sender = "<Mike Smith>";
        String phoneNumber = "From Number:[202-123-3456]";
        String messageBody = "Message:{I love programing and problem solving}";

        String a1 = "" + sender + phoneNumber + messageBody;

        String s1 = a1.substring(a1.indexOf("<") + 1, a1.indexOf(">"));
        String p1 = a1.substring(a1.indexOf("[") + 1, a1.indexOf("]"));
        String m1 = a1.substring(a1.indexOf("{") + 1, a1.indexOf("}"));

        System.out.println("Sender: " + s1);
        System.out.println("Phone Number: " + p1);
        System.out.println("Message body: " + m1);

    }

}

