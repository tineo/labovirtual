package patterns.chain_of_resp;

import model.Message;
import patterns.strategy.DeliveryMessagingStrategy;
import patterns.strategy.GroupMessagingStrategy;

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
    protected String processMessage(Message message) {
        DeliveryMessagingStrategy deliveryMessagingStrategy = new GroupMessagingStrategy();
        deliveryMessagingStrategy.process(message);
        return "group";
    }
}
