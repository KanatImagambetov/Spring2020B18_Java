package day47;

public class OperaDriver extends RemoteWebDriver {
    @Override
    public void get(String URL){
        System.out.println("Opening "+URL+" in Opera driver");
    }
    public void quit(){
        System.out.println("Closing Opera browser");
    }
}
