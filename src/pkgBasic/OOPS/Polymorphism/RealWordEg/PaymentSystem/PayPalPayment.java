package pkgBasic.OOPS.Polymorphism.RealWordEg.PaymentSystem;

public class PayPalPayment implements payment {

    @Override
    public void pay(double amount_to_be_payed) {
        System.out.println("Paid: "+amount_to_be_payed+" using Paypal");
    }
}
