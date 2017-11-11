package controller;
import java.io.*;
import java.util.*;
public class course implements Serializable {

	private String title;
	private ArrayList<String> post=new ArrayList<String>(25);
	private ArrayList<String> preReq=new ArrayList<String>(25);
	private ArrayList<String> instr=new ArrayList<String>(25);
	private String acronym;
	private String code;
	private int credits;
	private ArrayList<String> openfor=new ArrayList<String>(25);
	public course(String t,String acr, String cd, int crd)
	{
		title=t;
		acronym=acr;
		code=cd;
		credits=crd;
	}
	public void add_post(String m)
	{
		post.add(m);
	}
	public void add_preReq(String m)
	{
		preReq.add(m);
	}
	public void add_instr(String m)
	{
		instr.add(m);
	}
	public void  add_openfor(String m)
	{
		openfor.add(m);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<String> getPost() {
		return post;
	}
	public void setPost(ArrayList<String> post) {
		this.post = post;
	}
	public ArrayList<String> getPreReq() {
		return preReq;
	}
	public void setPreReq(ArrayList<String> preReq) {
		this.preReq = preReq;
	}
	public ArrayList<String> getInstr() {
		return instr;
	}
	public void setInstr(ArrayList<String> instr) {
		this.instr = instr;
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
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public ArrayList<String> getOpenfor() {
		return openfor;
	}
	public void setOpenfor(ArrayList<String> openfor) {
		this.openfor = openfor;
	}
	
}
