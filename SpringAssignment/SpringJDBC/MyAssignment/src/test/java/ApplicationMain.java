
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		JDBCTemplateDAO jdbc = applicationContext.getBean(JDBCTemplateDAO.class);
		Student student = new Student();
		student.setStudentId(21);
		student.setStudentName("Akshath");
		jdbc.saveStudent(student);

		List<Student> list = jdbc.getAllEmployeesRowMapper();
		for (Student e : list) {
			System.out.println(e.getStudentId()+" "+e.getStudentName());
			System.out.println(" ");

		}

	}

}
