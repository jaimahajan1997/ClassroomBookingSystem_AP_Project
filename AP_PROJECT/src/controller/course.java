
package controller;
import java.io.*;
import java.util.*;
public class course implements Serializable {

	private String title;
	public static Map<String,course> coursemap=new HashMap<String,course>();
	public static ArrayList<String[]> ll=new ArrayList<String[]>();
	private String post;
	private String preReq;
	private String instr;
	private String acronym;
	private String code;
	private String credits;
	private slot mon;
	private slot tues;
	private slot wed;
	private slot thurs;
	private slot fri;
	private ArrayList<slot> tut=new ArrayList<slot>();
	private slot lab;
	public static void init() throws ClassNotFoundException, IOException
	{
		ObjectInputStream in=null;
		ObjectInputStream in2=null;
		try	{	
						in=new ObjectInputStream(new FileInputStream(".\\src\\application\\Users\\courselist.txt"));	
						coursemap=(Map)in.readObject();											
		}	
		finally	
		{	
						in.close();	
						in2.close();
		}
	}

	public static course getcourse(String m1)
	{	
			return coursemap.get(m1);
										

	}
	public static void serialize() throws IOException
	{
		ObjectOutputStream out = null;
		try{
			System.out.println("Hello");
			out = new ObjectOutputStream(new FileOutputStream(".\\src\\application\\Users\\courselist.txt"));
			out.writeObject(coursemap);
		}
		finally{
			out.close();
		}
	}
	public static boolean deserialize(String m1)  
	{
		if(coursemap.size()!=0)
		{
									if(coursemap.containsKey(m1))
									{
										return false;
									}
									return true;
		}
		else
		{
			return true;
		}
	}
	public course(String type,String name,String code,String instructor,String credits,String acronym,String monday,String tuesday,String wednesday,String thursday,String friday,String tut,String lab,String pre,String post)
	{
		title=name;
		this.acronym=acronym;
		this.code=code;
		this.credits=credits;
		this.preReq=pre;
		this.post=post;
		this.instr=instructor;
		
		String[] a=monday.split("\\s+");
		if(a.length>1) {
		this.mon=new slot(a[0],a[1],"1",this,a[2],false,false);}
		 a=tuesday.split("\\s+");
		 if(a.length>1) {this.tues=new slot(a[0],a[1],"2",this,a[2],false,false);}
		 a=wednesday.split("\\s+");
		 if(a.length>1) {
		this.wed=new slot(a[0],a[1],"3",this,a[2],false,false);}
		a=thursday.split("\\s+");
		if(a.length>1) {this.thurs=new slot(a[0],a[1],"4",this,a[2],false,false);}
		 a=friday.split("\\s+");
		 if(a.length>1) {this.fri=new slot(a[0],a[1],"5",this,a[2],false,false);}
		a=tut.split("\\s+");
		if(a.length>1) {
			String d="";
			if(a[0].equals("Monday")) {
				d="1";
			}
			else if(a[0].equals("Tuesday")) {
				d="2";
			}
			else if(a[0].equals("Wednesday")) {
				d="3";
			}
			else if(a[0].equals("Thursday")) {
				d="4";
			}
			else if(a[0].equals("Friday")) {
				d="5";
			}
			
		this.tut.add(new slot(a[1],a[2],d,this,a[3],true,false));
		
		if (a.length>6) 
		{
	 d="";
			if(a[5].equals("Monday")) 
		{
			d="1";
		}
		else if(a[5].equals("Tuesday")) 
		{
			d="2";
		}
		else if(a[5].equals("Wednesday")) 
		{
			d="3";
		}
		else if(a[5].equals("Thursday")) 
		{
			d="4";
		}
		else if(a[5].equals("Friday")) 
		{
			d="5";
		}
			this.tut.add(new slot(a[6],a[7],d,this,a[8],true,false));
		}}
		if(acronym.equals("AP")) 
		{
			this.lab=new slot("12:00","13:00","4",this,"L21;L22;L23",false,true);
		}
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInst() {
		return instr;
	}
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCredits() {
		return credits;
	}
	public slot getMon() {
		return mon;
	}
	public slot getTues() {
		return tues;
	}
	public slot getWed() {
		return wed;
	}
	public slot getThurs() {
		return thurs;
	}
	public slot getFri() {
		return fri;
	}
	public ArrayList<slot> getTut() {
		return tut;
	}
	public slot getLab() {
		return lab;
	}
	public String getPre() {
		return preReq;
	}
	public String getPost() {
		return post;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	
	
}