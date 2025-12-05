package org.sysDesign.SOLID.SRP.BadCode;

public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated : " + amount);
    }

    // this does not belong to invoice class
    public void saveToDatabase(){
        System.out.println("Saved to DB");
    }

    // this does not belong to invoice class
    public void sendNotification(){
        System.out.println("Sending mail to notify");
    }
}
