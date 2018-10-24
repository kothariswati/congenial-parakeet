package com.apex.samples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apex.samples.dao.PersonalDetailsDAO;
import com.apex.samples.vo.BankInfoBean;

@WebServlet("/BankInfo")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BankInfoBean bankInfo = new BankInfoBean();
		// Validations
		String errMsg = "";

		if (request.getParameter("bankName") == null || request.getParameter("bankName").trim().length() == 0) {
			errMsg += "Bank Name cannot be blank<br/>";
		}
		if (request.getParameter("accountNumber") == null || request.getParameter("accountNumber").trim().length() == 0) {
			errMsg += "Account number cannot be blank<br/>";
		}
		if (request.getParameter("ssn") == null || request.getParameter("ssn").trim().length() == 0) {
			errMsg += "SSN cannot be blank<br/>";
		}
		
		bankInfo.setBankName(request.getParameter("bankName"));
		bankInfo.setAccountNumber(request.getParameter("accountNumber"));
		bankInfo.setSsn(request.getParameter("ssn"));

		
		if (errMsg == null || errMsg.trim().length() == 0) {
			HttpSession session = request.getSession();
			session.setAttribute("binfo", bankInfo);
			
			PersonalDetailsDAO pdao = new PersonalDetailsDAO();
			try {
				pdao.PersonalDetailsSendToDB(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("jsp/success.jsp");
		} else {
			request.setAttribute("error", errMsg);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/BankInfo.jsp");
			rd.forward(request, response);
		}
		
	}

}
