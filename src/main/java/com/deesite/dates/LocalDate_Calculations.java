package com.deesite.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate_Calculations {
	public static LocalDate localDate;

	public static void main(String[] args) {
		System.out.println(getCurrentLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(getCurrentLocalDate().plusDays(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(getCurrentLocalDate().plusDays(2));

	}

	public static LocalDate getCurrentLocalDate() {
		localDate = LocalDate.now();
		return localDate;
	}

}
