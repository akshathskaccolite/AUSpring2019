
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

public class JDBCTemplateDAO {

	public DataSource dataSource;
	public JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveStudent(Student student) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = "insert into student(id,name) values " + "(" + student.getStudentId() + ",'"
				+ student.getStudentName() + "')";
		return jdbcTemplate.update(query);
	}
	
	public List<Student> getAllEmployeesRowMapper(){  
		 return jdbcTemplate.query("select * from student",new RowMapper<Student>(){  
			 
			 public Student mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Student e=new Student();  
		        e.setStudentId(rs.getInt(1));
		        e.setStudentName(rs.getString(2));  
		        
		        return e;  
		    }  
		 }); 
	}

}
