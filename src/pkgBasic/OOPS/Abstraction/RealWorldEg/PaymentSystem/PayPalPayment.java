package pkgBasic.OOPS.Abstraction.RealWorldEg.PaymentSystem;

public class PayPalPayment extends Payment {

    public PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Paid: "+getAmount()+" using PayPal");
    }
}
