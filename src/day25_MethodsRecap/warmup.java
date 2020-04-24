package day25_MethodsRecap;

public class warmup {
    public static String getDriver1 (String browserName) {
        String res="";
        switch(browserName.toLowerCase().replace(" ","")){
            case "chrome":
                res="chrome driver";
                break;
            case "FireFox":
                res="FireFox driver";
                break;
            case "safari":
                res="safari driver";
                break;
            case "opera":
                res="opera driver";
                break;
            case "explorer":
                res="explorer driver";
                break;
            case "edge":
                res="edge driver";
                break;
            default:
                res="Invalid driver";
                break;
        }
        return res;
    }

    public static String getDriver2(String browserName) {
 //       String res="";
        browserName.toLowerCase();
        if(browserName.equals("chrome")){
             return "chrome driver";
        }else if(browserName.equals("firefox")){
            return "firefox driver";
        }else if(browserName.equals("safari")){
            return "safari driver";
        }else if(browserName.equals("edge")){
            return "edge driver";
        }else if(browserName.equals("opera")){
            return "opera driver";
        }else if(browserName.equals("explorer")){
            return "explorer driver";
        }else{
            return "invalid";
        }
//        return res;
    }

    public static String getDriver3(String browserName) {
        String res="";
        browserName.toLowerCase();
        res=(browserName.equals("chrome")) ?"chrome driver": (browserName.equals("firefox")) ? "firefox driver": (browserName.equals("safari")) ? "safari driver":
                (browserName.equals("edge")) ? "edge driver": (browserName.equals("opera")) ? "opera driver": (browserName.equals("explorer")) ?
                        "explorer driver": "invalid";
        return res;
    }

    public static void main(String[] args) {
        String r=getDriver1("FireFox");
        String r1=getDriver2("chrome");
        String r3=getDriver3("chrome");
        System.out.println(r1);
    }
}
