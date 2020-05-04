package day33_CustomClass;

public class bank_account {
    String accountHolder;
    long accountNumber;
    double balance;
    public void checkingBalance(){
        System.out.println("Availible balance: $"+balance);
    }
    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        balance-=amount;
    }
    public void depositing(double amount){
        System.out.println("Depositing $"+amount);
        balance+=amount;
    }
    public String toString(){
        String res="Account holder: "+accountHolder+"\nAccount number: "+accountNumber+"\nAvailible amount: "+balance;
        return res;
    }
}
