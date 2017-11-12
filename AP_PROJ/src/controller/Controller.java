package controller;

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
import java.util.ArrayList;
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
			
		}
		
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

//		  myid.setText(current.getUserID());

		  //myname.setText("raghav");
		  Parent root = FXMLLoader.load(getClass().getResource("/application/MyProfile.fxml"));
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
	
//	@FXML
//	private Button btn14;
//
//	public void profile(ActionEvent event) throws IOException  {
//		// Node node=(Node) event.getSource();
//		   //Main.primaryStage=(Stage) node.getScene().getWindow();
//		  Parent root = FXMLLoader.load(getClass().getResource("/application/MyProfile.fxml"));
//		  Scene scene = new Scene(root);
//		  Main.primaryStage.setScene(scene);
//		  //Main.primaryStage.setFullScreen(true);
//		  //Main.primaryStage.show();
//		
//	}
	
	

	
	
	
	
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
	
	//Newww displaying courses
	
	@FXML
	private Button jbtn1;
	@FXML TableView<ObservableList<String>> tableView;
	public void course(ActionEvent event) throws IOException {
		
	String csvFile = "C:\\Users\\jaima\\Desktop\\AP_PROJ\\src\\application\\courses\\courses.csv";
     String line = "";
     String delimeter = ",";
     ArrayList<String[]> ll=new ArrayList<String[]>();
     try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

         while ((line = br.readLine()) != null) {

             String[] c = line.split(delimeter);
             try {
             //System.out.println(c[0]+" "+c[2]+" "+c[3]+" "+c[4]+" "+c[5]+" "+c[6]+" "+c[7]+" "+c[8]+" "+c[9]+" "+c[10]+" "+c[11]+" "+c[12]+" "+c[13]+" "+c[14]+" \n");
             course add=new course(c[0],c[1],c[2],c[3],c[4],c[5],c[6],c[7],c[8],c[9],c[10],c[11],c[12],c[13],c[14]);
             add.coursemap.put(c[2],add );
             String s=((c[0]+","+c[2]+","+c[3]+","+c[4]+","+c[5]+","+c[6]+","+c[7]+","+c[8]+","+c[9]+","+c[10]+","+c[11]+","+c[12]+","+c[13]+","+c[14]));
             ll.add(s.split(","));
             }
             catch(Exception e){
            	 break;
             }
         }

     } catch (Exception e) {
         e.printStackTrace();
     }
     //System.out.println(ll.get(0)[1]);
	
		
	    String rows[] = null;
	    String columnvals[] = null;

	    ArrayList<String> columns = new ArrayList<String>();
	    ObservableList<ObservableList<String>> coursesfulldata = FXCollections.observableArrayList();

	       
	             
	                int i = 0;

	                while ((i<ll.size())) {
	                	try {
	                    if (i < 1) {
	                        rows = ll.get(i);
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
	                        columnvals =  ll.get(i);
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