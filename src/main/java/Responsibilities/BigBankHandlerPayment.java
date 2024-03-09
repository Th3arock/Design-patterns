package Responsibilities;

public class BigBankHandlerPayment extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= Integer.MAX_VALUE)
            System.out.println("Paid using big bank : $" + amount);
    }
}
