package controller;
import java.io.*;
import java.util.*;

public class admin extends user implements Serializable
{
	public static ArrayList<Request> reqs=new ArrayList<Request>();
	public admin(String f,String l, String uid, char ut, String pass )
	{
		super(f,l,uid,ut,pass);
	}
	

}
	
