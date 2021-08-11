package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Faysal Bank");

	    bank.addBranch("Shahdara");
	    bank.addCustomer("Shahdara","Hamza Ali Khalid",1000);
        bank.addCustomer("Shahdara","Hamza Ali",2000);
        bank.addCustomer("Shahdara","Hamza",3000);

        bank.addBranch("Begumkot");
        bank.addCustomer("Begumkot","Hamza Ali Khalid",1000);
        bank.addCustomer("Begumkot","Hamza Ali",2000);

        bank.addCustomerTransaction("Shahdara","Hamza Ali Khalid",30);
        bank.addCustomerTransaction("Shahdara","Hamza Ali Khalid",1000);
        bank.addCustomerTransaction("Shahdara","Hamza Ali Khalid",1000);
        bank.addCustomerTransaction("Shahdara","Hamza Ali Khalid",1000);
        bank.addCustomerTransaction("Shahdara","Hamza Ali",2000);
        bank.addCustomerTransaction("Shahdara","Hamza Ali",2000);
        bank.addCustomerTransaction("Shahdara","Hamza Ali",2000);
        bank.addCustomerTransaction("Shahdara","Hamza Ali",2000);
        bank.addCustomerTransaction("Shahdara","Hamza",3000);
        bank.addCustomerTransaction("Shahdara","Hamza",3000);
        bank.addCustomerTransaction("Shahdara","Hamza",3000);

        bank.listCustomers("Shahdara",true);

    }
}
