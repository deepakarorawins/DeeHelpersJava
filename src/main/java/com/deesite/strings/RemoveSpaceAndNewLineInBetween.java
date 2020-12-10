package com.deesite.strings;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class RemoveSpaceAndNewLineInBetween {

	public static void main(String[] args) {
		spaceAndNewLine();
		inBetween("12:00 AM, Nov 17, 2020, Collapsed");
		getDateWRTcurrentDate("MM/dd/yyyy", 0);
		getDateWRTcurrentDate("MMM dd, yyyy", 0);
		dtfLocalDate("yyyy/MM/dd HH:mm:ss");
		dtfLocalDate("MM/dd/yyyy");
		dtfLocalDate("MMM dd, yyyy");
		
		dtfLocalDate(LocalDateTime.now(), "MM/dd/yyyy");
		dtfLocalDate(LocalDateTime.now(), "MMM dd, yyyy");
		
		takeUntilFirstComma();
		
		

	}
	
	public static void spaceAndNewLine() {
		String withSpaceAndNewLine = "   My     name 	is Deepak \n Arora";
		String withoutSpaceAndNewLine = withSpaceAndNewLine.replaceAll("\\s", " ");
		
		System.out.println(withSpaceAndNewLine);
		System.out.println(withoutSpaceAndNewLine);
		

		
	}
	
	public static String inBetween(String input) {
		System.out.println("input string: " + input);
		int start = input.indexOf(",")+1;
		int end = input.lastIndexOf(",");
		String output = input.substring(start, end);
		System.out.println("output string: " + output);
		return output;
		
	}
	
	public static String getDateWRTcurrentDate(String dateFormat, int count) {
		Date dt = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE, count);
		dt = c.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		System.out.println(formatter.format(dt));
		return (formatter.format(dt));
	}
	
	public static String dtfLocalDate(String dateFormat) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);  
		 LocalDateTime now = LocalDateTime.now();  
		 System.out.println(dtf.format(now));  
		 return dtf.format(now);
	}
	
	public static String dtfLocalDate(LocalDateTime now, String dateFormat) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);  
		 System.out.println(dtf.format(now));  
		 return dtf.format(now);
	}
	
	public static void takeUntilFirstComma() {
		String input = "onekey.milwaukeetool.com, secure and validated connection";
		String output = null;
		//String output = input.substring(0, input.lastIndexOf(","));
		if(input.contains(",")){
			output = input.substring(0, input.lastIndexOf(","));
		}
		System.out.println(input);
		System.out.println(output);
	}

}
