package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(2000);
        list.add(400);
        list.add(50);
        list.add(1000);
        list.add(-3222);
        list.add(950);
        System.out.println(list);
        int max=list.get(0);
   //     int max=Integer.MIN_VALUE;
        for(int each:list){
            if(each>max){
                max=each;
            }
        }
        System.out.println(max);

             int max1=Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max1){
                max1=list.get(i);
            }
        }
        System.out.println(max1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        System.out.println(max(list2));
    }

    public static int max(ArrayList<Integer> arr) {
        int max1=Integer.MIN_VALUE;

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>max1){
                max1=arr.get(i);
            }
        }
        return  max1;
    }
}
