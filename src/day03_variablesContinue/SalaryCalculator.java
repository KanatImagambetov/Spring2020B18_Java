package day03_variablesContinue;

public class SalaryCalculator {
    public static void main(String[] args) {
      //gsegsdfgsfg

       /* vfdvvdsvd
        ehergfsd
        sgsdgsfsgsfg
        gsdf
        */

double hourlyrate=35;
double staterate=0.04;
double federaltaxrate=0.22;
double weeklyhours=40;
byte weekinyear=365/7;
double salary=hourlyrate*weeklyhours*weekinyear*(1- federaltaxrate+staterate);

        System.out.println("your salary:  $" + salary); // concatentation
        System.out.println("total tax:  "+ (federaltaxrate+staterate));
        System.out.println("salary after tax:  $"+(weekinyear+federaltaxrate));
       /* System.out.println("9   " + 3); //concatenation
        System.out.println(9+3); addition
*/
    }



}
