import lombok.SneakyThrows;
import model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import servlets.ContentServlet;
import servlets.MessagingServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
import java.io.StringWriter;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Demonstrates use MessagingServlet.
 *
 * @author CESAR
 */
@DisplayName("Testing - ContentServletTest")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContentServletTest {
    private static final String PATH_JSP = "content/index.jsp";

    @SneakyThrows
    @Test
    @DisplayName("Testing post method")
    void testPostMethod() {

        ContentServlet servlet = new ContentServlet();

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);

        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        ServletContext context = mock(ServletContext.class);

        when(request.getServletContext()).thenReturn(context);
        when(request.getRequestDispatcher(PATH_JSP)).thenReturn(dispatcher);

        System.out.println(servlet);
        System.out.println(request);

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);

        servlet.doPost(request, response);

        writer.flush();
        assertTrue(stringWriter.toString().contains("Servlet"));

    }

    @SneakyThrows
    @Test
    @DisplayName("Testing get method")
    void testGetMethod() {

        ContentServlet servlet = new ContentServlet();

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);

        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        ServletContext context = mock(ServletContext.class);

        when(request.getServletContext()).thenReturn(context);
        when(request.getRequestDispatcher(PATH_JSP)).thenReturn(dispatcher);

        System.out.println(servlet);
        System.out.println(request);
        servlet.doGet(request, response);

        verify(request, times(1)).getRequestDispatcher(PATH_JSP);
        verify(dispatcher).forward(request, response);
    }


}
