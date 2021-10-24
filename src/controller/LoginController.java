package controller;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import bean.Account;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		try {
			request.getSession(true).invalidate();
			//make sure that email is valid
			String regexMail = "^[A-Z0-9_a-z]+@[A-Z0-9\\.a-z]+\\.[A-Za-z]{2,6}$";
			String regex = "[a-zA-Z0-9!@#$%^&*]+";
			//collect data from login form
			String user = request.getParameter("username");
			String password = request.getParameter("password");
			Account acc = new Account();
			acc.setName(user); acc.setPwd(password);
			HttpSession session = request.getSession(true);
			if (!acc.getPwd().matches(regex) || !acc.getName().matches(regexMail)) {
				session.setAttribute("error", "Invalid syntax");
				response.sendRedirect("login.jsp");
			}
			if (request.getParameter("remember") != null) {
				Cookie cookie = new Cookie("username", user);
				cookie.setMaxAge(300);
				response.addCookie(cookie);
			}
			//read information of account in web.xml
			String uid = getServletContext().getInitParameter("username");
			String pwd = getServletContext().getInitParameter("password");
			if (user != null && acc.getPwd().equals(pwd) && acc.getName().equalsIgnoreCase(uid)) {
				session.setAttribute("user", user);
				@SuppressWarnings("deprecation")
				String encodedUrl = response.encodeRedirectUrl("admin/index.jsp");
				response.sendRedirect(encodedUrl);
			} else {
				session.setAttribute("error", "wrong username or password");
				response.sendRedirect("login.jsp");
			}
		}
		catch (NullPointerException e) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} 
		catch (Exception ex) {
			response.getWriter().println(ex);
		}
			
		
	}
}
