package patterns.chain_of_resp;

import model.Message;

/**
 *
 * @author CESAR
 */
public interface MessageHandler {
    void setNextHandler(MessageHandler handler);
    void processHandler(Message document);
}
