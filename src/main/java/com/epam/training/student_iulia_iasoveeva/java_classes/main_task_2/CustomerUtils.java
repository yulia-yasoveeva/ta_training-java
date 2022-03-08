package com.epam.training.student_iulia_iasoveeva.java_classes.main_task_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CustomerUtils {

    private CustomerUtils() {
    }

    public static Customer[] listOfCustomerByAlphabeticOrder(Customer[] original) {
        Customer[] result = original.clone();
        Arrays.sort(result, new CustomerNameComparator());
        return result;
    }

    public static Customer[] listOfCustomerByFilteredCardNumber(Customer[] original, String cardNumberStart, String cardNumberEnd) {
        List<Customer> customerList = new ArrayList<>();
        for (Customer c : original) {
            String cardNumber = c.getCartNumber();
            if (cardNumber.compareTo(cardNumberStart) > 0 && cardNumber.compareTo(cardNumberEnd) < 0) {
                customerList.add(c);
            }
        }
        return customerList.toArray(new Customer[0]);
    }
}
