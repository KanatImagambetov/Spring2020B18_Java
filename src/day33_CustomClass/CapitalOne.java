package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        bank_account Anna=new bank_account();

        Anna.accountHolder="Anna";
        Anna.accountNumber=12345;
        Anna.checkingBalance();
        Anna.depositing(10000);
        Anna.checkingBalance();
        Anna.withDraw(33);
        Anna.checkingBalance();
        System.out.println(Anna);

    }
}
