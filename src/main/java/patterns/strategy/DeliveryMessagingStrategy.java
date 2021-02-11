package patterns.strategy;

import model.Message;

public abstract class DeliveryMessagingStrategy implements MessagingStrategy{

    @Override
    public void process(Message message) {
        if (checkMessage(message)){
            send(message);
            notify(message);
        }
    }

    abstract boolean checkMessage(Message message);
    abstract void send(Message message);
    abstract void notify(Message message);
}
