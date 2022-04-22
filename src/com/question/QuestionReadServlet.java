package com.question;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QuestionReadServlet")
public class QuestionReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		int status = Integer.parseInt(request.getParameter("status"));
		
		try {
			List<Question> qDetails = questionDBUtil.questionDetails(id);
			request.setAttribute("qDetails", qDetails);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(status == 0) {
			RequestDispatcher dis = request.getRequestDispatcher("questionupdate.jsp");
			dis.forward(request, response);
		}
		
		if(status == 1) {
			RequestDispatcher dis = request.getRequestDispatcher("questiondelete.jsp");
			dis.forward(request, response);
		}
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}
		
		
}


