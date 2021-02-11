package patterns.chain_of_resp;

import model.Message;
import patterns.strategy.DeliveryMessagingStrategy;
import patterns.strategy.PrivateMessagingStrategy;
import patterns.strategy.PublicMessagingStrategy;

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
    protected String processMessage(Message message) {
        DeliveryMessagingStrategy deliveryMessagingStrategy = new PublicMessagingStrategy();
        deliveryMessagingStrategy.process(message);
        return "public";
    }
}
