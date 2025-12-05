package org.sysDesign.SOLID.OCP.GoodCode;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
        // this is run time polymorphism as this will call the function
        // of the object which is passed.
    }
}
