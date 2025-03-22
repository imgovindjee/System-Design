package pkgBasic.OOPS.Interfaces.RealWorldEg.PaymentSystem;

public class PaypalPayment implements Payment {

    @Override
    public void pay(double amount_to_be_paid) {
        System.out.println("Paid " + amount_to_be_paid + " using Paypal");
    }
}
