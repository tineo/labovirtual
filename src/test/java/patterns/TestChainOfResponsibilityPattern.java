package patterns;

import static org.junit.Assert.*;

import model.Message;
import model.User;
import org.junit.Test;
import patterns.chain_of_resp.AbstractMessageHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates use of Chain of Responsibility pattern.
 *
 * @author gazbert
 */
public class TestChainOfResponsibilityPattern {

    @Test
    public void testPublicHandler() {

        Message message  = new Message();
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("public", AbstractMessageHandler.getHandledBy());

    }

    @Test
    public void testPrivateHandler() {

        Message message  = new Message();
        User user = new User();
        List<User> receivers = new ArrayList<>();
        receivers.add(user);

        message.setReceivers(receivers);
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("private", AbstractMessageHandler.getHandledBy());
    }

    @Test
    public void testGroupHandler() {

        Message message  = new Message();
        User user = new User();
        User secondUser = new User();
        List<User> receivers = new ArrayList<>();
        receivers.add(user);
        receivers.add(secondUser);

        message.setReceivers(receivers);
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("group", AbstractMessageHandler.getHandledBy());

    }
}