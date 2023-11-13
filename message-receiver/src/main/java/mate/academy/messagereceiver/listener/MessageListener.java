package mate.academy.messagereceiver.listener;

import mate.academy.rabbitmq.model.SimpleMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {
  @RabbitListener(queues = "mate.academy.rabbit.queue")
  public void receiveMessage(final SimpleMessage message) {
    System.out.println("Received message: " + message.getContent());
  }
}
