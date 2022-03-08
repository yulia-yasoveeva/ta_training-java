package com.epam.training.student_iulia_iasoveeva.java_classes.main_task_2;

import com.github.javafaker.Faker;

public class CustomerCreator {

    private CustomerCreator() {
    }

    public static Customer[] createListOfCustomer(int quantity) {
        Customer[] customers = new Customer[quantity];
        Faker faker = new Faker();
        for (int i = 0; i < quantity; i++) {
            Customer customer = new Customer();
            customer.setCustomerId(i);
            customer.setCustomerName(faker.name().firstName());
            customer.setCustomerLastName(faker.name().lastName());
            customer.setAddress(faker.address().fullAddress());
            customer.setCardNumber(faker.business().creditCardNumber());
            customer.setBankAccount(faker.finance().iban());
            customers[i] = customer;
        }
        return customers;
    }
}
