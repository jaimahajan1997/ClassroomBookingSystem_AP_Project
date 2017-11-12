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
	private String mon;
	private String tues;
	private String wed;
	private String thurs;
	private String fri;
	private String tut;
	private String lab;

	public course(String type,String name,String code,String instructor,String credits,String acronym,String monday,String tuesday,String wednesday,String thursday,String friday,String tut,String lab,String pre,String post)
	{
		title=name;
		this.acronym=acronym;
		this.code=code;
		this.credits=credits;
		this.preReq=pre;
		this.post=post;
		this.instr=instructor;
		this.mon=monday;
		tues=tuesday;
		wed=wednesday;
		thurs=thursday;
		fri=friday;
		this.tut=tut;
		this.lab=lab;
		
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
	public String getMon() {
		return mon;
	}
	public String getTues() {
		return tues;
	}
	public String getWed() {
		return wed;
	}
	public String getThurs() {
		return thurs;
	}
	public String getFri() {
		return fri;
	}
	public String getTut() {
		return tut;
	}
	public String getLab() {
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
