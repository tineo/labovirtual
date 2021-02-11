
import lombok.SneakyThrows;
import model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import servlets.MessagingServlet;

import static org.mockito.Mockito.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Demonstrates use MessagingServlet.
 *
 * @author CESAR
 */
@DisplayName("Testing - MessagingServlet")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MessagingServletTest {
    @SneakyThrows
    @Test
    @DisplayName("Testing post method")
    void testPostMethod() {

        MessagingServlet messagingServlet = new MessagingServlet();

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);

        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        ServletContext context = mock(ServletContext.class);

        when(request.getParameter("messageText")).thenReturn("123");
        when(session.getAttribute("currentUser")).thenReturn(new User());

        when(request.getServletContext()).thenReturn(context);
        when(request.getRequestDispatcher("/index.jsp")).thenReturn(dispatcher);

        System.out.println(messagingServlet);
        System.out.println(request);
        messagingServlet.doPost(request, response);

        verify(request, times(1)).getRequestDispatcher("/index.jsp");
        verify(dispatcher).forward(request, response);
    }

    @SneakyThrows
    @Test
    @DisplayName("Testing get method")
    void testGetMethod() {

        MessagingServlet messagingServlet = new MessagingServlet();

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);

        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        ServletContext context = mock(ServletContext.class);

        when(request.getServletContext()).thenReturn(context);
        when(request.getRequestDispatcher("/index.jsp")).thenReturn(dispatcher);

        System.out.println(messagingServlet);
        System.out.println(request);
        messagingServlet.doGet(request, response);

        verify(request, times(1)).getRequestDispatcher("/index.jsp");
        verify(dispatcher).forward(request, response);
    }


}
