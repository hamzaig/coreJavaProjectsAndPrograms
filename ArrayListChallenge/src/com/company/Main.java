package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone("0092 332 7229422");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("Choose Your Action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shuting Down ...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    System.out.println("Please Enter Between 0 - 6");
                    break;
            }
        }
    }

    private static void startPhone(){
        System.out.println("Starting Phone ... ");
    }

    private static void printActions(){
        System.out.println("Available Actions: \nPress");
        System.out.println("0 - to Shutdown\n"+
                            "1 - to print contacts\n"+
                            "2 - to add a new contact\n"+
                            "3 - to update an existing contact\n"+
                            "4 - to remove an existing contact\n"+
                            "5 - query if any contact is exist or not\n"+
                            "6 - to print a list of available actons\n");
    }

    private static void addNewContact(){
        System.out.println("Enter Name : ");
        String contactName = scanner.nextLine();
        System.out.println("Enter Phone Number : ");
        String contactPhoneNumber = scanner.nextLine();
        Contact newcontact = Contact.createContact(contactName,contactPhoneNumber);
        if(mobilePhone.addNewContact(newcontact)){
            System.out.println("Contact is Added");
        }else {
            System.out.println("Contact is not added due to already in file.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact Name : ");
        String oldcontactName = scanner.nextLine();
        Contact oldContact = mobilePhone.searchQuery(oldcontactName);
        if(oldContact == null){
            System.out.println("Contact not Found");
            return;
        }
        System.out.println("Enter new contact Name : ");
        String contactName = scanner.nextLine();
        System.out.println("Enter Phone Number : ");
        String contactPhoneNumber = scanner.nextLine();
        Contact newcontact = Contact.createContact(contactName,contactPhoneNumber);
        if(mobilePhone.updateContact(oldContact,newcontact)){
            System.out.println("Contact is Updated");
        }else {
            System.out.println("Error Updating Contact");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact Name : ");
        String oldcontactName = scanner.nextLine();
        Contact oldContact = mobilePhone.searchQuery(oldcontactName);
        if (oldContact == null) {
            System.out.println("Contact not Found");
            return;
        }
        if(mobilePhone.removeContact(oldContact)){
            System.out.println("Contact is deleted Successfully");
        }else{
            System.out.println("Error Deleting Contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact Name : ");
        String oldcontactName = scanner.nextLine();
        Contact oldContact = mobilePhone.searchQuery(oldcontactName);
        if (oldContact == null) {
            System.out.println("Contact not Found");
            return;
        }
        System.out.println("Name : "+oldContact.getName()+" Number : "+oldContact.getPhoneNumber());
    }



}
