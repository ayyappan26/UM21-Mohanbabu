package com.collection.pratice;

import java .text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(string[] args) {
		date myDate = new Date();
		SimpleDateFromat sf	 = new SimpleDateFormat("dd-mm-yy");
		String str=sf.format(myDate);
		//String str = sf.tostring();
		system.out.printIn("Date :" + str)		
	}

}
