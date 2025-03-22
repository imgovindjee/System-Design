package pkgBasic.OOPS.Encapuslation.RealWorldEg.PaymentProcess;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor("1234567890098765", 2091);
        paymentProcessor.processPayment();
    }
}
