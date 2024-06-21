package payment.factories;

import pubsub.Producer;

/**
 * @author gauravkabra
 * @since 2024
 */

public class ProducerFactory {
    private static Producer producer;

    public static Producer getProducer() {
        if (producer == null) {
            producer = Producer.getProducer();
        }
        return producer;
    }
}
