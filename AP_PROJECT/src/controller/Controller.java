package controller;

import java.io.IOException;
import java.util.*;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Instant;
import javafx.scene.control.DatePicker;
//Sources-https://stackoverflow.com/questions/37559584/how-to-add-dynamic-columns-and-rows-to-tableview-in-java-fxml,https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.net.URL;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.net.URL;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {
	public static user current=null;
	public static int i=0;
	public static String err="";
	public static String one="";
	public static String two="";
	public static String three="";
	public static String four="";
	public static String five="";
	public static String ty="";

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 

	{
		if(current!=null)
		{
			myname.setText(current.getFname()+" "+current.getLname());
			myid.setText(current.getUserID());
			  if(current.getUtype()=='s')
			  {mytype.setText("Student");}
			  else if(current.getUtype()=='f')
			  {mytype.setText("Faculty");}
			  else
			  {mytype.setText("Admin");}
//			  
			  			  
			  
//				for(int i=0;i<current.myCourses.size();i++)
//					  System.out.println(current.myCourses.get(i).getAcronym());
//			  
				 int total=current.myCourses.size();
				 if(total!=0)
				 {
					 c1.setText(current.myCourses.get(0).getAcronym());
					 d1.setText(current.myCourses.get(0).getCredits());
					 total--;
				 }
				 if(total!=0)
				 {
					 c2.setText(current.myCourses.get(1).getAcronym());
					 d2.setText(current.myCourses.get(1).getCredits());
					 total--;
				 }
				 if(total!=0)
				 {
					 c3.setText(current.myCourses.get(2).getAcronym());
					 d3.setText(current.myCourses.get(2).getCredits());
					 total--;
				 }
				 if(total!=0)
				 {
					 c4.setText(current.myCourses.get(3).getAcronym());
					 d4.setText(current.myCourses.get(3).getCredits());
					 total--;
				 }
				 if(total!=0)
				 {
					 c5.setText(current.myCourses.get(4).getAcronym());
					 d5.setText(current.myCourses.get(4).getCredits());
					 total--;
				 }
				 if(total!=0)
				 {
					 c6.setText(current.myCourses.get(5).getAcronym());
					 d6.setText(current.myCourses.get(5).getCredits());
					 total--;
				 }
				 //System.out.println("timetable");
				 //SORTING ARRAY
				 ArrayList<ArrayList<slot>> lista=new ArrayList<ArrayList<slot>>();
				 lista.add(current.mon);
				 lista.add(current.tues);
				 lista.add(current.wed);
				 lista.add(current.thurs);
				 lista.add(current.fri);
				 for(int indexi=0;indexi<=4;indexi++)
				 {
				   Collections.sort(lista.get(indexi), new Comparator<slot>() 
				   {
				        @Override
				        public int compare(controller.slot o1, controller.slot o2) 
				        {
						        if(o1.getStart().isBefore(o2.getStart())==true)
								   {
									   return -1;
								   }

							      	return 1;
							        
				        }
				    });
				 }
				 
				 
				 int size=current.mon.size();
				 Label mm[]={mon1,mon2,mon3,mon4,mon5,mon6,mon7,mon8,mon9};
				 for(int u=0;u<current.mon.size();u++)
				 {
					 if(current.mon.get(u).tut==true)
					 {
						 mm[u].setText(current.mon.get(u)._course.getAcronym()+" Tut \n"+current.mon.get(u).getVenue()+"\n"+current.mon.get(u).getStart() +":"+ current.mon.get(u).getEnd());
						 continue;
					 }
					 if(current.mon.get(u).lab==true)
					 {
						 mm[u].setText(current.mon.get(u)._course.getAcronym()+" Lab \n"+current.mon.get(u).getVenue()+"\n"+current.mon.get(u).getStart() +":"+ current.mon.get(u).getEnd());
						 continue;
					 }
					 mm[u].setText(current.mon.get(u)._course.getAcronym()+"\n"+current.mon.get(u).getVenue()+"\n"+current.mon.get(u).getStart() +":"+ current.mon.get(u).getEnd());
				 }
				 Label mm1[]={tues1,tues2,tues3,tues4,tues5,tues6,tues7,tues8,tues9};
				 for(int u=0;u<current.tues.size();u++)
				 {
					 if(current.tues.get(u).tut==true)
					 {
						 mm1[u].setText(current.tues.get(u)._course.getAcronym()+" Tut \n"+current.tues.get(u).getVenue()+"\n"+current.tues.get(u).getStart() +":"+ current.tues.get(u).getEnd());
						 continue;
					 }
					 if(current.tues.get(u).lab==true)
					 {
						 mm1[u].setText(current.tues.get(u)._course.getAcronym()+" Lab \n"+current.tues.get(u).getVenue()+"\n"+current.tues.get(u).getStart() +":"+ current.tues.get(u).getEnd());
						 continue;
					 }
					 mm1[u].setText(current.tues.get(u)._course.getAcronym()+"\n"+current.tues.get(u).getVenue()+"\n"+current.tues.get(u).getStart() +":"+ current.tues.get(u).getEnd());
				 }
				 Label mm2[]={wed1,wed2,wed3,wed4,wed5,wed6,wed7,wed8,wed9};
				 for(int u=0;u<current.wed.size();u++)
				 {
					 if(current.wed.get(u).tut==true)
					 {
						 mm2[u].setText(current.wed.get(u)._course.getAcronym()+" Tut \n"+current.wed.get(u).getVenue()+"\n"+current.wed.get(u).getStart() +":"+ current.wed.get(u).getEnd());
						 continue;
					 }
					 if(current.wed.get(u).lab==true)
					 {
						 mm2[u].setText(current.wed.get(u)._course.getAcronym()+" Lab \n"+current.wed.get(u).getVenue()+"\n"+current.wed.get(u).getStart() +":"+ current.wed.get(u).getEnd());
						 continue;
					 }
					 mm2[u].setText(current.wed.get(u)._course.getAcronym()+"\n"+current.wed.get(u).getVenue()+"\n"+current.wed.get(u).getStart() +":"+ current.wed.get(u).getEnd());
				 }
				 
				 Label mm3[]={thurs1,thurs2,thurs3,thurs4,thurs5,thurs6,thurs7,thurs8,thurs9};
				 for(int u=0;u<current.thurs.size();u++)
				 {
					 if(current.thurs.get(u).tut==true)
					 {
						 mm3[u].setText(current.thurs.get(u)._course.getAcronym()+" Tut \n"+current.thurs.get(u).getVenue()+"\n"+current.thurs.get(u).getStart() +":"+ current.thurs.get(u).getEnd());
						 continue;
					 }
					 if(current.thurs.get(u).lab==true)
					 {
						 mm3[u].setText(current.thurs.get(u)._course.getAcronym()+" Lab \n"+current.thurs.get(u).getVenue()+"\n"+current.thurs.get(u).getStart() +":"+ current.thurs.get(u).getEnd());
						 continue;
					 }
					 mm3[u].setText(current.thurs.get(u)._course.getAcronym()+"\n"+current.thurs.get(u).getVenue()+"\n"+current.thurs.get(u).getStart() +":"+ current.thurs.get(u).getEnd());
				 }
				 
				 Label mm4[]={fri1,fri2,fri3,fri4,fri5,fri6,fri7,fri8,fri9};
				 for(int u=0;u<current.fri.size();u++)
				 {
					 if(current.fri.get(u).tut==true)
					 {
						 mm4[u].setText(current.fri.get(u)._course.getAcronym()+" Tut \n"+current.fri.get(u).getVenue()+"\n"+current.fri.get(u).getStart() +":"+ current.fri.get(u).getEnd());
						 continue;
					 }
					 if(current.fri.get(u).lab==true)
					 {
						 mm4[u].setText(current.fri.get(u)._course.getAcronym()+" Lab \n"+current.fri.get(u).getVenue()+"\n"+current.fri.get(u).getStart() +":"+ current.fri.get(u).getEnd());
						 continue;
					 }
					 mm4[u].setText(current.fri.get(u)._course.getAcronym()+"\n"+current.fri.get(u).getVenue()+"\n"+current.fri.get(u).getStart() +":"+ current.fri.get(u).getEnd());
				 }
				 
				 
//				 for(int i=0;i<current.mon.size();i++)
//				 {
//					 System.out.print(current.mon.get(i)._course.getAcronym()+" ");
//				 }
//				 System.out.println("");
//				 for(int i=0;i<current.tues.size();i++)
//				 {
//					 System.out.print(current.tues.get(i)._course.getAcronym()+" ");
//				 }
//				 System.out.println("");
//				 for(int i=0;i<current.wed.size();i++)
//				 {
//					 System.out.print(current.wed.get(i)._course.getAcronym()+" ");
//				 }
//				 System.out.println("");
//				 for(int i=0;i<current.thurs.size();i++)
//				 {
//					 System.out.print(current.thurs.get(i)._course.getAcronym()+" ");
//				 }
//				 System.out.println("");
//				 for(int i=0;i<current.fri.size();i++)
//				 {
//					 System.out.print(current.fri.get(i)._course.getAcronym()+" ");
//				 }
//				 System.out.println("");
				 
				 
			
		}
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		ArrayList<String> list4 = new ArrayList<String>();
		
		list.add("C01");
		list.add("C02");
		list.add("C03");
		list.add("C11");
		list.add("C12");
		list.add("C13");
		list.add("C21");
		list.add("C22");
		list.add("C23");
		list.add("C24");
		list.add("LR1");
		list.add("LR2");
		list.add("LR3");
		list.add("L21");
		list.add("L22");
		list.add("L23");
		list.add("S01");
		list.add("S02");
		
		list2.add("Monday");
		list2.add("Tuesday");
		list2.add("Wednesday");
		list2.add("Thursday");
		list2.add("Friday");
		list2.add("Saturday");
		list2.add("Sunday");
		
		ArrayList<String> names = new ArrayList<String>(course.coursemap.keySet());
		//System.out.println(course.coursemap);
		list3.addAll(names);
		//list4.addAll(names);
		
		 ObservableList<String> roomchoice = FXCollections.observableList(list);
		 ObservableList<String> daychoice = FXCollections.observableList(list2);
		 ObservableList<String> coursechoice = FXCollections.observableList(list3);
		 //System.out.println(list3);
		 
		 day.setValue("Monday");
		 day.setItems(daychoice);
		 room.setValue("C01");
		 room.setItems(roomchoice);
		 roomno.setValue("C01");
		 roomno.setItems(roomchoice);
		 day2.setValue("Monday");
		 day2.setItems(daychoice);
		 courseadd.setValue("DM");
		 courseadd.setItems(coursechoice);
		 coursedrop.setValue("DM");
		 coursedrop.setItems(coursechoice);
		 

		 
		
	}
	@FXML
	private Button btn2;
	public void page_1(ActionEvent event) throws IOException,ClassNotFoundException  
	{
		 Parent root = FXMLLoader.load(getClass().getResource("/application/page_1.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
	}
	@FXML
	private Button btn0;
	@FXML 
	private TextField t1;
	@FXML
	private TextField t2;
	//FOR SIGNIN
	public void signin(ActionEvent event) throws IOException,ClassNotFoundException  
	{
//		for (Entry<String, user> entry : user.userList.entrySet()) {
//		    System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
		 Node node=(Node) event.getSource();
		 Main.primaryStage=(Stage) node.getScene().getWindow();
		  //Main.primaryStage.setFullScreen(true);
		 if(t1.getText().equals("")||t2.getText().equals(""))
		 {
		        Alert a = new Alert(AlertType.INFORMATION);
		        a.setTitle("Error");
		        a.setHeaderText("All fields Mandatory");
		        a.setResizable(true);
		        String version = System.getProperty("java.version");
		        String content = String.format("Please fill all fields", version);
		        a.setContentText(content);
		        a.showAndWait();
		 }
		 else if(user.deserialize(t1.getText())==true)
		 {
		        Alert a = new Alert(AlertType.INFORMATION);
		        a.setTitle("Error");
		        a.setHeaderText("Wrong credentials");
		        a.setResizable(true);
		        String version = System.getProperty("java.version");
		        String content = String.format("Invalid email id or password", version);
		        a.setContentText(content);
		        a.showAndWait();
		        System.out.println("NO USER");
		 }
		 else if(user.deserialize(t1.getText())==false)
		 {	
			user p=user.getuser(t1.getText()); 
			if (!p.getPassword().equals(t2.getText()))
			{
		        Alert a = new Alert(AlertType.INFORMATION);
		        a.setTitle("Error");
		        a.setHeaderText("Wrong credentials");
		        a.setResizable(true);
		        String version = System.getProperty("java.version");
		        String content = String.format("Invalid email id or password", version);
		        a.setContentText(content);
		        a.showAndWait();
		        System.out.println("wrong pass");
			}
		 else
		 {
			 current=p;
	      if(p.getUtype()=='s')
	      {
			  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage.fxml"));
			  Scene scene = new Scene(root);
			  Main.primaryStage.setScene(scene);
	    	  
	      }
	      else if(p.getUtype()=='f')
	      {
			  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage2.fxml"));
			  Scene scene = new Scene(root);
			  Main.primaryStage.setScene(scene);
	      }
	      else
	      {
			  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage3.fxml"));
			  Scene scene = new Scene(root);
			  Main.primaryStage.setScene(scene);
	      }

		  ////Main.primaryStage.show();
		 }
		 }
		
	}
	
	
	@FXML
	private Button btn1;
	
	public void gotoRegister(ActionEvent event) throws IOException  {
		 Node node=(Node) event.getSource();
		 Main.primaryStage=(Stage) node.getScene().getWindow();
		  //Main.primaryStage.setFullScreen(true);
		  Parent root = FXMLLoader.load(getClass().getResource("/application/type.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  ////Main.primaryStage.show();
		
	}
	//for student registering
	
	@FXML
	private Button btnlogout;
	@FXML 
	private TextField txt1;
	@FXML 
	private TextField txt2;
	@FXML 
	private TextField txt3;
	@FXML 
	private TextField txt4;

	

	public void gotopage_1(ActionEvent event) throws IOException,ClassNotFoundException 
	{
		if(txt1.getText().equals("") || txt2.getText().equals("") || txt3.getText().equals("") || txt4.getText().equals(""))
		{
	        Alert a = new Alert(AlertType.INFORMATION);
	        a.setTitle("Error");
	        a.setHeaderText("All fields Mandatory");
	        a.setResizable(true);
	        String version = System.getProperty("java.version");
	        String content = String.format("Please fill all fields", version);
	        a.setContentText(content);
	        a.showAndWait();
		}
		else
		{
		  if (user.deserialize(txt3.getText()))
		  {
		  user newbie=new student(txt1.getText(),txt2.getText(),txt3.getText(),'s',txt4.getText());
		  
		  //user.serialize(newbie);
		  System.out.println(newbie.getFname()+newbie.getLname());
		  Parent root = FXMLLoader.load(getClass().getResource("/application/page_1.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  }
		  else
		  {
		        Alert a = new Alert(AlertType.INFORMATION);
		        a.setTitle("Error");
		        a.setHeaderText("Invalid email");
		        a.setResizable(true);
		        String version = System.getProperty("java.version");
		        String content = String.format("There is already an account associated with this email", version);
		        a.setContentText(content);
		        a.showAndWait();
		  }
		}
		  
		
	}
	//for faculty registering
	@FXML
	private Button btn92;
	@FXML 
	private TextField txtj1;
	@FXML 
	private TextField txtj2;
	@FXML 
	private TextField txtj3;
	@FXML 
	private TextField txtj4;

	

	public void gotopage_j1(ActionEvent event) throws IOException,ClassNotFoundException  
	{

		if(txtj1.getText().equals("") || txtj2.getText().equals("") || txtj3.getText().equals("") || txtj4.getText().equals(""))
		{
	        Alert a = new Alert(AlertType.INFORMATION);
	        a.setTitle("Error");
	        a.setHeaderText("All fields Mandatory");
	        a.setResizable(true);
	        String version = System.getProperty("java.version");
	        String content = String.format("Please fill all fields", version);
	        a.setContentText(content);
	        a.showAndWait();
		}
		else
		{
			if (user.deserialize(txtj3.getText()))
			{
		  user newbie=new faculty(txtj1.getText(),txtj2.getText(),txtj3.getText(),'f',txtj4.getText());
		  
		  //user.serialize(newbie);
		  System.out.println(newbie.getFname()+newbie.getLname());
		  Parent root = FXMLLoader.load(getClass().getResource("/application/page_1.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		}
		  else
		  {
		        Alert a = new Alert(AlertType.INFORMATION);
		        a.setTitle("Error");
		        a.setHeaderText("Invalid email");
		        a.setResizable(true);
		        String version = System.getProperty("java.version");
		        String content = String.format("There is already an account associated with this email", version);
		        a.setContentText(content);
		        a.showAndWait();
		  }
		  
		}
		  
		
	}

	@FXML
	//for admin registering
	private Button btn911;
	@FXML 
	private TextField txti1;
	@FXML 
	private TextField txti2;
	@FXML 
	private TextField txti3;
	@FXML 
	private TextField txti4;

	
	//Register button for admin
	public void gotopage_i1(ActionEvent event) throws IOException , ClassNotFoundException 
	{
		if(txti1.getText().equals("") || txti2.getText().equals("") || txti3.getText().equals("") || txti4.getText().equals(""))
		{
	        Alert a = new Alert(AlertType.INFORMATION);
	        a.setTitle("Error");
	        a.setHeaderText("All fields Mandatory");
	        a.setResizable(true);
	        String version = System.getProperty("java.version");
	        String content = String.format("Please fill all fields", version);
	        a.setContentText(content);
	        a.showAndWait();
		}
		else
		{
		  if(txti4.getText().equals("iamadmin") && user.deserialize(txti3.getText())==true)
		  {
			  user newbie=new admin(txti1.getText(),txti2.getText(),txti3.getText(),'a',txti4.getText());
			  //user.serialize(newbie);
			  System.out.println(newbie.getFname()+newbie.getLname());
			  Parent root = FXMLLoader.load(getClass().getResource("/application/page_1.fxml"));
			  Scene scene = new Scene(root);
			  Main.primaryStage.setScene(scene);
			  
		  }
		  else if(!txti4.getText().equals("iamadmin"))
		  {
		        Alert a = new Alert(AlertType.INFORMATION);
		        a.setTitle("Error");
		        a.setHeaderText("Wrong Admin Credentials");
		        a.setResizable(true);
		        String version = System.getProperty("java.version");
		        String content = String.format("Reenter Admin Credentials to create account", version);
		        a.setContentText(content);
		        a.showAndWait();
		  }
		  else
		  {
		        Alert a = new Alert(AlertType.INFORMATION);
		        a.setTitle("Error");
		        a.setHeaderText("Invalid email");
		        a.setResizable(true);
		        String version = System.getProperty("java.version");
		        String content = String.format("There is already an account associated with this email", version);
		        a.setContentText(content);
		        a.showAndWait();
		  }
		}
		  
		
	}
	//FOR VIEWING PROFILE
	@FXML
	private Button viewprofile;
	@FXML
	private Label myname=new Label();
	@FXML
	private Label myid=new Label();
	@FXML
	private Label mytype=new Label();
	
	public void lookatmyprofile(ActionEvent event) throws IOException  
	{
		  Parent root = FXMLLoader.load(getClass().getResource("/application/MyProfile.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);

		
	}
	//FOR CHANGING PASSWORD
	@FXML
	private Button submitnewpassword;
	@FXML
	private TextField old;
	@FXML
	private TextField new1;
	@FXML
	private TextField new2;
	public void resetpassword(ActionEvent event) throws IOException 
	{
		if(old.getText().equals("") || new1.getText().equals("") || new2.getText().equals(""))
		{
			showerrorbox("All Fields Mandatory","Please fill all fields");
		}
		else
		{
			if(old.getText().equals(current.getPassword()))
			{
				if(new1.getText().equals(new2.getText()))
				{
					  current.setPassword(new1.getText());
					  user.serialize();
				      if(current.getUtype()=='s')
				      {
						  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage.fxml"));
						  Scene scene = new Scene(root);
						  Main.primaryStage.setScene(scene);
				    	  
				      }
				      else if(current.getUtype()=='f')
				      {
						  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage2.fxml"));
						  Scene scene = new Scene(root);
						  Main.primaryStage.setScene(scene);
				      }
				      else
				      {
						  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage3.fxml"));
						  Scene scene = new Scene(root);
						  Main.primaryStage.setScene(scene);
				      }

				}
				else
				{
					showerrorbox("Password Field Error","New Password fields do not match");
				}
			}
			else
			{	
				showerrorbox("Wrong Password","Old Password entered is invalid");
			}
		}
		
	}
	//For Requesting Booking
	@FXML
	private Button submitrequest;
	@FXML
	private ChoiceBox<String> roomno=new ChoiceBox<String>();
	@FXML
	private TextField purpose;
	@FXML
	private TextField starttime;
	@FXML
	private TextField endtime;
	@FXML
	private ChoiceBox<String> day=new ChoiceBox<String>();
	public void makerequest(ActionEvent event) throws IOException 
	{
		if(endtime.getText().equals("") || starttime.getText().equals("")|| purpose.getText().equals("") )
		{
			showerrorbox("All Fields Mandatory","Please fill all fields");
		}
		else
		{
			try
			{
				LocalTime a=LocalTime.parse(starttime.getText());
				LocalTime b=LocalTime.parse(endtime.getText());
				if(a.isAfter(LocalTime.MAX) || b.isAfter(LocalTime.MAX) )
				{
					showerrorbox("Time Format Error","Time must be between 00:00 and 23:59.");
				}
				else
				{
					if(a.compareTo(b)==1)
					{
						showerrorbox("Duration Error","Start Time should be less than End Time. ");
					}
					else
					{
						  Request m=new Request(roomno.getValue(),a,b,day.getValue(),current,purpose.getText());
						  m.time=LocalDate.now();
						  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage.fxml"));
						  Alert r = new Alert(AlertType.INFORMATION);
					        r.setTitle("Request Made");
					        r.setHeaderText("Request Made Successfully");
					        r.setResizable(true);
					        String version = System.getProperty("java.version");
					        String content = String.format("You Should Get a responce from the Admin Soon. Check Notifications for confirmation", version);
					        r.setContentText(content);
					        r.showAndWait();
						  Scene scene = new Scene(root);
						  Main.primaryStage.setScene(scene);
					}
				}
				
				
				
			}
			catch(Exception e)
			{
				showerrorbox("Illegal Time","Please enter time in given format");
			}

			
		}
	}
	
	//BOOK A ROOM
	@FXML
	private Button bookroom;
	@FXML
	private TextField purpose2;
	@FXML
	private TextField starttime2;
	@FXML
	private TextField endtime2;
	@FXML
	private ChoiceBox<String> day2=new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String> room=new ChoiceBox<String>();
	public void bookmyroom(ActionEvent event) throws IOException 
	{
		String eetime="";
		String sstime="";
		String pp="";
		String dayy="";
		String rroom="";
		if(ty.equals("s")) {
			eetime=one;
			 sstime=two;
			 pp=three;
			 dayy=four;
			 rroom=five;
		}
		else {
		 eetime=endtime2.getText();
		 sstime=starttime2.getText();
		 pp=purpose2.getText();
		 dayy=day2.getValue();
		 rroom=room.getValue();}

		if(eetime.equals("") || sstime.equals("")|| pp.equals("") )
		{
			if(ty.equals("")) {
				err="All Fields Mandatory"+" , " +"Please fill all fields";
			}
			else {
			showerrorbox("All Fields Mandatory","Please fill all fields");}
		}
		else
		{
			try
			{
				LocalTime a=LocalTime.parse(sstime);
				LocalTime b=LocalTime.parse(eetime);
				if(a.isAfter(LocalTime.MAX) || b.isAfter(LocalTime.MAX) )
				{
					if(ty.equals("")) {
						err="Time Format Error, Time must be between 00:00 and 23:59.";
					}
					else {
					showerrorbox("Time Format Error","Time must be between 00:00 and 23:59.");}
				}
				else
				{
					if(a.compareTo(b)==1)
					{
						if(ty.equals("")) {
							err="Duration Error "+" Start Time should be less than End Time. ";
						}
						else {
						showerrorbox("Duration Error","Start Time should be less than End Time. ");}
					}
					else
					{
						String d="";
						if(dayy.equals("Monday")) {
							d="1";
						}
						else if(dayy.equals("Tuesday")) {
							d="2";
						}
						else if(dayy.equals("Wednesday")) {
							d="3";
						}
						else if(dayy.equals("Thursday")) {
							d="4";
						}
						else if(dayy.equals("Friday")) {
							d="5";
						}
							//CHECK FOR CLASH AND THEN BOOK
						boolean bool=false;
						for(course e:course.coursemap.values()) {

								try {
									//System.out.println(e.getAcronym()+"  "+d+e.getMon().day()+d.equals(e.getMon().day())+" "+rroom.equals(e.getMon().venue())+" "+e.getMon().starttime().isBefore(b) +" " +a.isBefore(e.getMon().endtime()));


								if(d.equals(e.getMon().day())&&rroom.equals(e.getMon().venue())&&e.getMon().starttime().isBefore(b) && a.isBefore(e.getMon().endtime())) {
									bool=true;
									//System.out.println("1"+d.equals(e.getMon().day())+" "+rroom.equals(e.getMon().venue())+" "+e.getMon().starttime().isBefore(b) +" " +a.isBefore(e.getMon().endtime()));
									break;
								}}
								catch(Exception f){
									;
								}
								try {

								if(d.equals(e.getTues().day())&&rroom.equals(e.getTues().venue())&&e.getTues().starttime().isBefore(b) && a.isBefore(e.getTues().endtime())) {
									bool=true;
									//System.out.println("2");
									break;
								}}
								catch(Exception f){
									;
								}
								try {
								if(d.equals(e.getThurs().day())&&rroom.equals(e.getThurs().venue())&&e.getThurs().starttime().isBefore(b) && a.isBefore(e.getThurs().endtime())) {
									bool=true;
									//System.out.println("3");
									break;
								}}
								catch(Exception f){
									;
								}
								try {
								if(d.equals(e.getWed().day())&&rroom.equals(e.getWed().venue())&&e.getWed().starttime().isBefore(b) && a.isBefore(e.getWed().endtime())) {
									bool=true;
									//System.out.println("4");
									break;
								}}
								catch(Exception f){
									;
								}
								try {
								if(d.equals(e.getFri().day())&&rroom.equals(e.getFri().venue())&&e.getFri().starttime().isBefore(b) && a.isBefore(e.getFri().endtime())) {
									bool=true;
									//System.out.println("5");
									break;
								}}
								catch(Exception f){
									;
								}
								try {
								if(d.equals(e.getLab().day())&&rroom.equals(e.getLab().venue())&&e.getLab().starttime().isBefore(b) && a.isBefore(e.getLab().endtime())) {
									bool=true;
									//System.out.println("6");
									break;
								}}
								catch(Exception f){
									;
								}
								try {
								if(d.equals(e.getTut().get(0).day())&&rroom.equals(e.getTut().get(0).venue())&&e.getTut().get(0).starttime().isBefore(b) && a.isBefore(e.getTut().get(0).endtime()) || (d.equals(e.getTut().get(1).day())&& rroom.equals(e.getTut().get(1).venue())&&e.getTut().get(1).starttime().isBefore(b) && a.isBefore(e.getTut().get(1).endtime())) ) {
									bool=true;
									//System.out.println("7");
									break;
								}}
								catch(Exception f){
									;
								}
								
							}
						try {
							//System.out.println("1"+bool);
							LocalTime x=LocalTime.parse(sstime);
							LocalTime y=LocalTime.parse(eetime);

							for(String aa:admin.booked) {
								
								String[] spl=aa.split("\\s+");
								LocalTime x1=LocalTime.parse(spl[2]);
								LocalTime y1=LocalTime.parse(spl[3]);
								
								if(rroom.equals(spl[0]) && d.equals(spl[1]) && x.isBefore(y1) && x1.isBefore(y)) {
									bool=true;
								}
							}
							
							}
							catch(Exception e){
								//System.out.println("9"+bool);
							}
							if(bool==false) {
								
								System.out.println("Room Booked");
								
								admin.booked.add((rroom+" "+d+" "+sstime+" "+eetime));
								admin.serialize();
							}
							else {
								if(ty.equals("s")) {
									err="Request to book"+rroom+" on "+dayy+" during "+sstime+"-"+eetime+" clashes with previously made booking.";
								}
								System.out.println("Sorry this request clashes with previously made booking.");
							}
					}
				}
				
				
				
			}
			catch(Exception e)
			{
				System.out.println();
				showerrorbox("Illegal Time","Please enter time in given format");
			}

			
		}
		
	}
	
	
	
	
	
	//BACK BUTTON FOR INSIDE ACCOUNT
	private Button goback;
	public void gotolast(ActionEvent event) throws IOException 
	{
        user p=current;
	      if(p.getUtype()=='s')
	      {
			  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage.fxml"));
			  Scene scene = new Scene(root);
			  Main.primaryStage.setScene(scene);
	    	  
	      }
	      else if(p.getUtype()=='f')
	      {
			  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage2.fxml"));
			  Scene scene = new Scene(root);
			  Main.primaryStage.setScene(scene);
	      }
	      else
	      {
			  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage3.fxml"));
			  Scene scene = new Scene(root);
			  Main.primaryStage.setScene(scene);
	      }
	}
	
	@FXML
	private Button mycoursesback;
	public void mycoursesback(ActionEvent event) throws IOException  
	{
		Parent root = FXMLLoader.load(getClass().getResource("/application/selectCourse.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
	}
	
	@FXML
	private Button btn3;
	
	public void gotohomepage(ActionEvent event) throws IOException  
	{
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Register.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button bookk;
	@FXML
	private TextField tbookk;
	public void bookk(ActionEvent event) throws IOException  
	{
		  String get=tbookk.getText();
		  Request r;
		  ArrayList<Request> rem=new ArrayList<Request>();
		  for(Request e:admin.reqs) {
			  if(e.getuser().getUserID().equals(get)) {
				  one=e.getEndtime().toString();
				two=e.getStarttime().toString();
				  three=e.getpurpose();
					four=e.getDate();
					five=e.getRoom();
					ty="s";
				  bookmyroom(event);
				  if(err.equals("")) {
					  e.getuser().notif+="\n Your request of booking room"+e.getRoom()+" on "+e.getDate()+" during"+e.getStarttime().toString()+" - "+e.getEndtime().toString()+" is Accepted !";
				  }
				  else {
					  e.getuser().notif+="\n Your request of booking room"+e.getRoom()+" on "+e.getDate()+" during"+e.getStarttime().toString()+" - "+e.getEndtime().toString()+" is rejected !"+" error-"+err;
				  }
				  System.out.println(e.getuser().notif);
				  rem.add(e);
				  one="";
					two="";
					  three="";
						four="";
						five="";
						ty="";
						err="";
				  
			  }
		  }
		  for(Request i:rem) {
			  admin.reqs.remove(i);
		  }
		  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage3.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn4;
	
	public void gotofaculty(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Register_Faculty.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn22;
	
	public void gotoadmin(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow(); 
		Parent root = FXMLLoader.load(getClass().getResource("/application/Register_Admin.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn5;
	
	public void gototype(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/type.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	
	
	@FXML
	private Button btn6;
	
	public void requestbooking(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn7;
	
	public void requestbooking2(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/RequestBooking.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn8;
	public void viewbookings(ActionEvent event) throws IOException  {
		i=0;
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/viewbooking.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn9;
	
	@FXML
	private Button btn11;
	
	public void viewbookings2(ActionEvent event) throws IOException  {
		i=1;
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/viewbooking.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn10;
	
	public void selectCourse(ActionEvent event) throws IOException  {
		i=1;
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/selectCourse.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn12;
	@FXML
	private Button btn18;
	@FXML
	private Label mon1=new Label();
	@FXML
	private Label mon2=new Label();
	@FXML
	private Label mon3=new Label();
	@FXML
	private Label mon4=new Label();
	@FXML
	private Label mon5=new Label();
	@FXML
	private Label mon6=new Label();
	@FXML
	private Label mon7=new Label();
	@FXML
	private Label mon8=new Label();
	@FXML
	private Label mon9=new Label();
	@FXML
	private Label tues1=new Label();
	@FXML
	private Label tues2=new Label();
	@FXML
	private Label tues3=new Label();
	@FXML
	private Label tues4=new Label();
	@FXML
	private Label tues5=new Label();
	@FXML
	private Label tues6=new Label();
	@FXML
	private Label tues7=new Label();
	@FXML
	private Label tues8=new Label();
	@FXML
	private Label tues9=new Label();
	@FXML
	private Label wed1=new Label();
	@FXML
	private Label wed2=new Label();
	@FXML
	private Label wed3=new Label();
	@FXML
	private Label wed4=new Label();
	@FXML
	private Label wed5=new Label();
	@FXML
	private Label wed6=new Label();
	@FXML
	private Label wed7=new Label();
	@FXML
	private Label wed8=new Label();
	@FXML
	private Label wed9=new Label();
	@FXML
	private Label thurs1=new Label();
	@FXML
	private Label thurs2=new Label();
	@FXML
	private Label thurs3=new Label();
	@FXML
	private Label thurs4=new Label();
	@FXML
	private Label thurs5=new Label();
	@FXML
	private Label thurs6=new Label();
	@FXML
	private Label thurs7=new Label();
	@FXML
	private Label thurs8=new Label();
	@FXML
	private Label thurs9=new Label();
	@FXML
	private Label fri1=new Label();
	@FXML
	private Label fri2=new Label();
	@FXML
	private Label fri3=new Label();
	@FXML
	private Label fri4=new Label();
	@FXML
	private Label fri5=new Label();
	@FXML
	private Label fri6=new Label();
	@FXML
	private Label fri7=new Label();
	@FXML
	private Label fri8=new Label();
	@FXML
	private Label fri9=new Label();

	
	public void timetable(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/viewTimeTable.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}

	


	@FXML
	private Button btn19;
	@FXML
	private Button btn25;
	@FXML
	private Button btn15;
	@FXML
	private Button btn20;
	@FXML
	private Button btn26;
	public void cpassword(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/ChangePassword.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn16;
	@FXML
	private Button btn23;
	public void bookroom(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Book a Room.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn21;
	
	public void reqresp(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/ViewResponses_Admin.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn24;
	public void allbookings(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/All Bookings_Admin.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn27;
	public void classroomavail(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/ClassRoomAvailability.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn28;
	public void allcourses(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/AllCourses.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn101;
	public void add_faculty(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/add_faculty.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		  
		
	}
	@FXML
	private Button mine;
	public void gotomybooking(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/My Bookings.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		  
		
	}
	@FXML
	private Button b1;
	public void goback1(ActionEvent event) throws IOException   {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root=null;
		  if(i==0) {
		   root = FXMLLoader.load(getClass().getResource("/application/homepage.fxml"));}
		  else {
		   root = FXMLLoader.load(getClass().getResource("/application/homepage2.fxml"));}
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	
	@FXML
	private Button RegButton;
	
	public void register(ActionEvent event) throws IOException  {
		
		
	}
	//FOR ERROR BOX
	public static void showerrorbox(String s1,String s2)
	{
        Alert a = new Alert(AlertType.INFORMATION);
        a.setTitle("Error");
        a.setHeaderText(s1);
        a.setResizable(true);
        String version = System.getProperty("java.version");
        String content = String.format(s2, version);
        a.setContentText(content);
        a.showAndWait();
	}
	//SHOWING MYCOURSES
	@FXML
	private Button btn13;
	@FXML
	private Label c1=new Label();
	@FXML
	private Label c2=new Label();
	@FXML
	private Label c3=new Label();
	@FXML
	private Label c4=new Label();
	@FXML
	private Label c5=new Label();
	@FXML
	private Label c6=new Label();
	@FXML
	private Label d1=new Label();
	@FXML
	private Label d2=new Label();
	@FXML
	private Label d3=new Label();
	@FXML
	private Label d4=new Label();
	@FXML
	private Label d5=new Label();
	@FXML
	private Label d6=new Label();
	
	public void courses(ActionEvent event) throws IOException  
	{
	  Parent root = FXMLLoader.load(getClass().getResource("/application/mycourses.fxml"));
	  Scene scene = new Scene(root);
	  Main.primaryStage.setScene(scene);
	}
	
	//ADDING A COURSE
	@FXML
	private Button add;
	@FXML
	private Button drop;
	@FXML 
	private ChoiceBox<String> courseadd =new ChoiceBox<String>();
	@FXML 
	private ChoiceBox<String> coursedrop =new ChoiceBox<String>();
	
	
	public void addcourse(ActionEvent event) throws IOException 
	{
		if(current.myCourses.size()<6) 
		{
			int t=0;
			for(int i=0;i<current.myCourses.size();i++)
			{
				if(current.myCourses.get(i).getAcronym().equals(courseadd.getValue()))
				{
					t=1;
					System.out.println(current.myCourses.get(i).getAcronym()+ " "+courseadd.getValue() );
					showerrorbox("Illegal Course Addition","You already have this course.");
					break;
				}
			}
			if(t==0)
			{
				current.myCourses.add(course.coursemap.get(courseadd.getValue()));
				showerrorbox("Course Added","You now have "+ courseadd.getValue() + " as your course");
				course p=course.coursemap.get(courseadd.getValue());
				if(p.getMon()!=null)
				{
					current.mon.add(p.getMon());
				}
				if(p.getTues()!=null)
				{
					current.tues.add(p.getTues());
				}
				if(p.getWed()!=null)
				{
					current.wed.add(p.getWed());
				}
				if(p.getThurs()!=null)
				{
					current.thurs.add(p.getThurs());
				}
				if(p.getFri()!=null)
				{
					current.fri.add(p.getFri());
				}
				
				for(int k=0;k<p.getTut().size();k++)
				{
					if(p.getTut().get(k).getDay().equals("1"))
					{
							current.mon.add(p.getTut().get(k));
					}
					if(p.getTut().get(k).getDay().equals("2"))
					{
						    current.tues.add(p.getTut().get(k));
					}
					if(p.getTut().get(k).getDay().equals("3"))
					{ 
						    current.wed.add(p.getTut().get(k));
					}
					if(p.getTut().get(k).getDay().equals("4"))
					{
						    current.thurs.add(p.getTut().get(k));
					}
					if(p.getTut().get(k).getDay().equals("5"))
					{
						    current.fri.add(p.getTut().get(k));
					}
					
				}
				if(p.getLab()!=null)
				{
					if(p.getLab().getDay().equals("1"))
					{
							current.mon.add(p.getLab());
					}
					if(p.getLab().getDay().equals("2"))
					{
						    current.tues.add(p.getLab());
					}
					if(p.getLab().getDay().equals("3"))
					{ 
						    current.wed.add(p.getLab());
					}
					if(p.getLab().getDay().equals("4"))
					{
						    current.thurs.add(p.getLab());
					}
					if(p.getLab().getDay().equals("5"))
					{
						    current.fri.add(p.getLab());
					}
				}
				user.serialize();
			}
		}
		else 
		{
			showerrorbox("Max limit exceeded","You already have 6 courses.");
		}
		user.serialize();
	}
	
	
	
	
	//DROPPING A COURSE
public void dropcourse(ActionEvent event) throws IOException {
	if(current.myCourses.size()>0) 
	{
		int t=0;
		for(int i=0;i<current.myCourses.size();i++)
		{
			if(current.myCourses.get(i).getAcronym().equals(coursedrop.getValue()))
			{
				t=1;
				current.myCourses.remove(i);
				showerrorbox("Course Dropped","You now have "+ coursedrop.getValue() + " dropped from your courses");
				course p=course.coursemap.get(coursedrop.getValue());

					for(int j=0;j<current.mon.size();j++)
					{
						if(current.mon.get(j).get_course().getAcronym().equals(p.getAcronym()))
						{
							System.out.println("hihihi");
							current.mon.remove(j);
							j--;
						}
					}
				

					//current.tues.remove(p.getTues());					
					for(int j=0;j<current.tues.size();j++)
					{
						if(current.tues.get(j).get_course().getAcronym().equals(p.getAcronym()))
						{
							current.tues.remove(j);
							j--;
						}
					}
				

					for(int j=0;j<current.wed.size();j++)
					{
						if(current.wed.get(j).get_course().getAcronym().equals(p.getAcronym()))
						{
							current.wed.remove(j);
							j--;
						}
					}
				

					for(int j=0;j<current.thurs.size();j++)
					{
						if(current.thurs.get(j).get_course().getAcronym().equals(p.getAcronym()))
						{
							current.thurs.remove(j);
							j--;
						}
					}
				

					for(int j=0;j<current.fri.size();j++)
					{
						if(current.fri.get(j).get_course().getAcronym().equals(p.getAcronym()))
						{
							current.fri.remove(j);
							j--;
						}
					}
				
				user.serialize();
				break;
			}
		}
		if(t==0)
		{
			showerrorbox("Illegal Course Dropping","You don't have this course.");
		}
	}
	else 
	{
		showerrorbox("No Courses","You don't have any courses.");
	}
	user.serialize();
	}

	//making table
@FXML
private Button search;
public static void predictionbox(String s1,String s2)
{
    Alert a = new Alert(AlertType.INFORMATION);
    a.setTitle("Predicted courses");
    a.setHeaderText(s1);
    a.setResizable(true);
    String version = System.getProperty("java.version");
    String content = String.format(s2, version);
    a.setContentText(content);
    a.showAndWait();
}
@FXML
private TextField searchtext;
public void search(ActionEvent event) throws IOException 
{
	String[] not= {"the","between","and","them","have","are","with","vs.","also","and/or","about","can"};
	HashMap<String,Integer> predict=new HashMap<String,Integer>();
	for(String e:course.coursemap.keySet()) {
		String post=course.coursemap.get(e).getPost();
		String[] splitt=post.split("\\s+");
		for (String p:splitt) { 
			if(p.length()<3) {
				continue;
			}
		for(String f:searchtext.getText().split("\\s+")) {
			if(!(Arrays.asList(not).contains(f)) && f.length()>2 && p.toLowerCase().equals(f.toLowerCase())) {
				try {
				predict.put(e,predict.get(e)+1);
				}
				catch(Exception ee) {
					predict.put(course.coursemap.get(e).getTitle(),1);
				}
			}
		}
	}
	}
	HashMap<String,Boolean> rem= new HashMap<String,Boolean>();
	for(String e:predict.keySet()) {
		//System.out.println(e+" "+(rem.containsKey(e))+rem);
		
		if((searchtext.getText().split("\\s+").length/predict.get(e)>6 && !(rem.containsKey(e)))){
			rem.put(e,true);
		}
	}
	for(String e:rem.keySet()) {
		//System.out.println(e);
		predict.remove(e);
	}
	ArrayList<String> maxx=new ArrayList<String>();
	while(predict.size()!=0) {
		
		String maxi="";
		int cc=0;
		try {
		while(predict.size()>0) {
		//System.out.println(predict);
		for(String s:predict.keySet()) {
			if(predict.get(s)>cc) {
				cc=predict.get(s);
				maxi=s;
			}
		}
		maxx.add(maxi);
		predict.remove(maxi);
		cc=0;}
		}
		catch(Exception e) {
			break;
		}
	}
	String disp="";
	int cc=1;
	//System.out.println(maxx);

	for(String s:maxx) {
		disp+=(cc+". "+s+"\n");
		cc+=1;
	}
	predictionbox("Your predicted courses",disp);
}
@FXML
private Button viewreq;
@FXML TableView<ObservableList<String>> reqtable;

public void viewreq(ActionEvent event) throws IOException 
{
	

	String rows="";
    String columnvals = null;

    ArrayList<String> columns = new ArrayList<String>();
    ObservableList<ObservableList<String>> coursesfulldata = FXCollections.observableArrayList();

       
             
                int i = 0;

                while ((i<admin.reqs.size())) {
                	try {
                    if (i < 1) {
                    	ObservableList<String> row = FXCollections.observableArrayList();
                        row.clear();
                        columnvals = admin.reqs.get(i).getuser().getUserID()+" "+admin.reqs.get(i).getRoom()+" "+admin.reqs.get(i).getDate()+" "+admin.reqs.get(i).getStarttime()+" "+admin.reqs.get(i).getEndtime()+" "+admin.reqs.get(i).getpurpose()+"\t\t\t\t\t\t";
                            row.add(columnvals);
                        
                        coursesfulldata.add(row);
                        columns.add("Request Details(U.ID Room Day STime ETime Purpose)");
	                        
                        int ii=0;
                            final int finalIdx = ii;
                            TableColumn<ObservableList<String>, String> column = new TableColumn<>(columns.get(ii));
                            //System.out.println(finalIdx+" "+columns);
                            if(finalIdx<15) {
                            	reqtable.setColumnResizePolicy((param) -> true );
                            column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().get(finalIdx)));
                            }

                            reqtable.getColumns().add(column);
                        

                    } else {
                        ObservableList<String> row = FXCollections.observableArrayList();
                        row.clear();
                        columnvals = admin.reqs.get(i).getuser().getUserID()+" "+admin.reqs.get(i).getRoom()+" "+admin.reqs.get(i).getDate()+" "+admin.reqs.get(i).getStarttime()+" "+admin.reqs.get(i).getEndtime()+" "+admin.reqs.get(i).getpurpose()+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                  ";
                            row.add(columnvals);
                        
                        coursesfulldata.add(row);
                    }
                    i++;

                }
                	
                	catch (Exception e) {
    	                ;
    	            }

                	
                
                reqtable.setItems(coursesfulldata);

            } 
       

    
}







	@FXML
	private Button jbtn1;
	@FXML TableView<ObservableList<String>> tableView;
	
	public void course(ActionEvent event) throws IOException 
	{
		//System.out.println(course.coursemap.keySet());
		//current.showcourses();
		String csvFile = ".\\src\\application\\courses\\courses.csv";
		String line = "";
		String delimeter = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
    	 int cc=0;
         while ((line = br.readLine()) != null && cc<17) 
         {

             String[] c = line.split(delimeter);
             //System.out.println(cc);
             
             {
             //System.out.println(c[0]+" "+c[2]+" "+c[3]+" "+c[4]+" "+c[5]+" "+c[6]+" "+c[7]+" "+c[8]+" "+c[9]+" "+c[10]+" "+c[11]+" "+c[12]+" "+c[13]+" "+c[14]+" \n");
             
             String s=((c[0]+","+c[2]+","+c[3]+","+c[4]+","+c[5]+","+c[6]+","+c[7]+","+c[8]+","+c[9]+","+c[10]+","+c[11]+","+c[12]+","+c[13]+","+c[14]));
             course.ll.add(s.split(","));
             if (cc>=1){
             course add=new course(c[0],c[1],c[2],c[3],c[4],c[5],c[6],c[7],c[8],c[9],c[10],c[11],c[12],c[13],c[14]);
             course.coursemap.put(c[5], add);
             }
             cc+=1;
             }
             
             
         }
         controller.course.serialize();

     } catch (Exception e) {
         e.printStackTrace();
  }
//     System.out.println(course.ll.get(0)[1]);
	
		
	    String rows[] = null;
	    String columnvals[] = null;

	    ArrayList<String> columns = new ArrayList<String>();
	    ObservableList<ObservableList<String>> coursesfulldata = FXCollections.observableArrayList();

	       
	             
	                int i = 0;

	                while ((i<course.ll.size())) {
	                	try {
	                    if (i < 1) {
	                        rows = course.ll.get(i);
	                        for (String w : rows) {
	                            columns.add(w);

	                        }
	                        for (int ii = 0; ii < columns.size(); ii++) {
	                            final int finalIdx = ii;
	                            TableColumn<ObservableList<String>, String> column = new TableColumn<>(columns.get(ii));
	                            //System.out.println(finalIdx+" "+columns);
	                            if(finalIdx<15) {
	                            	tableView.setColumnResizePolicy((param) -> true );
	                            column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().get(finalIdx)));
	                            }

	                            tableView.getColumns().add(column);
	                        }

	                    } else {
	                        ObservableList<String> row = FXCollections.observableArrayList();
	                        row.clear();
	                        columnvals =  course.ll.get(i);
	                        for (String item : columnvals) {
	                            row.add(item);
	                        }
	                        coursesfulldata.add(row);
	                    }
	                    i++;

	                }
	                	
	                	catch (Exception e) {
	    	                ;
	    	            }

	                	
	                
	                tableView.setItems(coursesfulldata);

	            } 
	       

	    
	}
	

}