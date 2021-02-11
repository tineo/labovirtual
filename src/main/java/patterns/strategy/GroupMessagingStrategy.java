package patterns.strategy;

import model.Message;
import model.User;
import repository.dao.implement.MessageDaoImpl;

public class GroupMessagingStrategy extends DeliveryMessagingStrategy{
    private MessageDaoImpl daoMessage = new MessageDaoImpl();
    @Override
    boolean checkMessage(Message message) {
        boolean isCorrect = false;
        if(message.getReceivers().size() > 1){
            if(message.getText() != null && !message.getText().equals("")){
                System.out.println("Mensaje a enviar: "+message.getText());
                isCorrect = true;
            }else{
                System.out.println("Mensaje vacio");
            }
        }
        return isCorrect;
    }

    @Override
    void send(Message message) {
        for (User user: message.getReceivers()) {
            daoMessage.deliveryMessage(user, message.getText());
        }
    }

    @Override
    void notify(Message message) {
        for (User user: message.getReceivers()) {
            daoMessage.notifyMessage(user);
        }
    }
}
