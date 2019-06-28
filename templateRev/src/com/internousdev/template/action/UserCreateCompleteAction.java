package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	private Map<String,Object> session;

	public String execute() throws SQLException {
		UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();
		userCreateCompleteDAO.createUser(session.get("loginUserId").toString(), session.get("loginPassword").toString(), session.get("userName").toString());

		String result = SUCCESS;

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}






















