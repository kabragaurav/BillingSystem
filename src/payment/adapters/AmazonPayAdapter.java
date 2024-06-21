package payment.adapters;

import extSDKs.AmazonPay;
import payment.PaymentStrategy;

/**
 * @author gauravkabra
 * @since 2024
 */

public class AmazonPayAdapter implements PaymentStrategy {
    private AmazonPay amazonPay;

    @Override
    public void pay(String customerId, String storeId, double amount) {
        amazonPay.makePayment(customerId, storeId, amount);
    }
}
