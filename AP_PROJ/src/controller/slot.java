package controller;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class slot implements Serializable {

	
	
	private LocalTime start;
	private LocalTime end;
	private int day;
	private String course;
	private String venue;


	public slot(String s,String e,int d,String c,String v)
	{
	start=LocalTime.parse(s);
	end=LocalTime.parse(e);
	day=d;
	course=c;
	venue=v;
	}
	
	public LocalTime starttime() {
		return start;
	}
	public String venue() {
		return venue;
	}
	public LocalTime endtime() {
		return end;
	}
	public int day() {
		return day;
	}
	public String getPost() {
		return course;
	}
	
	
	
}
