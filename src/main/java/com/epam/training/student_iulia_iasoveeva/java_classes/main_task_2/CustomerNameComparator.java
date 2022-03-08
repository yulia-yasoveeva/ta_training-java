package com.epam.training.student_iulia_iasoveeva.java_classes.main_task_2;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCustomerLastName().compareTo(o2.getCustomerLastName());
    }
}
