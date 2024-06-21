package models;

import payment.facades.PaymentFacade;

import java.util.List;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Store {
    private List<Product> products;
    private List<PaymentFacade> supportedPaymentMethods;
    private Address address;
}
