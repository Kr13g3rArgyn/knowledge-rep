package kz.proxy.stock_service.service;

import kz.proxy.Smart_proxy.entity.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class OrderConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumerService.class);
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent message) {
        LOGGER.info(String.format("Order consumed [stock] => %s", message.toString()));
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            objectMapper.readValue(message, OrderEvent.class);
//            LOGGER.info(String.format("Consumed message: %s", message));
//        } catch (JsonProcessingException e) {
//            LOGGER.error("Error while deserializing message: ", e);
//        }
//        /*
//        Здесь дальше можно засэйвить в бд, обновить статус заказа и т.д.
//         */
    }

}
