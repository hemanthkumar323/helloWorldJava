package org.sms.beans.school;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

// This contains the list of all names the table 
// associated to the school has

public class SchoolColumnContainer {

	@Value("${org.school.tableName}")	
	public static String tableName;
	
	@Value("${org.school.schoolPK.columnName}")
	public static String schoolPk;
	
	@Value("${org.school.schoolName.columnName}")
	public static String schoolName;
	
	@Value("${org.school.schoolAddress.columnName}")
	public static String schoolAddress;
	
	@Value("${org.school.schoolShortName.columnName}")
	public static String schoolShortName ;
	
}
