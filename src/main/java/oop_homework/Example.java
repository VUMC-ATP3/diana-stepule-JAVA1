package oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        Customer customerA = new Customer("Anna");
        customerA.setMember(false);
        customerA.setMemberType("Not member");
        System.out.println("Not member " + customerA.toString());

        Visit visitA = new Visit(customerA, new Date());
        visitA.setServiceExpense(130);
        visitA.setProductExpense(50);
        System.out.println(visitA.toString());
        System.out.println("Annas kopējais maksājums " + visitA.getTotalExpense());

        System.out.println("\n");

        Customer customerL = new Customer("Laima");
        customerL.setMember(true);
        customerL.setMemberType("Silver");
        System.out.println("Silver member " + customerL.toString());

        Visit visitL = new Visit(customerL, new Date());
        visitL.setServiceExpense(170);
        visitL.setProductExpense(20);
        System.out.println(visitL.toString());
        System.out.println("Laimas kopējais maksājums " + visitL.getTotalExpense());

        System.out.println("\n");

        Customer customerK = new Customer("Kristīne");
        customerK.setMember(true);
        customerK.setMemberType("Gold");
        System.out.println("Gold example " + customerK.toString());

        Visit visitK = new Visit(customerK, new Date());
        visitK.setServiceExpense(200);
        visitK.setProductExpense(70);
        System.out.println(visitK.toString());
        System.out.println("Kristīnes kopējais maksājums " + visitK.getTotalExpense());

        System.out.println("\n");

        Customer customerR = new Customer("Roberts");
        customerR.setMember(true);
        customerR.setMemberType("Premium");
        System.out.println("Premiumm example " + customerR.toString());

        Visit visitR = new Visit(customerR, new Date());
        visitR.setServiceExpense(115);
        visitR.setProductExpense(70);
        System.out.println(visitR.toString());
        System.out.println("Roberta kopējais maksājums " + visitR.getTotalExpense());





    }
}
