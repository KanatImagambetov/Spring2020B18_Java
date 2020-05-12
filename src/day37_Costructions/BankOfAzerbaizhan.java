package day37_Costructions;

import java.util.ArrayList;

public class BankOfAzerbaizhan {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
