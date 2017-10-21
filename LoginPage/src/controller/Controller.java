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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	private Button btn1;
	
	public void gotologin(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Sample.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn2;
	
	public void gotoregister(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Register.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn3;
	
	public void gotoadmin(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Admin.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn4;
	
	public void gotofaculty(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Faculty.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button btn5;
	
	public void gotostudent(ActionEvent event) throws IOException  {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/Student.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}

	@FXML
	private Button b1;
	public void goback1(ActionEvent event) throws IOException   {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/navigator.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button b2;
	public void goback2(ActionEvent event) throws IOException   {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/navigator.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button b3;
	public void goback3(ActionEvent event) throws IOException   {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/navigator.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button b4;
	public void goback4(ActionEvent event) throws IOException   {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/navigator.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	@FXML
	private Button b5;
	public void goback5(ActionEvent event) throws IOException   {
		Node node=(Node) event.getSource();
		  Stage stage=(Stage) node.getScene().getWindow();
		  Parent root = FXMLLoader.load(getClass().getResource("/application/navigator.fxml"));
		  Scene scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	

}
