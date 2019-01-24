package com.au.junit.assignment;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class JunitTest {

	public File f;
	public StudentDao StudentDaoMock;

	@Before
	public void setup() {
		f = new File();
		StudentDaoMock = Mockito.mock(StudentDao.class);
		f.setDao(StudentDaoMock);
	}
	
	@Test
	public void checkReadFromFileStudent() throws IOException {
		List<Student> studentList = f.usingBufferedReaderStudent();
		assertEquals(14, studentList.size());
	}
	
	@Test
	public void checkReadFromFileSubject() throws IOException {
		List<Subject> subjectList = f.usingBufferedReaderSubject();
		assertEquals(18, subjectList.size());
	}
	
	@Test
	public void testCalculateSum() throws IOException {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.get(0).setName("AAA");
		students.get(0).setCode("A1");
		students.get(0).setDob("24-02-1997");
		
		List<Subject> subject = new ArrayList<Subject>();
		subject.add(new Subject());
		subject.get(0).setCode("A1");
		subject.get(0).setMark(100);

		subject.add(new Subject());
		subject.get(1).setCode("A1");
		subject.get(1).setMark(50);
		
		List<Student> students1 = new ArrayList<Student>();
		students1=f.calculateSum(students, subject);

		assertEquals(150, students.get(0).getTotalMarks());
	}
	

	@Test(timeout = 5)
	public void testFirstRank() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.get(0).setName("AAA");
		students.get(0).setTotalMarks(120);

		students.add(new Student());
		students.get(1).setName("AAB");
		students.get(1).setTotalMarks(123);

		Student s1 = f.getFirstRank(students);

		assertEquals("AAB", students.get(0).getName());
	}
	
	@Test(timeout = 5)
	public void testSorting() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.get(0).setName("AAA");
		students.get(0).setTotalMarks(120);
		students.get(0).setDob("24-02-1997");

		students.add(new Student());
		students.get(1).setName("AAB");
		students.get(1).setTotalMarks(123);
		students.get(1).setDob("25-02-1997");
		
		students.add(new Student());
		students.get(2).setName("AAC");
		students.get(2).setTotalMarks(123);
		students.get(2).setDob("24-02-1997");

		f.sorting(students);

		assertEquals("AAC", students.get(0).getName());
	}

	@Test
	public void testgetToppers() {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.get(0).setName("AAA");
		students.get(0).setTotalMarks(120);

		students.add(new Student());
		students.get(1).setName("AAB");
		students.get(1).setTotalMarks(123);

		students.add(new Student());
		students.get(2).setName("AAC");
		students.get(2).setTotalMarks(126);

		students.add(new Student());
		students.get(3).setName("AAD");
		students.get(3).setTotalMarks(129);

		Mockito.when(StudentDaoMock.getStudents()).thenReturn(students);
		List<Student> topers = f.getToppers(100);
		assertEquals("AAD", topers.get(3).getName());
	}

	@Test
	public void getMaxMarks() {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.get(0).setName("AAA");
		students.get(0).setTotalMarks(120);

		students.add(new Student());
		students.get(1).setName("ABB");
		students.get(1).setTotalMarks(123);
		Mockito.when(StudentDaoMock.getStudents()).thenReturn(students);
		int i = f.getMaxMarks();
		assertEquals(123, i);
	}

	@Test
	public void testPercentile() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.get(0).setName("AAA");
		students.get(0).setTotalMarks(120);

		students.add(new Student());
		students.get(1).setName("ABB");
		students.get(1).setTotalMarks(123);
		Mockito.when(StudentDaoMock.getStudents()).thenReturn(students);
		List<Student> topers = f.getPercentile();
		// list will be sorted
		assertEquals(100.0, topers.get(0).getPercentile(), 0.001);
		assertEquals(97.0, topers.get(1).getPercentile(), 0.001);
	}

	@After
	public void tearDown() {
		f = null;
	}

}
