package com.question;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QuestionUpdateServlet")
public class QuestionUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String questionID = request.getParameter("questionID");
		String subject = request.getParameter("subject");
		String question = request.getParameter("question");
		String answer1 = request.getParameter("answer1");
		String answer2 = request.getParameter("answer2");
		String answer3 = request.getParameter("answer3");
		String answer4 = request.getParameter("answer4");
		String cAnswer = request.getParameter("cAnswer");
		
		boolean isTrue = questionDBUtil.updatequestion(questionID,subject, question, answer1, answer2, answer3, answer4, cAnswer);
		
		if(isTrue == true) {
			try {
				List<Question> quesDetails = questionDBUtil.questionlist();
				request.setAttribute("quesDetails", quesDetails);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("questionlist.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}
		
}


