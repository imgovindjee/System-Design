package pkgBasic.OOPS.Encapuslation.Eg1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Priyanka", 1000);
        System.out.println("CurrentBalance: "+bankAccount.getBalance());
        bankAccount.deposit(390);
        System.out.println("Updated Balance: "+bankAccount.getBalance());
    }
}
