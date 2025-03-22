package pkgBasic.OOPS.Encapuslation.RealWorldEg.DataHidingFunctionality;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1873);
        account.withdrawal(363);
        System.out.println("Remaining Balance: "+account.getBalance());

        account.withdrawal(2000);
    }
}
