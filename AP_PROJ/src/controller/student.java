package controller;

import java.util.*;
public class student extends user
{
	private ArrayList<course> myCourses=new ArrayList<course>();
	
	public student(String f,String l, String uid, char ut, String pass )
	{
		super(f,l,uid,ut,pass);
	}
	

}
