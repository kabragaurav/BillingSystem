package payment.factories;

import payment.CreditCardPaymentStrategy;
import payment.DebitCardPaymentStrategy;
import payment.PaymentStrategy;
import payment.UPIPaymentStrategy;
import payment.adapters.AmazonPayAdapter;

/**
 * @author gauravkabra
 * @since 2024
 */

public class PaymentStrategyFactory {
    public static PaymentStrategy getPaymentMethod(String paymentStrategy) {
        switch (paymentStrategy) {
            case "upi":
                return new UPIPaymentStrategy();
            case "debit card":
                return new DebitCardPaymentStrategy();
            case "credit card":
                return new CreditCardPaymentStrategy();
            case "amazon pay":
                return new AmazonPayAdapter();
        }
        throw new IllegalArgumentException("This payment method does not exist or is not supported...");
    }
}
