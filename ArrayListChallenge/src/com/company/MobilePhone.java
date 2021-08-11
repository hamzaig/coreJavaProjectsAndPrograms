package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is Already Saved");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0;i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition<0){
            System.out.println(oldContact.getName()+", was not found!");
            return false;
        }
        myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+" Replaced With New Contact "+newContact.getName());
        return true;
    }

    public String searchQuery(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public Contact searchQuery(String name){
        int position = findContact(name);
        if(position<0){
            return null;
        }
        return this.myContacts.get(position);
    }

    public boolean removeContact(Contact contact){
        int indexPosition = findContact(contact);
        if(indexPosition<0){
            System.out.println(contact.getName()+" is not found in the database");
            return false;
        }
        this.myContacts.remove(indexPosition);
        System.out.println(contact.getName()+" Was Deleted.");
        return true;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for (int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1)+". "+this.myContacts.get(i).getName()+"\t"+
                                this.myContacts.get(i).getPhoneNumber());
        }
    }














}
