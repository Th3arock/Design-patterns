import Responsibilities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount;
        int i = 0;

        PaymentHandler paymentHandler = new BankHandelPayment();
        PaymentHandler bank = new BankHandelPayment();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler payPal = new PayPalPaymentHandler();
        PaymentHandler bigBank = new BigBankHandlerPayment();

        PaymentHandler.link(paymentHandler, bank, creditCard, payPal, bigBank);
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter the money that you wanna pay : \n");
            amount = input.nextDouble();
            paymentHandler.handlePayment(amount);
            i++;
        } while (i <= 10);
    }
}
