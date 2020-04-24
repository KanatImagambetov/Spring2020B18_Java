package day08_ifstatement;

public class month {
    /*
	 		byte month =  3

			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12
     */
    public static void main(String[] args) {
        byte month=2;

        boolean days28= month==2;
        boolean days30= month==4 || month==6 || month ==9 || month==11;
       // boolean day31= month==1 || month==3 || month ==5 || month==7 || month==8 || month==10 || month==12;
        boolean day31= days28==false && days30==false;
int days=0;

        if (days28){
        //    System.out.println("it has 28 days");
            days=28;
        }
        if (days30) {
       //     System.out.println("it has 30 days");
         days=30;
        }
        if(day31) {
        //    System.out.println("it has 31 days");
        days=31;
        }

      System.out.println("It has " +days+" days");


    }

}
