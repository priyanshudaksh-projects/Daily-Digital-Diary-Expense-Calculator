package com.dairy;

import java.io.IOException;
import java.util.List;
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
@WebServlet("/FetchExpenseServlet")
public class FetchExpenseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		int uid = user.getId();
		ExpenseService es = new ExpenseServiceImpl();
		List<ExpenseDetails> exp = es.FetchExpense(uid);
		session.setAttribute("expense", exp);
		request.getRequestDispatcher("SeeOrders.jsp").forward(request, response);
	}

}
