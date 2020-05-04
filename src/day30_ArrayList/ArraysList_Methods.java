package day30_ArrayList;

import java.util.ArrayList;

public class ArraysList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);

        list.add(1,6);
        list.add(4,9);
        System.out.println(list);

        list.set(3,9);

        System.out.println(list);

        int[] arr ={1,2,3,4};
        arr[3]=5;

        ArrayList<String> list1=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add(1,"C");
        list1.add(2,"D");

        list1.set(3,"F");
        list1.set(2,"E");

        System.out.println(list1);

        System.out.println("============================================");


        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(1); // 0

        list3.add(2); // 1

        list3.add(3); // 2

        list3.add(4); // 3



        /*

        // {1,2,3,4}

                int a =1;

              list3.remove(a);  // {1,3, 4}

              */







        // {1,2,3,4}

        Integer a = 1;

        list3.remove(a); //{2,3,4}



        System.out.println(list3);



        ArrayList<Integer> list4 = new ArrayList<>();

        list4.add(10);

        list4.add(20);

        list4.add(30);

        // {10, 20, 30}

        //          0    1   2



        // list4.remove(20); // index out of bound



        //  list4.remove(1);  //{10, 30}



        Integer a2 = 100;

        boolean r1 = list4.remove(a2);  // false



        System.out.println(list4);

        System.out.println(r1);











    }



}
