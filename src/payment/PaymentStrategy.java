package payment;

/**
 * @author gauravkabra
 * @since 2024
 */

public interface PaymentStrategy {

    void pay(String customerId, String storeId, double amount);

}
