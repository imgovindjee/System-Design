package pkgBasic.OOPS.Abstraction.RealWorldEg.PaymentSystem;

public abstract class Payment {

    private final double amount;

    public Payment(double amount){
        this.amount = amount;
    }

//    ABSTRACT METHOD
    public abstract void pay();

//    Getter
    public double getAmount() {
        return amount;
    }
}
