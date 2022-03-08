package com.epam.training.student_iulia_iasoveeva.java_classes.main_task_2;

import java.util.Objects;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerLastName;
    private String address;
    private String cardNumber;
    private String bankAccount;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerLastName, String address, String cardNumber, String bankAccount) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCartNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && cardNumber == customer.cardNumber
                && bankAccount == customer.bankAccount
                && customerName.equals(customer.customerName)
                && customerLastName.equals(customer.customerLastName)
                && address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerLastName, address, cardNumber, bankAccount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + customerId +
                ", Name='" + customerName + '\'' +
                ", LastName='" + customerLastName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
