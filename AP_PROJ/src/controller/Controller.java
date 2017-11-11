package controller;

import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Controller implements Initializable {
	public static int i=0;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
		
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
	private Button btn2;
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

	

	public void gotopage_1(ActionEvent event) throws IOException  
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
		  user newbie=new student(txt1.getText(),txt2.getText(),txt3.getText(),'s',txt4.getText());
		  
		  //user.serialize(newbie);
		  System.out.println(newbie.getFname()+newbie.getLname());
		  Parent root = FXMLLoader.load(getClass().getResource("/application/page_1.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
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

	

	public void gotopage_j1(ActionEvent event) throws IOException  
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
		  user newbie=new faculty(txtj1.getText(),txtj2.getText(),txtj3.getText(),'f',txtj4.getText());
		  
		  //user.serialize(newbie);
		  System.out.println(newbie.getFname()+newbie.getLname());
		  Parent root = FXMLLoader.load(getClass().getResource("/application/page_1.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
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
	public void gotopage_i1(ActionEvent event) throws IOException  
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
		  if(txti4.getText().equals("iamadmin"))
		  {
			  user newbie=new admin(txti1.getText(),txti2.getText(),txti3.getText(),'a',txti4.getText());
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
		        a.setHeaderText("Wrong Admin Credentials");
		        a.setResizable(true);
		        String version = System.getProperty("java.version");
		        String content = String.format("Reenter Admin Credentials to create account", version);
		        a.setContentText(content);
		        a.showAndWait();
		  }
		}
		  
		
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
	private Button btn13;
	
	@FXML
	private Button btn17;
	
	public void courses(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/mycourses.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
	@FXML
	private Button btn14;
	@FXML
	private Button btn19;
	@FXML
	private Button btn25;
	public void profile(ActionEvent event) throws IOException  {
		// Node node=(Node) event.getSource();
		   //Main.primaryStage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/MyProfile.fxml"));
		  Scene scene = new Scene(root);
		  Main.primaryStage.setScene(scene);
		  //Main.primaryStage.setFullScreen(true);
		  //Main.primaryStage.show();
		
	}
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
	
	

}
