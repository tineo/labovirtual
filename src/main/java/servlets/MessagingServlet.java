package servlets;

import model.Message;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "MessagingServlet", displayName = "MessagingServlet", urlPatterns = {"/messages"}, loadOnStartup = 1)
public class MessagingServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User currentUser = new User();
        String messageText = request.getParameter("messageText");
        HttpSession session = request.getSession();
        if (session != null) {
            currentUser = (User) session.getAttribute("currentUser");
        }

        Message message = new Message();
        message.setSender(currentUser);
        message.setText(messageText);

        request
                .getRequestDispatcher("/index.jsp")
                .forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request
                .getRequestDispatcher("/index.jsp")
                .forward(request, response);
    }
}
