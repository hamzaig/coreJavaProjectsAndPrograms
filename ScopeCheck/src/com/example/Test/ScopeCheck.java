package com.example.Test;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("Scope Created, publicVar "+publicVar+" Varone "+ varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int varTwo = 2;
        for (int i = 0; i<10 ; i++){
            System.out.println(i+" time two is "+i*varTwo);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("Varthree from outer Class "+innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, Varthree is " + varThree);
        }

        public void timesTwo() {
            ScopeCheck.this.timesTwo();
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " time two is " + i * varThree);
            }
        }
    }
}
