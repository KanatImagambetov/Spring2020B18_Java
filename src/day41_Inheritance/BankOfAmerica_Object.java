package day41_Inheritance;

public class BankOfAmerica_Object {
    public static void main(String[] args) {
        BankAccount Irina=new BankAccount("Kanat", "Imagambetov");
  //      System.out.println(Irina.accountHolder);
        System.out.println(Irina.getAccountHolder());
        System.out.println(Irina.getBalance());
        Irina.checkBalance();
        Irina.depositing(120);
        Irina.checkBalance();
        Irina.withdrawing(80);
        Irina.checkBalance();
        System.out.println(Irina);
        Irina.withdrawing(100);
        System.out.println(Irina);
        Irina.depositing(20000);
        System.out.println(Irina);
    }

}
