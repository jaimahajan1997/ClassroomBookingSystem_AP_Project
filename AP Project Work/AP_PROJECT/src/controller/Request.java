package controller;

import java.io.FileInputStream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import java.io.*;
import java.util.*;
import java.time.LocalDateTime;
/**
 * Request class to make a Request object 
 * @author jaima
 *
 */
public class Request implements Serializable 
{
	private String room;
	private LocalTime starttime;
	private LocalTime endtime;
	public static int reqc;
	private String date;
	public int reqid=0;
	private String purpose;
	public String status;
	public LocalDateTime requestdate;
	private user u;
	/**
	 * 	Constructor
	 * @param arg0 room 
	 * @param a  starttime
	 * @param b endtime
	 * @param arg3 date
	 * @param us user
	 * @param pp purpose
	 */
	public Request(String arg0, LocalTime a, LocalTime b, String arg3,user us,String pp)
	{
		room=arg0;
		starttime=a;
		endtime=b;
		date=arg3;
		admin.reqs.add(this);
		u=us;
		purpose=pp;
		status="Pending";
		reqid=reqc++;
		requestdate=LocalDateTime.now();
		
	}
	/**
	 * Init class for request, runs when java program is loaded
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static void init() throws ClassNotFoundException, IOException
	{
		ObjectInputStream in=null;
		try	{	
						in=new ObjectInputStream(new FileInputStream(".\\src\\application\\Users\\reqc.txt"));	
						reqc=(int)in.readObject();	
						
		}	
		finally	
		{	
						in.close();	
		}
		
	}
	/**
	 * Serializing unique request id count
	 * @throws IOException
	 */
	public static void serialize() throws IOException
	{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream(".\\src\\application\\Users\\reqc.txt"));
			out.writeObject(reqc);
		}
		finally{
			out.close();
		}
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
