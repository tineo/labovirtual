package patterns.strategy;

import model.Message;
import repository.dao.implement.MessageDaoImpl;

public class PrivateMessagingStrategy extends DeliveryMessagingStrategy{
    private MessageDaoImpl daoMessage = new MessageDaoImpl();
    @Override
    boolean checkMessage(Message message) {
        boolean isCorrect = false;
        if(message.getReceivers().size() == 1){
                if(!message.getText().equals("")){
                    isCorrect = true;
                }else{
                    System.out.println("Mensaje vacio");
                }
        }
        return isCorrect;
    }

    @Override
    void send(Message message) {
        daoMessage.deliveryMessage(message.getReceivers().get(0), message.getText());
    }

    @Override
    void notify(Message message) {
        daoMessage.notifyMessage(message.getReceivers().get(0));
    }
}
