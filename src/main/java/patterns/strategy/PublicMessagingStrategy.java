package patterns.strategy;

import model.Message;
import model.User;
import patterns.observer.Subject;
import repository.dao.implement.MessageDaoImpl;
import repository.dao.implement.UserDaoImpl;

public class PublicMessagingStrategy extends DeliveryMessagingStrategy{
    private MessageDaoImpl daoMessage = new MessageDaoImpl();
    private UserDaoImpl daoUser = new UserDaoImpl();
    @Override
    boolean checkMessage(Message message) {
        boolean isCorrect = false;
        if(message.getReceivers().size() == 0){
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

        for (User user: daoUser.getAllActiveUsers()) {
            daoMessage.deliveryMessage(user, message.getText());
        }
    }

    @Override
    void notify(Message message) {
        for (User user: daoUser.getAllActiveUsers()) {
            daoMessage.notifyMessage(user);
        }
    }
}