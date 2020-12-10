package com.deesite.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_Calculations {
	public static LocalDate localDate;

	public static void main(String[] args) {
		stringToLocalDate();
		
		zonedLocalDateTime();
		
		
		String b = "2705 - Drill/Driver";
		String a ="2705 - Drill Driver tool";
		System.out.println(b.substring(b.indexOf("-")+2,b.indexOf("-")+2+3));
		
		//System.out.println(b.indexOf("D" +2));
		
		//System.out.println(b.substring(b.indexOf("D")),3);
		
		
		
		System.out.println(LocalDate.now().getMonth().plus(-1));
		System.out.println(getCurrentLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(getCurrentLocalDate().plusDays(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(getCurrentLocalDate().plusDays(2));
		
		System.out.println(addFourDaysIfCurrentLocalDateIsGreaterThanTwentyEight());

	}

	public static LocalDate getCurrentLocalDate() {
		localDate = LocalDate.now();
		return localDate;
	}
	
	
	public static LocalDate addFourDaysIfCurrentLocalDateIsGreaterThanTwentyEight() {
		LocalDate currentDate = LocalDate.now();
	    LocalDate date = currentDate.plusDays(2); // Adding 2 days so we won't get Service Required Alert (as per Sus Email)
	    System.out.println(date.getMonth().toString());
	    int dayOfMonth = date.getDayOfMonth();
		if(dayOfMonth>28) {
			System.out.println("Current date ("+date+ ") is >= 28th hence adding 4 days. Recurring alerts must be between the 1st and 28th of the month.");
			LocalDate addedFourDays = date.plusDays(4);	
			System.out.println("Added Four days: "+addedFourDays);
			System.out.println(String.format("%02d", addedFourDays.getMonthValue()) +"/"+ String.format("%02d", addedFourDays.getDayOfMonth()) +"/"+ Integer.toString(addedFourDays.getYear()));
			//reportInfo(logger, "Month - " + month + " Day - " + day + " Year - " + year);
		}else {
			System.out.println(date.getMonth().toString()+"/"+ Integer.toString(date.getDayOfMonth())+"/"+ Integer.toString(date.getYear()));
			System.out.println(date);
			
			
			System.out.println("month = "+String.format("%02d", date.getMonthValue()));
			System.out.println("day = "+String.format("%02d", date.getDayOfMonth()));
			System.out.println("year = "+String.format("%02d", date.getYear()));
			
			
			
			
		}
		return date;
	}
	
	
	
	public static void zonedLocalDateTime() {
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		
		
		
		ZoneId easternTime = ZoneId.of("America/Montreal");
	    System.out.println("EST: "+LocalDateTime.now(easternTime));
	    System.out.println(LocalDateTime.now(ZoneOffset.UTC));
	    System.out.println(LocalDate.now(easternTime));
	    System.out.println(LocalDate.now(ZoneOffset.UTC));
		
	}
	
	public static void stringToLocalDate() {
		String date = "2020-01-24";
		System.out.println("String Date: "+ date);
		System.out.println("Local Date: "+LocalDate.now().plusMonths(3));
		System.out.println(LocalDate.parse(date));
	}
	
	


}
