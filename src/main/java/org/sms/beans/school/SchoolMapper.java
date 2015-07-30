package org.sms.beans.school;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.sms.beans.school.*;

public class SchoolMapper implements RowMapper<School>{
	public School mapRow(ResultSet rs,int rownum) throws SQLException{
		School sch= new School();
		sch.setSchoolId(rs.getInt(SchoolColumnContainer.schoolPk));
		sch.setSchoolName(rs.getString(SchoolColumnContainer.schoolName));
		sch.setSchoolShortName(rs.getString(SchoolColumnContainer.schoolShortName));
		sch.setSchoolAddress(rs.getString(SchoolColumnContainer.schoolAddress));
		return sch;
	}
}
