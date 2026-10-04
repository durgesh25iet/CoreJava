package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormate {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dob = sdf.format(d);
		System.out.println(dob);

		System.out.println("================================================");

		String today = "2005-08-09";

		Date dd = sdf.parse(today);
		System.out.println(dd);

	}

}
