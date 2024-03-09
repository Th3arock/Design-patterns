package Responsibilities;

public class CreditCardPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000)
            System.out.println("Paid using Credit card : $ " + amount);
        else
            next.handlePayment(amount);
    }
}
