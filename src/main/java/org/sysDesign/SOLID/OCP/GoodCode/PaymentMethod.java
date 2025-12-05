package org.sysDesign.SOLID.OCP.GoodCode;

// classes are going to implement the method pay

// if we want to add a new functionality we can just create another class and implement pay method and
// call the processPayment via that object
public interface PaymentMethod {
    void pay(double amount);
}
