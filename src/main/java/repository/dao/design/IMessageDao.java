package repository.dao.design;

import model.Message;
import model.User;

public interface IMessageDao {

    boolean deliveryMessage(User user, String messageText);
    void notifyMessage(User user);
}
