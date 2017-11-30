package controller;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class slot implements Serializable {

	private LocalTime start;
	private LocalTime end;
	private String day;
	public course _course;
	private String venue;
	public boolean tut;
	public boolean lab;


	public slot(String s,String e,String d,course c,String v,boolean a,boolean b)
	{
	start=LocalTime.parse(s);
	end=LocalTime.parse(e);
	day=d;
	_course=c;
	venue=v;
	tut=a;
	lab=b;
	}


	public LocalTime getStart() {
		return start;
	}


	public void setStart(LocalTime start) {
		this.start = start;
	}


	public LocalTime getEnd() {
		return end;
	}


	public void setEnd(LocalTime end) {
		this.end = end;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public course get_course() {
		return _course;
	}


	public void set_course(course _course) {
		this._course = _course;
	}


	public String getVenue() {
		return venue;
	}


	public void setVenue(String venue) {
		this.venue = venue;
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
	public String day() {
		return day;
	}
	public course getPost() {
		return _course;
	}
	
	
	
}