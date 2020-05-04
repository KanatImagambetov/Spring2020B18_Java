package day32_Predicate;

public class repl18 {
    public static void main(String[] args) {

    }

    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1, int ingredient2, int ingredient3){
        boolean a=available==true;
        boolean b=gift==true;
        int sum=ingredient1+ingredient2+ingredient3;
        boolean c1=ingredient1==1||ingredient2==1||ingredient3==1;
        boolean c2=ingredient1==2||ingredient2==2||ingredient3==2;
        boolean c3=ingredient1==3||ingredient2==3||ingredient3==3;
        boolean c=c1==true&&c2==true&&c3==true&&sum==6;

        boolean n=a==true||b==true||c==true;

        return n;
    }
}
