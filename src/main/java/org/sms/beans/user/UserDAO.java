package org.sms.beans.user;

import java.util.List;

public interface UserDAO {

	public int createUser(String userName,String displayName,String firstName,
			String lastName,String email,String password, int schoolId);
	
	public int updateUserPassword(String userName,String password);
	
	public List<User>[] listAllUsersBySchoolName(int schoolID);
	
	public int removeUserForSchool(String schoolName,String userName);
	
	public int removeAllUsersForSchool(int schoolID);
	
	public int verifyCredentials(String userName,String password,int schoolId);
	
	public int verifyCredentials(String userName,String password,String schoolName);
	
	public User getUser(String userName,String schoolName);
	
	public User getUser(String userName,int schoolId);
			
}
