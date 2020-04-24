package day17_loop;

public class finra {
    public static void main(String[] args) {
 /*
 3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number

		Ex:
			1 2 FIN 4 RA FIND .... FINDRA
*/

 String res="";
            for(int i=1; i<=30; i++){
               if(i%3==0&&i%5==0){
//                   System.out.println(i+" FINRA");
                   res+="FINRA ";

               }else if(i%3==0){
 //                  System.out.println(i+" FIN");
                   res+="FIN ";
               }else if(i%5==0){
//                   System.out.println(i+" RA");
                   res+="RA ";
               }else{
//                   System.out.println(i);
                   res+=i+" ";
               }
           }
        System.out.println(res);












    }

}
