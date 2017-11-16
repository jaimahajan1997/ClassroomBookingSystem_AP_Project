package controller;

import java.time.LocalDate;
import java.time.LocalTime;

public class Request 
{
	private String room;
	
	private LocalTime starttime;
	
	private LocalTime endtime;
	
	private String date;
	private String purpose;
	public LocalDate time;
	private user u;
	public Request(String arg0, LocalTime a, LocalTime b, String arg3,user us,String pp)
	{
		room=arg0;
		starttime=a;
		endtime=b;
		date=arg3;
		admin.reqs.add(this);
		u=us;
		purpose=pp;
	}

	public String getRoom() {
		return room;
	}
public String getpurpose() {
	return purpose;
}
	public void setRoom(String room) {
		this.room = room;
	}
	public user getuser() {
		return u;
	}
	public LocalTime getStarttime() {
		return starttime;
	}

	public void setStarttime(LocalTime starttime) {
		this.starttime = starttime;
	}

	public LocalTime getEndtime() {
		return endtime;
	}

	public void setEndtime(LocalTime endtime) {
		this.endtime = endtime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	
	

}
