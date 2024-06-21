package pubsub;

import models.Invoice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Producer {
    private List<Subscriber> subscribers;

    private Producer() {
        subscribers = new ArrayList<>();
    }

    public static Producer getProducer() {
        return new Producer();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void send(Invoice invoice) throws InterruptedException {
        for (Subscriber subscriber : subscribers) {
            Thread.sleep(1000L);
            subscriber.send(invoice);
        }
    }
}
