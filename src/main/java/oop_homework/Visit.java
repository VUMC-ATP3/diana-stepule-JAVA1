package oop_homework;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return this.customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }


    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

        public double totalServiceExpense () {
            return this.serviceExpense - (this.serviceExpense * DiscountRate.getServiceDiscountRate(this.customer.getMemberType()));
        }

        public double totalProductExpence () {
            return this.productExpense - (this.productExpense * DiscountRate.getProductDiscountRate(this.customer.getMemberType()));
        }

        public double getTotalExpence () {
            return totalProductExpence() + totalServiceExpense();
        }




    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
