package com.au.junit.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

class Comparing implements Comparator<Student> { 
	
	SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
	Date date1;
	Date date2;
	 
	@Override 
    public int compare(Student student1, Student student2) { 
		
		if(student1.getTotalMarks()>student2.getTotalMarks()) {
			return -1;
		}else if(student1.getTotalMarks()<student2.getTotalMarks()) {
			return 1;
		}else 
		{
			try {
				date1 = format.parse(student1.getDob());
			} catch (ParseException e) {
				e.printStackTrace();
			}
        	try {
				date2 = format.parse(student2.getDob());
			} catch (ParseException e) {
				e.printStackTrace();
			} 
        	if(date1.compareTo(date2)<0) 
   			  return -1; 
   		  else return 1;
		}
}
}
