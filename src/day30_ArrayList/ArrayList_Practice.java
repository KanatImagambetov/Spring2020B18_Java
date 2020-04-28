package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=1; i<=5; i++){
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Integer> reversedList = new ArrayList<>();
        for(int j=list.size()-1;j>=0;j--){
            int each=list.get(j);
 //           System.out.print(each+"  ");
            reversedList.add(each);
        }

    }
}
