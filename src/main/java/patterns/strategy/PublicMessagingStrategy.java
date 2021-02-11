package patterns.strategy;

import model.Message;
import model.User;
import repository.dao.implement.MessageDaoImpl;
import repository.dao.implement.UserDaoImpl;

public class PublicMessagingStrategy extends DeliveryMessagingStrategy{
    private MessageDaoImpl daoMessage = new MessageDaoImpl();
    private UserDaoImpl daoUser = new UserDaoImpl();
    @Override
    boolean checkMessage(Message message) {
        boolean isCorrect = false;
        if(message.getReceivers() == null || message.getReceivers().isEmpty()){
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
