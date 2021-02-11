package patterns;


import model.Message;
import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import patterns.chain_of_resp.AbstractMessageHandler;

import java.util.ArrayList;
import java.util.List;



/**
 * Demonstrates use of Chain of Responsibility pattern.
 *
 * @author CESAR
 */
@DisplayName("Testing -  Chain of Responsibility pattern")
public class AbstractMessageHandlerTest {
    private Message message;
    private List<User> receivers;

    @BeforeEach
    public void setUp() throws Exception {
        message  = new Message();
        receivers = new ArrayList<>();
    }

    @Test
    @DisplayName("Handler for public messages")
    public void testPublicHandler() {
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("public", AbstractMessageHandler.getHandledBy());
    }

    @Test
    @DisplayName("Handler for private messages")
    public void testPrivateHandler() {
        receivers.add(new User());
        message.setReceivers(receivers);
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("private", AbstractMessageHandler.getHandledBy());
    }

    @Test
    @DisplayName("Handler for group messages")
    public void testGroupHandler() {
        receivers.add(new User());
        receivers.add(new User());
        message.setReceivers(receivers);
        AbstractMessageHandler.reviewMessageRequest(message);
        assertEquals("group", AbstractMessageHandler.getHandledBy());

    }
}