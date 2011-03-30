package action;

import java.util.List;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.HandleUserDao;
import dao.LoginDao;

public class AdminLoginAction extends ActionSupport{        
	public String email;
	public String password;
	public List<User> users;
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute(){
		if(new LoginDao().isAdmin(email, password)){
			users=new HandleUserDao().getAllUser();
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
}
