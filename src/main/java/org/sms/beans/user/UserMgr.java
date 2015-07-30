package org.sms.beans.user;

import java.util.List;

public class UserMgr implements UserDAO {

	public int createUser(String userName, String displayName, String firstName, String lastName, String email,
			String password, int schoolId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateUserPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<User>[] listAllUsersBySchoolName(int schoolID) {
		// TODO Auto-generated method stub
		return null;
	}

	public int removeUserForSchool(String schoolName, String userName) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int removeAllUsersForSchool(int schoolID) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int verifyCredentials(String userName, String password, int schoolId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int verifyCredentials(String userName, String password, String schoolName) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User getUser(String userName, String schoolName) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String userName, int schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

}
