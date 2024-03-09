package Responsibilities;

public abstract class PaymentHandler {
    protected PaymentHandler next;

    public static PaymentHandler link(PaymentHandler first, PaymentHandler... chain) {
        PaymentHandler head = first;
        for (PaymentHandler nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract void handlePayment(double amount);
}
