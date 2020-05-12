package day38_Constructors;

public class SalaryCalculator {
    double hourlyRate;
    int  weeklyHour;
    double stateTaxRate;
    double federalTaxRate;
    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyHour=weeklyHour;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
    }
    public String toString(){
        return "Hourly rate is $"+hourlyRate+": \nWeekly hours are "+weeklyHour+": \nState Tax Rate is "+stateTaxRate+": \nFederal Tax Rate is "+federalTaxRate +": \nGross salary is $"+salary()+": \nNet Salary is $"+netSalary();
    }
    public double salary(){
        return hourlyRate*weeklyHour*48;
    }
    public double statTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double netSalary(){
        return salary()-statTax()-federalTax();
    }
}
