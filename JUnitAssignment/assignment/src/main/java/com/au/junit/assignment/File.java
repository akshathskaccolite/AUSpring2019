package com.au.junit.assignment;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class File {
	
//	This is the method implemented for the file input when the StudentDao is implemented
//	getStudents(){
//	
//		usingBufferedReaderStudent();
//		usingBufferedReaderSubject()
//		
//	}
	
	public static List<Student> student=new ArrayList<Student>();
	public static List<Subject> subject=new ArrayList<Subject>();
	
	public StudentDao dao;
	
	public StudentDao getDao() {
		return dao;
	}
	public void setDao(StudentDao dao) {
		this.dao=dao;
	}
	
	public static void usingBufferedWritter() throws IOException
	{
		List<String> lines = new ArrayList<>();
		int i=1;
		for(Student s:student) {
			lines.add(i+s.getName()+s.getPercentile());
			i++;
		}
		Path file = Paths.get("C:\\Users\\akshath.sk\\Desktop\\the-file-name.txt");
		Files.write(file, lines, Charset.forName("UTF-8"));
	}
	
	public static void usingBufferedReaderStudent() throws IOException{
		try(BufferedReader in = new BufferedReader(new FileReader("C:\\\\Users\\\\akshath.sk\\\\Desktop\\\\abc.txt"))) {
		    String str;

		    while ((str = in.readLine()) != null) {
		        System.out.println(str);
		        List<String> list = Arrays.asList(str.split(","));
		        Student s=new Student();
		        s.setCode(list.get(0));
		        s.setName(list.get(1));
		        s.setDob(list.get(2));
		        student.add(s);
		    }
		}
		catch (IOException e) {
		    System.out.println("File Read Error");
		}
	}
	
	public static void usingBufferedReaderSubject() throws IOException{
		try(BufferedReader in = new BufferedReader(new FileReader("C:\\\\Users\\\\akshath.sk\\\\Desktop\\\\abc1.txt"))) {
		    String str;

		    while ((str = in.readLine()) != null) {
		        System.out.println(str);
		        List<String> list = Arrays.asList(str.split(","));
		        Subject s=new Subject();
		        s.setCode(list.get(0));
		        s.setSubject(list.get(1));
		        s.setMark(Integer.parseInt(list.get(2)));
		        subject.add(s);
		    }
		}
		catch (IOException e) {
		    System.out.println("File Read Error");
		}
	}
	
	public void displayStudent() {
	    for(Student s:student) {
	    	System.out.println(s.getCode()+s.getDob()+s.getName()+s.getTotalMarks());
	    }
	}
	
	public void displaySubject() {
		for(Subject s:subject) {
	    	System.out.println(s.getCode()+s.getSubject()+s.getMark());
	    }
	}
	
	public void calculateSum() {
		int sum;
		for(Student st:student) {
			sum=0;
			for(Subject sb:subject) {
				if(st.getCode().equals(sb.getCode()))
				{
					sum+=sb.getMark();
				}
				st.setTotalMarks(sum);
			}
			
		}	
	}
	
	public void sorting(List<Student> stud) {
		Collections.sort(stud, new Comparing());
//		System.out.println("Sorted");
	}
	

	public Student getFirstRank(List<Student> stud) {
		Collections.sort(stud, new Comparing());
		return(stud.get(0));
	}
	
	public int getMaxMarks() {
		List<Student> students=dao.getStudents();
		Collections.sort(students, new Comparing());
		return(students.get(0).getTotalMarks());
	}
	
	public List<Student> getPercentile() {
		List<Student> students=dao.getStudents();
		Collections.sort(students, new Comparing());
		int max=students.get(0).getTotalMarks();
		for(Student s:students) {
			s.setPercentile((s.getTotalMarks()*100)/max);
		}
		return students;
	}
	
	public List<Student> getToppers(int marks) {
		List<Student> students=dao.getStudents();
		List<Student> topers=new ArrayList<Student>();
		
		for(Student student:students) {
			if(student.getTotalMarks()>=marks)
			{
				topers.add(student);
			}
		}
		return topers;
	}
	
}
