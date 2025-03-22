package pkgBasic.OOPS.Polymorphism.RealWordEg.PaymentSystem;

public class CreditCardPayment implements payment {

    @Override
    public void pay(double amount_to_be_payed) {
        System.out.println("Paid: "+amount_to_be_payed+" using credit-card");
    }
}
