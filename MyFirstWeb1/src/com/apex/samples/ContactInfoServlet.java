package com.apex.samples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apex.samples.vo.ContactInfoBean;

@WebServlet("/ContactInfo")
public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ContactInfoBean contactInfo = new ContactInfoBean();
		
		// Validations
				String errMsg = "";

				if (request.getParameter("address") == null || request.getParameter("address").trim().length() == 0) {
					errMsg += "Address cannot be blank<br/>";
				}
				if (request.getParameter("city") == null || request.getParameter("city").trim().length() == 0) {
					errMsg += "City cannot be blank<br/>";
				}
				if (request.getParameter("state") == null || request.getParameter("state").trim().length() == 0) {
					errMsg += "State cannot be blank<br/>";
				}

				if (request.getParameter("country") == null || request.getParameter("country").trim().length() == 0) {
					errMsg += "Please select a Country <br/>";
				}
				
				if (request.getParameter("phone") == null || request.getParameter("phone").trim().length() == 0) {
					errMsg += "Phone # cannot be blank <br/>";
				}

		contactInfo.setAddress(request.getParameter("address"));
		contactInfo.setCity(request.getParameter("city"));
		contactInfo.setState(request.getParameter("state"));
		contactInfo.setCountry(request.getParameter("country"));
		contactInfo.setPhone(request.getParameter("phone"));
		
		if (errMsg == null || errMsg.trim().length() == 0) {
			HttpSession session = request.getSession();
			session.setAttribute("cinfo", contactInfo);
			response.sendRedirect("jsp/BankInfo.jsp");
		} else {
			request.setAttribute("error", errMsg);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/ContactInfo.jsp");
			rd.forward(request, response);
		}

		
	}

}
