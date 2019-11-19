package com.dairy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dairy.pojo.User;
import com.dairy.service.UserService;
import com.dairy.service.UserServiceImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		String email = request.getParameter("username");
		String password = request.getParameter("password");
		UserService us = new UserServiceImpl();
		User user = us.login(email, password);
		System.out.println(user.getName());
		if(user != null) {
			session.setAttribute("user", user);
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
	}

}
