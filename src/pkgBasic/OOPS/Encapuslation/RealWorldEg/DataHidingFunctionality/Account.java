package pkgBasic.OOPS.Encapuslation.RealWorldEg.DataHidingFunctionality;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawal(double amount_to_be_withdrawal) {
        if (validateWithDrawal(amount_to_be_withdrawal)) {
            balance -= amount_to_be_withdrawal;
            System.out.println(amount_to_be_withdrawal+" successfully withdrawal");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

//    hiding thw working internally
    private boolean validateWithDrawal(double amount_to_be_withdrawal) {
        return amount_to_be_withdrawal > 0 && amount_to_be_withdrawal <= balance;
    }
}
