package patterns.chain_of_resp;

import model.Message;

/**
 *
 * @author CESAR
 */
public class GroupMessageHandler extends AbstractMessageHandler{

    @Override
    protected boolean isApplicable(Message message) {
        return (message.getReceivers().size() > 1);
    }

    @Override
    protected String reviewMessage(Message message) {
        return "group";
    }
}
