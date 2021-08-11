package com.example.Test;

public class Main {

    public static void main(String[] args) {
        String VarFour = "This is Private to main()";

        ScopeCheck scopInstance = new ScopeCheck();
        scopInstance.useInner();
//        System.out.println("scopeInstance VarOne is "+scopInstance.getVarOne());
//        System.out.println(VarFour);
//        scopInstance.timesTwo();
//
//        ScopeCheck.InnerClass innerClassInstance =scopInstance.new InnerClass();
//        System.out.println("************************************");
//        innerClassInstance.timesTwo();
    }
}
