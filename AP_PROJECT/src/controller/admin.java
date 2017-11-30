package controller;
import java.io.*;
import java.time.LocalTime;
import java.util.*;

public class admin extends user implements Serializable
{
	public static ArrayList<Request> reqs=new ArrayList<Request>();
	public static ArrayList<String> booked=new  ArrayList<String> ();
	public static void init() throws ClassNotFoundException, IOException
	{
		ObjectInputStream in=null;
		ObjectInputStream in1=null;
		try	{	
						in=new ObjectInputStream(new FileInputStream(".\\src\\application\\Users\\adminbookings.txt"));	
						booked=(ArrayList<String>) in.readObject();			
						in1=new ObjectInputStream(new FileInputStream(".\\src\\application\\Users\\request.txt"));	
						reqs=(ArrayList<Request>) in1.readObject();	
		}	
		finally	
		{	
						in.close();	
						in1.close();
		}
	}
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
	