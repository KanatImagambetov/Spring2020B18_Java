package day47;

public class FireFoxDriver extends RemoteWebDriver{

    @Override
    public void get(String URL){
        System.out.println("Opening "+URL+" in FireFox driver");
    }
    public void quit(){
        System.out.println("Closing FireFox browser");
    }
}
