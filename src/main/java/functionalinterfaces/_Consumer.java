package functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        // normal Java function

        Customer david = new Customer("David", "1234567890");
        Customer melina = new Customer("Melina", "0987654321");
        greetCustomer(david);

        // Using Consumer Interface
        greetCustomerConsumer.accept(david);

        greetCustomerConsumerv2.accept(david, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerv2 = (customer, showPhoneNum) ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "  + (showPhoneNum ? customer.customerPhoneNum : "***"));

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "  +customer.customerPhoneNum);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "  +customer.customerPhoneNum);
    }

    static class Customer{
        private final String customerName;
        private final String  customerPhoneNum;

        public Customer(String customerName, String customerPhoneNum) {
            this.customerName = customerName;
            this.customerPhoneNum = customerPhoneNum;
        }
    }

}
