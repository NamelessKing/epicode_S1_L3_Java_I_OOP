package es3;

import java.time.LocalDate;

public class Customer {
    private final String customerCode;
    private final String fullName;
    private final String email;
    private final LocalDate subscriptionDate;

    public Customer(String customerCode, String fullName, String email, LocalDate subscriptionDate) {
        if (customerCode == null || customerCode.isBlank()) {
            throw new IllegalArgumentException("customerCode cannot be blank");
        }
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("fullName cannot be blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("email cannot be blank");
        }
        if (subscriptionDate == null) {
            throw new IllegalArgumentException("subscriptionDate cannot be null");
        }
        this.customerCode = customerCode;
        this.fullName = fullName;
        this.email = email;
        this.subscriptionDate = subscriptionDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", subscriptionDate=" + subscriptionDate +
                '}';
    }
}

