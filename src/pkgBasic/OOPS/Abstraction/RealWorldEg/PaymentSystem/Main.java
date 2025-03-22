package pkgBasic.OOPS.Abstraction.RealWorldEg.PaymentSystem;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditPayment(1000.50);
        payment.pay();

        payment = new PayPalPayment(980.13);
        payment.pay();
    }
}
