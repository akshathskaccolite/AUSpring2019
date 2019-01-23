package com.au.junit.assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		File f=new File();		
		f.usingBufferedReaderStudent();
		f.usingBufferedReaderSubject();
		f.calculateSum();
		f.displayStudent();
		f.sorting(File.student);
		f.displayStudent();
		
		List<Student> student1=new ArrayList<Student>();
		List<Student> student2=new ArrayList<Student>();
		System.out.println(f.getFirstRank(File.student).getName());
		System.out.println(student1.get(0).getPercentile());
		System.out.println(student1.get(1).getPercentile());
		
		System.out.println(student2.get(0).getName());
		System.out.println(student2.get(1).getName());

		f.usingBufferedWritter();	
	}

}
