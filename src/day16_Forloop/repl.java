package day16_Forloop;

public class repl {
    public static void main(String[] args) {

        String phoneNumber="weqq<dfdfdfsdsd>.wew";
        String sender="qwqwq: [2dvdd3232342]ppwedw";
        String messageBody="wewqe. {dfs23232dsd}:qeq";

        String a1=""+sender+phoneNumber+messageBody;

        String s1=a1.substring(a1.indexOf("<")+1, a1.indexOf(">"));
        String p1=a1.substring(a1.indexOf("[")+1, a1.indexOf("]"));
        String m1=a1.substring(a1.indexOf("{")+1, a1.indexOf("}"));

        System.out.println("Sender: "+s1);
        System.out.println("Phone Number: "+p1);
        System.out.println("Message body: "+m1);



    }
}