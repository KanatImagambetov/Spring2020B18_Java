package day20_Arrays;

import java.util.Scanner;

public class repl12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String start=scan.next();
        String end=scan.next();

        char l1=start.charAt(0);
        char l2=end.charAt(0);

        String res="";
        boolean res1=l1<l2;
        boolean res2=l1==l2;


        if(res2){
            System.out.println(l1+" found");
            System.exit(0);
        }else if(res1) {
            for (int i = l1; i <= l2 - 1; i++) {
                res += i + " ";
            }
            res=res.replace("65", "right > ");//A
            res = res.replace("66", "down > ");//B
            res = res.replace("67", "left > ");//C
            res = res.replace("68", "up > ");//D
            res=res+": found "+l2;
            res=res.replace(" >  :", ":");
            System.out.println(res);
        }else if(!res1){
            for (int i = l1; i <= 68; i++) {
                res += i + " ";
            }

            res=res.replace("65", "right > ");//A
            res = res.replace("66", "down > ");//B
            res = res.replace("67", "left > ");//C
            res = res.replace("68", "up > ");//D
            res=res.replace(" >  :", ":");

            String re="";
            for (int i = 65; i <= l2-1; i++) {
                re += i + " ";
            }
            re= re.replace("65", "right > ");//A
            re= re.replace("66", "down > ");//B
            re= re.replace("67", "left > ");//C
            re= re.replace("68", "up > ");//D

            res=res+re+": found "+l2;
            res=res.replace(" >  :", ":");
            System.out.println(res);
        }
    }
}
