package controller;
import java.io.*;
import java.util.*;
public class faculty extends user implements Serializable
{
	private ArrayList<course> myCourses=new ArrayList<course>();
	public faculty(String f,String l, String uid, char ut, String pass )
	{
		super(f,l,uid,ut,pass);
	}
	public void selectCourse()
	{
			
		
	}

}
	