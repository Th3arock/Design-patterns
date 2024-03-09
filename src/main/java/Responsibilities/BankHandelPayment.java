package Responsibilities;

public class BankHandelPayment extends PaymentHandler {
    @Override
    public void handlePayment(double amount)  {
        if (amount <= 200)
            System.out.println("Paid using bank account : $ " + amount);
        else
            next.handlePayment(amount);


    }
}
