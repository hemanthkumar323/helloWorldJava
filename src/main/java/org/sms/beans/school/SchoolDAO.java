package org.sms.beans.school;

public interface SchoolDAO {

	public int addNewSchool(String name,String shortName,String schoolAddress);
	
	public School getSchoolByName(String shortName);
	
	public int removeSchool(String shortName);
	
}
