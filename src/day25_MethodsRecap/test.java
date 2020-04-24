package day25_MethodsRecap;
//
import Resources.Library;
public class test {
    public static void main(String[] args) {
        String str="AADSDSFDGFHJKHGFDSASADFGHJGFDSAzxcvxz";
        String r=Library.removeDubl(str);
        System.out.println(r);

        String str1="VVVVVVVVVBBBBBBBBBBBBSAAAAAAAAAAAAAAAAAAA";

        String str2=Library.FrequencyOfCahrs(str1);
        System.out.println(str2);

    }
}
