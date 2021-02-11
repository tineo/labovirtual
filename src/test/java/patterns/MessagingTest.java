package patterns;


import model.Message;
import model.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import patterns.chain_of_resp.AbstractMessageHandler;

import java.util.ArrayList;

/**
 * Demonstrates use of Chain of Responsibility pattern.
 *
 * @author CESAR
 */
@DisplayName("Testing -  Chain of Responsibility pattern")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MessagingTest {

    @Test
    @DisplayName("Handler for public messages")
    protected void testPublicHandler() {
        AbstractMessageHandler.reviewMessageRequest(new Message());
        assertEquals("public", AbstractMessageHandler.getHandledBy());
    }

    @Test
    @DisplayName("Handler for private messages")
    protected void testPrivateHandler() {
        Message message = new Message();
        message.setReceivers(new ArrayList<User>() {{ add(new User()); }});
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("private", AbstractMessageHandler.getHandledBy());
    }

    @Test
    @DisplayName("Handler for group messages")
    protected void testGroupHandler() {
        Message message = new Message();
        message.setReceivers(new ArrayList<User>() {{ add(new User()); add(new User()); }});
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("group", AbstractMessageHandler.getHandledBy());

    }

    @Test
    @DisplayName("Handler for private messages with text")
    protected void testPrivateHandlerWithText() {
        Message message = new Message();
        message.setText("Hola Usuario");
        message.setReceivers(new ArrayList<User>() {{ add(new User()); }});
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("private", AbstractMessageHandler.getHandledBy());
    }

    @Test
    @DisplayName("Handler for public messages with text")
    protected void testPublicHandlerWithText() {
        Message message = new Message();
        message.setText("Hola a todos");
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("public", AbstractMessageHandler.getHandledBy());
    }

    @Test
    @DisplayName("Handler for group messages with text")
    protected void testGroupHandlerWithText() {
        Message message = new Message();
        message.setText("Hola grupo");
        message.setReceivers(new ArrayList<User>() {{ add(new User()); add(new User()); }});
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("group", AbstractMessageHandler.getHandledBy());
    }


}