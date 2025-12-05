package org.sysDesign.SOLID.SRP.GoodCode;

// class in responsible for invoice related operations only
public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated : " + amount);
    }

    // we created 2 separate class to handle DB logic and Email logic
}