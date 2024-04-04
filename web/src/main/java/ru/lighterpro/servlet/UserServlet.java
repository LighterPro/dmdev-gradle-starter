package ru.lighterpro.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.lighterpro.service.UserService;
import ru.lighterpro.util.StringUtils;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        userService.getAll().forEach(user -> writer.write("""
                <h2>id: %d, name: %s</h2>
                """.formatted(user.id(), StringUtils.capitalizeSecondChar(user.name()))));
    }
}
