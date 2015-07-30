package org.sms.beans.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {
	
	public User mapRow(ResultSet rs,int rowNum) throws SQLException{
		User user=new User();
		user.setUserID(rs.getInt(UserColumnContainer.pk));
		user.setUserName(rs.getString(UserColumnContainer.userName));
		user.setSchoolID(rs.getInt(UserColumnContainer.schoolID));
		user.setUserFirstName(rs.getString(UserColumnContainer.userFirstName));
		user.setUserLastName(rs.getString(UserColumnContainer.userLastName));
		user.setUserMiddleName(rs.getString(UserColumnContainer.userMiddleName));
		user.setPwd(rs.getString(UserColumnContainer.password));
		user.setLastModifiedDate(rs.getDate(UserColumnContainer.pwdlastModifiedDate));
		return user;
	}

}
