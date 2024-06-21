package models;

import payment.facades.PaymentFacade;
import payment.factories.ProducerFactory;
import pubsub.Producer;
import pubsub.Subscriber;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Store {
    private String id;
    private List<Product> products;
    private List<PaymentFacade> supportedPaymentMethods;
    private Address address;
    private static final Producer producer = ProducerFactory.getProducer();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<PaymentFacade> getSupportedPaymentMethods() {
        return supportedPaymentMethods;
    }

    public void setSupportedPaymentMethods(List<PaymentFacade> supportedPaymentMethods) {
        this.supportedPaymentMethods = supportedPaymentMethods;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Producer getProducer() {
        return producer;
    }

    public void buy(Customer customer, List<Product> purchasedProducts, List<PaymentFacade> choosenPaymentMethods, List<Double> paymentBreakdowns, List<Subscriber> chooseCommunicationMethods) {
        try {
            System.out.println("Buying products for customer " + customer.getName());
            Thread.sleep(1000);

            int numberOfChoosenMethods = choosenPaymentMethods.size();

            for (int i = 0; i < numberOfChoosenMethods; i++) {
                choosenPaymentMethods.get(i).pay(customer.getId(), id, paymentBreakdowns.get(i));
            }

            Invoice invoice = generateInvoice(customer, purchasedProducts);
            for (Subscriber chooseCommunicationMethod : chooseCommunicationMethods) {
                producer.subscribe(chooseCommunicationMethod);
            }
            producer.send(invoice);
            System.out.println("Purchase complete!");
        } catch (Exception ex) {
            System.out.println("Something went wrong. Cannot purchase items at the moment!");
        }
    }

    private Invoice generateInvoice(Customer customer, List<Product> purchasedProducts) {
        Invoice invoice = new Invoice();
        invoice.setCustomerId(customer.getId());
        invoice.setGenerationDateTime(LocalDateTime.now());
        invoice.setPurchasedProducts(purchasedProducts);
        invoice.setShippingAddress(customer.getAddresses().get(0));
        return invoice;
    }

}
