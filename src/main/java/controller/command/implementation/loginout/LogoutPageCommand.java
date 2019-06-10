package controller.command.implementation.loginout;

import controller.command.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutPageCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        final HttpSession session = request.getSession();

        session.removeAttribute("user");
        session.removeAttribute("role");

        return "/WEB-INF/index.jsp";
    }
}
