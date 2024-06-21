import enums.AddressType;
import models.Address;
import models.Customer;
import models.Product;
import models.Store;
import payment.facades.PaymentFacade;
import pubsub.EmailSubscriber;
import pubsub.SMSSubscriber;
import pubsub.Subscriber;

import java.util.List;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Customer customer = getCustomer();
        List<Product> products = getProducts();
        Store store = getStore(products);
        List<Product> purchasedProducts = getPurchasedProducts(products);
        List<PaymentFacade> choosenPaymentFacades = getChoosenPaymentFacades(store.getSupportedPaymentMethods());
        List<Double> paymentBreakdowns = List.of(850.0);
        List<Subscriber> chooseCommunicationMethods = getChooseCommunicationMethods();
        store.buy(customer, purchasedProducts, choosenPaymentFacades, paymentBreakdowns, chooseCommunicationMethods);
    }

    private static List<Subscriber> getChooseCommunicationMethods() {
        SMSSubscriber subscriber1 = new SMSSubscriber();
        subscriber1.setSubscriberAddresses(List.of("82098xxxxx"));
        EmailSubscriber subscriber2 = new EmailSubscriber();
        subscriber2.setSubscriberAddresses(List.of("gauravxxxxx.xxx****@gmail.com"));
        return List.of(subscriber1, subscriber2);
    }

    private static List<PaymentFacade> getChoosenPaymentFacades(List<PaymentFacade> supportedPaymentMethods) {
        return List.of(supportedPaymentMethods.get(0));
    }

    private static Store getStore(List<Product> products) {
        Store store = new Store();
        store.setId("CARRY_MART_BLR");
        store.setAddress(getAddress().get(0));
        store.setProducts(products);
        store.setSupportedPaymentMethods(getSupportedPaymentMethods());
        return store;
    }

    private static List<PaymentFacade> getSupportedPaymentMethods() {
        PaymentFacade paymentFacade1 = new PaymentFacade("upi");
        PaymentFacade paymentFacade2 = new PaymentFacade("debit card");
        return List.of(paymentFacade1, paymentFacade2);
    }

    private static List<Product> getProducts() {
        Product p1 = new Product();
        p1.setName("Atta Maggie");
        p1.setDescription("pure 100% atta");
        p1.setPrice(100.0);
        p1.setDiscount(10.0);
        p1.setManufacturer("Nestle India");

        Product p2 = new Product();
        p1.setName("1000 splendid suns");
        p1.setDescription("Best fiction book");
        p1.setPrice(1000.0);
        p1.setDiscount(15.0);
        p1.setManufacturer("Harper Collins");

        return List.of(p1, p2);
    }

    private static List<Product> getPurchasedProducts(List<Product> availableProducts) {
        return List.of(availableProducts.get(1));
    }

    private static Customer getCustomer() {
        Customer customer = new Customer();
        customer.setName("Gaurav Kabra");
        customer.setContactNumbers(List.of("82098*****"));
        customer.setEmails(List.of("gaurav*****.********@gmail.com"));
        List<Address> addresses = getAddress();
        customer.setAddresses(addresses);
        return customer;
    }

    private static List<Address> getAddress() {
        Address address = new Address();
        address.setStreet("GM Palya");
        address.setCity("BLR");
        address.setPinCode("332311");
        address.setState("Karnataka");
        address.setAddressType(AddressType.PERMANENT_ADDRESS);
        return List.of(address);
    }
}
