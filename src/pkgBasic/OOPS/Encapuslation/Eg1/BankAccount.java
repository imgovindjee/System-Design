package pkgBasic.OOPS.Encapuslation.Eg1;

public class BankAccount {

    private String accountHolder;
    private double balance;

//    CONSTRUCTOR
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

//    METHOD's
//    BASED ON GETTER N SETTER
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount_to_be_deposit) {
        if (amount_to_be_deposit > 0){
            balance += amount_to_be_deposit;
            System.out.println("Deposited: "+amount_to_be_deposit);
        } else {
            System.out.println("Invalid amount to be Deposit");
        }
    }
}
