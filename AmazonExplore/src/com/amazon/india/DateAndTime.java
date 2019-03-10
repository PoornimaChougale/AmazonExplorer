package com.amazon.india;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateAndTime {

	public static void main(String[] args) 
	{
		
		
		SimpleDateFormat FormatDate=new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		Date current = new Date();
		String sdate=FormatDate.format(current);
		
		System.out.println(sdate);

	}

}
