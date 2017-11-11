package controller;
import java.io.*;
import java.util.*;
public class user implements Serializable
{
	public static Map<String,user> userList=new HashMap<String,user>();
	private String fname;
	private String lname;
	private String userID;
	private char utype;
	private String password;
	public static void serialize() throws IOException
	{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Raghav\\workspace\\AP_PROJ\\src\\application\\Users\\userlist.txt"));
			out.writeObject(userList);
		}
		finally{
			out.close();
		}
	}
	public static boolean deserialize(String m1) throws IOException,ClassNotFoundException 
	{	
					ObjectInputStream in=null;	
					try	{	
									in=new ObjectInputStream(new FileInputStream("C:\\Users\\Raghav\\workspace\\AP_PROJ\\src\\application\\Users\\userlist.txt"));	
									Map<String,user> map=new HashMap<String,user>();
									map=(Map)in.readObject();
									if(map.containsKey(m1))
									{
										return false;
									}
									return true;
									
																		
					}	
					finally	
					{	
									in.close();	
					}
	}
	public user(String f,String l, String uid, char ut, String pass )
	{
		fname=f;
		lname=l;
		userID=uid;
		utype=ut;
		password=pass;
		userList.put(this.userID,this);
		try
		{
			serialize();
		}
		catch(IOException e)
		{
			
		}
		
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public char getUtype() {
		return utype;
	}
	public void setUtype(char utype) {
		this.utype = utype;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void change_password()
	{
		
		
	}
	
	
}
