package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customerName,double amount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i=0;i<this.branches.size();i++){
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName,boolean showTransaction){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            System.out.println("Customers Details For "+branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i=0;i<branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println((i+1)+" Customer : "+branchCustomer.getName());
                if(showTransaction){
                    System.out.println("Transactions:");
                    ArrayList<Double> transaction = branchCustomer.getTransaction();
                    for (int j=0;j<transaction.size();j++){
                        System.out.println((j+1)+". Amount "+transaction.get(j));

                    }System.out.println();
                }
            }
            return true;
        }else{
            return false;
        }
    }









}
