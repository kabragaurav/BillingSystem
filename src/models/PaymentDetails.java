package models;

import enums.PayStatus;
import payment.PaymentStrategy;

/**
 * @author gauravkabra
 * @since 2024
 */

public class PaymentDetails {
    private String paymentId;
    private PaymentStrategy paymentMethod;
    private double amount;
    private PayStatus payStatus;
    private String invoiceId;
}
