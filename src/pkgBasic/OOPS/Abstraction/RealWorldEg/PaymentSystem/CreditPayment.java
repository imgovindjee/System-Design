package pkgBasic.OOPS.Abstraction.RealWorldEg.PaymentSystem;

public class CreditPayment extends Payment{

    public CreditPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Paid: "+getAmount()+" using Credit Payment");
    }
}
