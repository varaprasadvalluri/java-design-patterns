package com.gang4.behavioral.template;
//The Template Method Pattern is a behavioral design pattern that defines the skeleton
// of an algorithm in the superclass but
// lets subclasses override specific steps without changing the overall structure.
//✅ When multiple classes have similar workflows, but some steps vary.
//✅ When enforcing a standard algorithm structure while allowing flexibility in some steps.
//✅ When reducing code duplication by reusing common logic in a base class.
public class TemplatePatternExample {
    public static void main(String[] args) {
        FundTransfer neft = new NEFTTransfer();
        System.out.println("=== NEFT Transfer ===");
        neft.transfer(1000);

        FundTransfer rtgs = new RTGSTransfer();
        System.out.println("\n=== RTGS Transfer ===");
        rtgs.transfer(5000);

        FundTransfer imps = new IMPSTransfer();
        System.out.println("\n=== IMPS Transfer ===");
        imps.transfer(2000);
    }
}
