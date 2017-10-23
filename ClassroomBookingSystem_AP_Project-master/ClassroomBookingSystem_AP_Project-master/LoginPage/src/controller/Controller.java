package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Controller implements Initializable {
	public static int i=0;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	private Button btn1;
	
	public void gotoRegister(ActionEvent event) throws IOException  {
		  Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Register.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn2;
	@FXML
	private Button btnlogout;
	
	public void gotopage_1(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/page_1.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn3;
	
	public void gotohomepage(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn4;
	
	public void gotofaculty(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage2.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn22;
	
	public void gotoadmin(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage3.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn5;
	
	public void gototype(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/type.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn6;
	
	public void requestbooking(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/homepage.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn7;
	
	public void requestbooking2(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/RequestBooking.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn8;
	public void viewbookings(ActionEvent event) throws IOException  {
		i=0;
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/viewbooking.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn9;
	
	@FXML
	private Button btn11;
	
	public void viewbookings2(ActionEvent event) throws IOException  {
		i=1;
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/viewbooking.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn10;
	
	public void selectCourse(ActionEvent event) throws IOException  {
		i=1;
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/selectCourse.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn12;
	@FXML
	private Button btn18;
	
	public void timetable(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/viewTimeTable.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn13;
	
	@FXML
	private Button btn17;
	
	public void courses(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/mycourses.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn14;
	@FXML
	private Button btn19;
	@FXML
	private Button btn25;
	public void profile(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/MyProfile.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn15;
	@FXML
	private Button btn20;
	@FXML
	private Button btn26;
	public void cpassword(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/ChangePassword.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn16;
	@FXML
	private Button btn23;
	public void bookroom(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Book a Room.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn21;
	
	public void reqresp(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/ViewResponses_Admin.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn24;
	public void allbookings(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/All Bookings_Admin.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn27;
	public void classroomavail(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/ClassRoomAvailability.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn28;
	public void allcourses(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/AllCourses.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button b1;
	public void goback1(ActionEvent event) throws IOException   {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root=null;
		  if(i==0) {
		   root = FXMLLoader.load(getClass().getResource("/application/homepage.fxml"));}
		  else {
		   root = FXMLLoader.load(getClass().getResource("/application/homepage2.fxml"));}
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	
	

}
