package patterns.strategy;

import model.Message;

public interface MessagingStrategy {
    void process(Message message);
}
