package controller;
import java.io.*;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.time.temporal.ChronoUnit;
/**
 * Admin class
 * @author Jai and Raghav
 *
 */
public class admin extends user implements Serializable
{
	public static ArrayList<Request> reqs=new ArrayList<Request>();
	public static ArrayList<String> booked=new  ArrayList<String> ();
	/**
	 * Init method runs when the java program loads
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static void init() throws ClassNotFoundException, IOException
	{
		ObjectInputStream in=null;
		ObjectInputStream in1=null;
		try	{	
						in=new ObjectInputStream(new FileInputStream(".\\src\\application\\Users\\adminbookings.txt"));	
						System.out.println("fbfb2");

						
						booked=(ArrayList<String>) in.readObject();	

						admin.serialize();
						System.out.println(booked+" "+booked.size());
						in1=new ObjectInputStream(new FileInputStream(".\\src\\application\\Users\\request.txt"));	
						reqs=(ArrayList<Request>) in1.readObject();	
						ArrayList<Request> tgt=new ArrayList<Request>();
						for(Request t:reqs)
						{
							
							LocalDateTime toDateTime = LocalDateTime.now();
							LocalDateTime tempDateTime = LocalDateTime.from(t.requestdate);
							long days = tempDateTime.until(toDateTime, ChronoUnit.DAYS);
							tempDateTime = tempDateTime.plusDays(days);
							System.out.println(days+ " ");
							if(days>5)
							{
								tgt.add(t);
							}
							
						}
						for(Request t:tgt)
						{
							reqs.remove(t);
						}
		}	
		catch(Exception e) {
			booked.add("L21 4 12:00 13:00 ");
			booked.add("L22 4 12:00 13:00 ");
			booked.add("L23 4 12:00 13:00 ");
			booked.add("LR1 5 16:00 17:30");
			booked.add("LR2 5 16:00 17:30");
			booked.add("LR3 5 16:00 17:30");
			booked.add("LR1 1  12:00 13:00 ");
			booked.add("LR2 1   12:00 13:00 ");
			booked.add("S01 1   12:00 13:00 ");
			booked.add("S02 1   12:00 13:00 ");
			booked.add("LR2 3   13:30 14:30 ");
			booked.add("LR3 3   13:30 14:30 ");
			booked.add("C22 3   13:30 14:30 ");
			booked.add("C23 3   13:30 14:30 ");
		}
		finally	
		{	
						in.close();	
						in1.close();
		}
	}
	/**
	 * Serializing adminbookings and requests by students in two text files.
	 * @throws IOException
	 */
	public static void serialize() throws IOException
	{
		ObjectOutputStream out = null;
		ObjectOutputStream out1 = null;

		try{
			
			out = new ObjectOutputStream(new FileOutputStream(".\\src\\application\\Users\\adminbookings.txt"));
			out.writeObject(booked);
			out1 = new ObjectOutputStream(new FileOutputStream(".\\src\\application\\Users\\request.txt"));
			out1.writeObject(reqs);
		}
		finally{
			out.close();
			out1.close();
		}
	}
	
	public admin(String f,String l, String uid, char ut, String pass )
	{
		super(f,l,uid,ut,pass);
	}
	

}
	