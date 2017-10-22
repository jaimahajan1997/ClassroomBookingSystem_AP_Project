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
		  Parent root = FXMLLoader.load(getClass().getResource("/application/viewroombookings.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn9;
	
	public void viewbookings2(ActionEvent event) throws IOException  {
		i=1;
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/viewroombookings.fxml"));
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
