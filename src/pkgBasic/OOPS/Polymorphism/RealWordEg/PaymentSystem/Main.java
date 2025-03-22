package pkgBasic.OOPS.Polymorphism.RealWordEg.PaymentSystem;

public class Main {
    public static void main(String[] args) {
        payment payment = new CreditCardPayment();
        payment.pay(13713.1);

        payment = new PayPalPayment();
        payment.pay(12.90);
    }
}
