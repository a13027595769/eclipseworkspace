package com.mypack.login;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private static final long serialVersionUID = 1L;
	public String execute() throws Exception {
			System.out.println("LoginAction.execute()");
			if("admin".equals(username)&&"root".equals(password)) {
				ServletActionContext.getRequest().getSession().setAttribute("USER_IN_SESSION", username);
				return SUCCESS;
			}
			/**
			
			ActionContext context = ActionContext.getContext();
			Map<String, Object> parameters = context.getParameters();
			*/
		return Action.LOGIN;
	}
}
