package day47;

public class ChromeDriver extends RemoteWebDriver{
    @Override
   public void get(String URL){
        System.out.println("Opening "+URL+" in chrome driver");
   }
   @Override
   public void quit(){
       System.out.println("Closing Chrome browser");
   }
}
