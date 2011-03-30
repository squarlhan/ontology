package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionUtil;
import bean.UserRole;
import bean.User;

public class HandleUserDao {
	public List<User> getAllUser(){
		List<User> users=new ArrayList<User>();
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getConnection();
		String sql="select user_info.*,user_role.role from user_info,user_role where user_info.id=user_role.id";
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				User user=new User();
				user.setSurname(rs.getString("surname"));
				user.setEmail(rs.getString("email"));
				user.setGiven_name(rs.getString("given_name"));
				user.setId(rs.getInt("user_info.id"));
				user.setOrganization(rs.getString("organization"));
				user.setPhone(rs.getString("phone"));
				user.setUserRole(new UserRole(rs.getInt("user_info.id"),rs.getString("user_role.role")));
				users.add(user);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return users;
	}
}
