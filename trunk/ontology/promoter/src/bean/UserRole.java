package bean;

import java.util.Set;

public class UserRole {
	public int id;
	public String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserRole(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
}
