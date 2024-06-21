package payment;

/**
 * @author gauravkabra
 * @since 2024
 */

public class CreditCardPaymentStrategy extends CardPaymentStrategy {

    @Override
    public void pay(String customerId, String storeId, double amount) {
        System.out.println("Paid an amount of " + amount + " via credit card!");
    }

}
