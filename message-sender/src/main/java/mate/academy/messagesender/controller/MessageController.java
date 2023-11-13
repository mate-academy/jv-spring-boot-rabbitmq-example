package mate.academy.messagesender.controller;

import mate.academy.rabbitmq.model.SimpleMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
  private final RabbitTemplate rabbitTemplate;

  public MessageController(RabbitTemplate rabbitTemplate) {
    this.rabbitTemplate = rabbitTemplate;
  }

  @PostMapping("/send")
  public String sendMessage(@RequestBody SimpleMessage message) {
    rabbitTemplate.convertAndSend("mate.academy.rabbit.queue", message);
    return "Message sent!";
  }
}
