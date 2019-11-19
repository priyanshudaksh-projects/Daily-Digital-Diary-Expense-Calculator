package com.dairy;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dairy.pojo.Diary;
import com.dairy.pojo.User;
import com.dairy.service.DiaryService;
import com.dairy.service.DiaryServiceImpl;

/**
 * Servlet implementation class SaveDiaryServlet
 */
@WebServlet("/SaveDiaryServlet")
public class SaveDiaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveDiaryServlet() {
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
		HttpSession session = request.getSession();
		DiaryService ds = new DiaryServiceImpl();
		Diary diary = null;
		User user = (User) session.getAttribute("user");
		int uid = user.getId();
		LocalDate date = LocalDate.parse(request.getParameter("date"));
		String mood = request.getParameter("mood");
		String day = request.getParameter("day");
		String extra = request.getParameter("extra");
		diary = new Diary(-1, uid, date, mood, day, extra);
		ds.store(diary);
		request.getRequestDispatcher("Home.jsp").forward(request, response);
		
	}

}
