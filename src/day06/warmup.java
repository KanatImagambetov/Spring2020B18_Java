package day06;

public class warmup {
    public static void main(String[] args) {

        double numgallon=5;
        double gallom=3.785;
        double litter=1/gallom;

        String result=numgallon + " gallon " + " is equal to " + gallom*numgallon +" litter ";
        //System.out.println(litter*numgallon + "  litters");
        System.out.println(result);
        System.out.println("============================================");

        int a=200;
        int b=-a++ + - --a*a--%2;
        //     -200 + -200*0;
        System.out.println(b);
        System.out.println(a);
        System.out.println("++++++++++++++++++++++++++++++++");

        int x=300;
        int y=400;
        int z=x + y - x * y + x / y;
        System.out.println(z);




    }



}
