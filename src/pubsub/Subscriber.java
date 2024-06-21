package pubsub;

import models.Invoice;

import java.util.List;

import static utils.BillingSystemConstants.SUBSCRIBER_ID_PREFIX;

/**
 * @author gauravkabra
 * @since 2024
 */

public abstract class Subscriber {
    protected static long nextId = -1;
    protected List<String> subscriberAddresses;

    String id;

    Subscriber() {
        this.id = generateId();
    }

    private String generateId() {
        nextId++;
        return SUBSCRIBER_ID_PREFIX + nextId;
    }

    public List<String> getSubscriberAddresses() {
        return subscriberAddresses;
    }

    public void setSubscriberAddresses(List<String> subscriberAddresses) {
        this.subscriberAddresses = subscriberAddresses;
    }

    public abstract void send(Invoice invoice);
}
