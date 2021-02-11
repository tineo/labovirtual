package patterns.strategy;

import model.Message;

public interface MessagingStrategy {
    void send(Message message);
}
