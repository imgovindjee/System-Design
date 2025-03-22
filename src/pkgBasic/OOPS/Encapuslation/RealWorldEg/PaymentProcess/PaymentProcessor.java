package pkgBasic.OOPS.Encapuslation.RealWorldEg.PaymentProcess;

public class PaymentProcessor {

    private final String cardNumber;
    private final double balance;

    public PaymentProcessor(String cardNumber, double balance) {
        this.cardNumber = maskCard(cardNumber);
        this.balance = balance;
    }

    public void processPayment() {
        System.out.println("Processing payment of "+balance+" for card "+cardNumber);
    }

    private String maskCard(String cardNumber){
        return "****-****-****-"+cardNumber.substring(cardNumber.length()-4);
    }
}
