package day47;

public class driverObjects {
    public static void main(String[] args) {
        String URL="https://www.google.com";
        ChromeDriver ob=new ChromeDriver();
        ob.get(URL);
        ob.quit();
        System.out.println("====================================");
        FireFoxDriver ob1=new FireFoxDriver();
        ob1.get(URL);
        ob1.quit();
        System.out.println("====================================");
        OperaDriver ob2=new OperaDriver();
        ob2.get(URL);
        ob2.quit();

    }
}
