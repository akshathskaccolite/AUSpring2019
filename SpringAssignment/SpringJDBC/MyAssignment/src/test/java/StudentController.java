import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	@RequestMapping(value = "/getStudent",method=RequestMethod.GET)
	@ResponseBody
	public String getStudent(){
		
		System.out.println("Here man");
		 Student student = new Student();
		 student.setStudentId(15); 
		 student.setStudentName("Accolite");
		 return "index";
	}
	
	@RequestMapping(value="/getStudents",method=RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public Student getStudents(@RequestParam("id")int id){
		Student student = new Student();
	    student.setStudentId(id);
	    student.setStudentName("XYZ");
	    return student;
	}
	
	@RequestMapping(value="/getStudent/{id}",method=RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public Student getStudent(@PathVariable("id")int id){
		Student student = new Student();
	    student.setStudentId(id);
	    student.setStudentName("XYZ");
	    return student;
	}
}