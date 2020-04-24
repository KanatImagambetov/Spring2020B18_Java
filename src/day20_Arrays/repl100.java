import java.util.Scanner;
public class repl100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter guest name:");
        String name=input.next();
        String result="Guest's list: "+name;
        String result1="";

         while(true) {
            System.out.println("Do you want to enter new guest name:");
            String newguest=input.next();
            if (newguest.equalsIgnoreCase("yes")) {
                System.out.println("Please enter guest name:");
                String name1 = input.next();
                result1 += ", " + name1;
            }
            if (newguest.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println(result+result1);
    }
}
