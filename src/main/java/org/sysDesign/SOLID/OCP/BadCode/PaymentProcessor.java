package org.sysDesign.SOLID.OCP.BadCode;

public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount){
        if(paymentMethod.equals("CreditCard")) {
            // business logic
            System.out.println("Made payment via Credit card : " + amount);
        } else if(paymentMethod.equals("DebitCard")){
            System.out.println("Made payment via Debit card : " + amount);
        } else if (paymentMethod.equals("Paypal")) {
            System.out.println("Made payment via Paypal : " + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment method " + paymentMethod);
        }
    }
}


// problems in this code
// lets suppose we want to add a new option of UPI now that will involve modifying this already
// tested function so this violates OCP
// fix --> introduce a interface or abstract class so that classes that can implement it