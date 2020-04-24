package day16_Forloop;

public class RemoveDupl {
    public static void main(String[] args) {
        String str="kanataaaansnxjadbhjahudqoidhalhalkjnalncla";

        String res="";

        for(int i=0; i<=str.length()-1; i++){

            /*
            if(!res.contains(""+str.charAt(i))){
            res+=str.charAt(i);
            }
             */
            if(res.contains(""+str.charAt(i))){
                continue;
            }
            res+=str.charAt(i);

        }

        System.out.println(res);


    }


}
