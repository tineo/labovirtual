package repository.dao.implement;

import model.Message;
import model.User;
import repository.dao.design.IMessageDao;

public class MessageDaoImpl implements IMessageDao {
    @Override
    public boolean deliveryMessage(User user, String messageText) {
        return true;
    }

    @Override
    public void notifyMessage(User user) {

    }
}
