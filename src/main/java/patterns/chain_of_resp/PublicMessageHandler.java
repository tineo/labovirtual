package patterns.chain_of_resp;

import model.Message;

/**
 *
 * @author CESAR
 */
public class PublicMessageHandler extends AbstractMessageHandler{

    @Override
    protected boolean isApplicable(Message message) {
        return (message.getReceivers()==null || message.getReceivers().size()==0);
    }

    @Override
    protected String reviewMessage(Message message) {
        return "public";
    }
}
