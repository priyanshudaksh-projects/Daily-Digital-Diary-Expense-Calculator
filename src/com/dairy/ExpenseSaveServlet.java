package com.dairy;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dairy.pojo.ExpenseDetails;
import com.dairy.pojo.User;
import com.dairy.service.ExpenseService;
import com.dairy.service.ExpenseServiceImpl;

/**
 * Servlet implementation class ExpenseSaveServlet
 */
@WebServlet("/ExpenseSaveServlet")
public class ExpenseSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExpenseSaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post called");
		HttpSession session=request.getSession();
		ExpenseDetails exp = null; 
		ExpenseService es = new ExpenseServiceImpl();
		User user = (User) session.getAttribute("user");
		int userid = user.getId();
		LocalDate date = LocalDate.parse(request.getParameter("date"));
		int food = Integer.parseInt(request.getParameter("food"));
		int golgappa = Integer.parseInt(request.getParameter("gol"));
		int transport = Integer.parseInt(request.getParameter("fare"));
		int other = Integer.parseInt(request.getParameter("other"));
		int total = Integer.parseInt(request.getParameter("total"));
		String reason = request.getParameter("reason");
		exp = new ExpenseDetails(-1, userid, date, food, golgappa, transport, other, reason, total);
		es.SaveExpense(exp);
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

}
