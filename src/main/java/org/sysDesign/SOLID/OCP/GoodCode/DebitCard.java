package org.sysDesign.SOLID.OCP.GoodCode;

// now if payment processor is getting called with the object of this class it will run according to
//  this class
public class DebitCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment done via Debit card");
    }
}
