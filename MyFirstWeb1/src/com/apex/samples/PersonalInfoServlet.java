package com.apex.samples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apex.samples.vo.PersonalInfoBean;

@WebServlet("/PersonalInfo")
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PersonalInfoBean personalInfo = new PersonalInfoBean();

		// Validations
		String errMsg = "";

		if (request.getParameter("firstName") == null || request.getParameter("firstName").trim().length() == 0) {
			errMsg += "First Name cannot be blank<br/>";
		}
		if (request.getParameter("lastName") == null || request.getParameter("lastName").trim().length() == 0) {
			errMsg += "Last Name cannot be blank<br/>";
		}
		if (request.getParameter("middleName") == null || request.getParameter("middleName").trim().length() == 0) {
			errMsg += "Middle Name cannot be blank<br/>";
		}

		if (request.getParameter("gender") == null || request.getParameter("gender").trim().length() == 0) {
			errMsg += "Please select a gender <br/>";
		}

		personalInfo.setFirstName(request.getParameter("firstName"));
		personalInfo.setLastName(request.getParameter("lastName"));
		personalInfo.setMiddleName(request.getParameter("middleName"));
		personalInfo.setGender(request.getParameter("gender"));

		if (errMsg == null || errMsg.trim().length() == 0) {
			HttpSession session = request.getSession();
			session.setAttribute("pinfo", personalInfo);
			response.sendRedirect("jsp/ContactInfo.jsp");
		} else {
			request.setAttribute("error", errMsg);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/PersonalInfo.jsp");
			rd.forward(request, response);
		}
	}

}
