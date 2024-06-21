package payment.facades;

import payment.PaymentStrategy;
import payment.factories.PaymentStrategyFactory;

/**
 * @author gauravkabra
 * @since 2024
 */

public class PaymentFacade {
    private final PaymentStrategy paymentStrategy;

    public PaymentFacade(String paymentStrategy) {
        this.paymentStrategy = PaymentStrategyFactory.getPaymentMethod(paymentStrategy);
    }

    public void pay(String customerId, String storeId, double amount) throws InterruptedException {
        System.out.println("Paying amount " + amount);
        Thread.sleep(1000L);
        paymentStrategy.pay(customerId, storeId, amount);
        Thread.sleep(1000L);
        System.out.println("Paid amount " + amount);
    }
}
