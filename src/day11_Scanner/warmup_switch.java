package day11_Scanner;
/*
write a program that can display the selected browser
                        1. declear a String variable called browserName

                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
 */
public class warmup_switch {
    public static void main(String[] args) {
        String browsername="Firefox";

        switch(browsername){
            case("Chrome"):
            case("chrome"):
                System.out.println("Open Chrome browser");
                break;
            case("Firefox"):
            case("firefox"):
                System.out.println("Open firefox browser");
                break;
            case("Opera"):
            case("opera"):
                System.out.println("Open opera browser");
                break;
            case("safari"):
            case("Safari"):
                System.out.println("Open safari browser");
                break;
            default:
                System.out.println("Invalid Browser Name");
                break;
        }



    }




}
