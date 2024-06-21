package pubsub;

import models.Invoice;

import java.util.List;
import java.util.Objects;

/**
 * @author gauravkabra
 * @since 2024
 */

public class EmailSubscriber extends Subscriber {

    public void send(Invoice invoice) {
        for (String email : subscriberAddresses) {
            System.out.println("Sent email invoice to " + email);
        }
    }

    // override equals and hashcode so that it can correctly unsubscribe
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SMSSubscriber)) return false;
        SMSSubscriber that = (SMSSubscriber) o;
        return Objects.equals(subscriberAddresses, that.subscriberAddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriberAddresses);
    }
}
