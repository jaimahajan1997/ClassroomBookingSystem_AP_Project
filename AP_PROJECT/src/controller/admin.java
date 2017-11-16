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
		try	{	
						in=new ObjectInputStream(new FileInputStream(".\\src\\application\\Users\\adminbookings.txt"));	
						booked=(ArrayList<String>) in.readObject();											
		}	
		finally	
		{	
						in.close();	
		}
	}
	public static void serialize() throws IOException
	{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream(".\\src\\application\\Users\\adminbookings.txt"));
			out.writeObject(booked);
		}
		finally{
			out.close();
		}
	}
	
	public admin(String f,String l, String uid, char ut, String pass )
	{
		super(f,l,uid,ut,pass);
	}
	

}
	