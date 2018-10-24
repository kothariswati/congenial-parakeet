package com.apex.samples.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.apex.samples.vo.BankInfoBean;
import com.apex.samples.vo.ContactInfoBean;
import com.apex.samples.vo.PersonalInfoBean;

public class PersonalDetailsDAO {

	public PersonalDetailsDAO() {
		super();
	}

	// Getting Connection

	public static Connection getConnection() throws Exception {
		Connection dbConn = null;
		try {
			// step1:
			Class.forName("com.mysql.jdbc.Driver");
			// step2
			String url = "jdbc:mysql://localhost:3306/test";
			// step3
			dbConn = DriverManager.getConnection(url, "root", "Alpha123");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return dbConn;
	}

	public void PersonalDetailsSendToDB(HttpServletRequest request) throws Exception {
		Connection dbConn = null;
		PreparedStatement pStmt = null;
		int rowsInserted = 0;

		HttpSession session = request.getSession();
		PersonalInfoBean pbean = (PersonalInfoBean) session.getAttribute("pinfo");
		ContactInfoBean cbean = (ContactInfoBean) session.getAttribute("cinfo");
		BankInfoBean bbean = (BankInfoBean) session.getAttribute("binfo");

		try {
			dbConn = getConnection();
			dbConn.setAutoCommit(true);
			pStmt = dbConn.prepareStatement("INSERT INTO customer_personal_details VALUES (?, ?, ?, ?,?)");

			pStmt.setString(1, pbean.getFirstName());
			pStmt.setString(2, pbean.getMiddleName());
			pStmt.setString(3, pbean.getLastName());
			pStmt.setString(4, pbean.getGender());
			pStmt.setString(5, cbean.getPhone());

			rowsInserted = pStmt.executeUpdate();

			pStmt = dbConn.prepareStatement("INSERT INTO customer_contact_details VALUES (?, ?, ?, ?,?)");

			pStmt.setString(1, cbean.getAddress());
			pStmt.setString(2, cbean.getCity());
			pStmt.setString(3, cbean.getState());
			pStmt.setString(4, cbean.getCountry());
			pStmt.setString(5, cbean.getPhone());

			rowsInserted = pStmt.executeUpdate();

			pStmt = dbConn.prepareStatement("INSERT INTO customer_bank_details VALUES (?, ?, ?,?)");

			pStmt.setString(1, bbean.getBankName());
			pStmt.setString(2, bbean.getAccountNumber());
			pStmt.setString(3, bbean.getSsn());
			pStmt.setString(4, cbean.getPhone());

			rowsInserted = pStmt.executeUpdate();

			if (rowsInserted != 1) {
				throw new Exception("Error in inserting the row");

			}
		} catch (SQLException sqle) {
			System.out.println(sqle.getErrorCode());
			System.out.println(sqle.getMessage());
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			pStmt.close();
			dbConn.close();
		}
		return;
	}

	public void queryAllUsers() throws Exception {
		Connection dbConn = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {

			dbConn = getConnection();
			pStmt = dbConn.prepareStatement("SELECT * FROM customer_personal_details");
			rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			rs.close();
			pStmt.close();
			dbConn.close();
		}
		return;

	}
}
