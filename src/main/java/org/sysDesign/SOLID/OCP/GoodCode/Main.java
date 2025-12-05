package org.sysDesign.SOLID.OCP.GoodCode;

public class Main {
    static void main() {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod upi = new UPI();

        // now we can just call the processPayment through credit card object,
        // and we can also call it via debit card object or UPI object
        processor.processPayment(creditCard, 1000);
        processor.processPayment(upi, 2000);
    }
}
