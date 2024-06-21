package payment.facades;

import payment.PaymentStrategy;

/**
 * @author gauravkabra
 * @since 2024
 */

public class PaymentFacade {
    private PaymentStrategy paymentStrategy;

    PaymentFacade(String paymentStrategy) {

    }

    public void pay(String customerId, String storeId, double amount) {

    }
}
