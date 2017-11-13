package controller;
import java.io.*;
import java.util.*;
public class course implements Serializable {

	private String title;
	public static Map<String,course> coursemap=new HashMap<String,course>();
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
		if(a.length>0) {
		this.mon=new slot(a[0],a[1],1,acronym,a[2]);}
		 a=tuesday.split("\\s+");
		 if(a.length>1) {this.tues=new slot(a[0],a[1],2,acronym,a[2]);}
		 a=wednesday.split("\\s+");
		 if(a.length>1) {
		this.wed=new slot(a[0],a[1],3,acronym,a[2]);}
		a=thursday.split("\\s+");
		if(a.length>1) {this.thurs=new slot(a[0],a[1],4,acronym,a[2]);}
		 a=friday.split("\\s+");
		 if(a.length>1) {this.fri=new slot(a[0],a[1],5,acronym,a[2]);}
		a=tut.split("\\s+");
		if(a.length>1) {
			int d=1;
			if(a[0].equals("Monday")) {
				d=1;
			}
			else if(a[0].equals("Tuesday")) {
				d=2;
			}
			else if(a[0].equals("Wednesday")) {
				d=3;
			}
			else if(a[0].equals("Thursday")) {
				d=4;
			}
			else if(a[0].equals("Friday")) {
				d=5;
			}
			
		this.tut.add(new slot(a[1],a[2],d,acronym,a[3]));
		if (a.length>6) {
		d=1;
		if(a[5].equals("Monday")) {
			d=1;
		}
		else if(a[5].equals("Tuesday")) {
			d=2;
		}
		else if(a[5].equals("Wednesday")) {
			d=3;
		}
		else if(a[5].equals("Thursday")) {
			d=4;
		}
		else if(a[5].equals("Friday")) {
			d=5;
		}
		this.tut.add(new slot(a[6],a[7],d,acronym,a[8]));
		}}
		if(acronym.equals("AP")) {
		this.lab=new slot("12:00","13:00",4,acronym,"L21;L22;L23");}
		
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
