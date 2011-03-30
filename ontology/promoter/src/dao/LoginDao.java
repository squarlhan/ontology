package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.ConnectionUtil;
import bean.User;

public class LoginDao {
	public Boolean isAdmin(String email,String password){
		Connection conn=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getConnection();
		String sql="select * from user_info,user_role where email=? and password=? and user_role.id=user_info.id and user_role.role='admin'";
		try {
			prst=conn.prepareStatement(sql);
			prst.setString(1,email);
			prst.setString(2, password);
			rs=prst.executeQuery();
			if(rs.next()){
				
				return true;
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
		return false;
	}
}
