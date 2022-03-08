package com.epam.training.student_iulia_iasoveeva.java_classes.main_task_2;

public class Runner {
    public static void main(String[] args) {
        Customer[] customers = CustomerCreator.createListOfCustomer(50);
        Customer[] customersByAlphabetOrder = CustomerUtils.listOfCustomerByAlphabeticOrder(customers);
        Customer[] customersByFilteredCardNumber = CustomerUtils.listOfCustomerByFilteredCardNumber(customers, "121", "122");

        Printer.print("Task a");
        Printer.printCustomer(customersByAlphabetOrder);
        Printer.print("Task b");
        Printer.printCustomer(customersByFilteredCardNumber);
    }
}
