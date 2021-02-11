package patterns.chain_of_resp;

import model.Message;

/**
 *
 * @author CESAR
 */
public abstract class AbstractMessageHandler implements MessageHandler{

    private static String handledBy = "";
    private MessageHandler nextHandler;

    public static void reviewMessageRequest(Message message) {

        final MessageHandler publicMessageHandler = new PublicMessageHandler();
        final MessageHandler privateMessageHandler = new PrivateMessageHandler();
        final MessageHandler groupMessageHandler = new GroupMessageHandler();

        publicMessageHandler.setNextHandler(privateMessageHandler);
        privateMessageHandler.setNextHandler(groupMessageHandler);
        groupMessageHandler.setNextHandler(null);

        publicMessageHandler.processHandler(message);
    }

    @Override
    public void setNextHandler(MessageHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processHandler(Message message) {

        if (isApplicable(message)) {
            handledBy = reviewMessage(message);
        } else {
            if (null != nextHandler) {
                nextHandler.processHandler(message);
            }
        }
    }

    public static String getHandledBy() {
        return handledBy;
    }

    protected abstract boolean isApplicable(Message message);

    protected abstract String reviewMessage(Message message);

}
