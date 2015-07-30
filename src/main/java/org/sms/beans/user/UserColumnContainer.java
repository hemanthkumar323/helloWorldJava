package org.sms.beans.user;

import java.util.Date;

//This interface contains the list of columns used in User table

public interface UserColumnContainer {
	
	public static String tableName ="user_info";
	
	public static String pk ="user_id";
	
	public static String schoolID="school_id";
	
	public static String userFirstName ="user_firstName";
	
	public static String userLastName ="user_lastName";
	
	public static String userMiddleName ="user_middleName";
	
	public static String userName ="userName";
	
	public static String password ="pwd";
	
	public static String pwdlastModifiedDate ="password_last_modified";		
	
}
