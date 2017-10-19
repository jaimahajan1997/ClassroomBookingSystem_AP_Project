package ProjectCode;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.Group;
import javafx.scene.control.PasswordField;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.*;
import javafx.scene.control.ChoiceBox;
import javafx.collections.FXCollections;
public class LoginPage extends Application
{
		public static void main(String[] args)
		{
			Application.launch(args);
		}
	    @Override
	    public void start(Stage primaryStage) 
	    {
	    	//Pos pos=null;
	    	GridPane grid = new GridPane();
	    	grid.setAlignment(Pos.CENTER);
	    	grid.setHgap(10);
	    	grid.setVgap(10);
	    	grid.setPadding(new Insets(25, 25, 25, 25));
	    	
			Image image = new Image("File:C:\\Users\\Raghav\\Desktop\\my.png");
			ImageView imageView=new ImageView(image);
			imageView.setFitHeight(200);
			imageView.setFitWidth(600);
			grid.add(imageView,1,0);

	    	
	    	Text scenetitle = new Text("        Room Booking System");
	    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
	    	grid.add(scenetitle, 1, 2);
	    	grid.setStyle("-fx-background-color: #d65959;");
	    	Label userName = new Label("UserID:");
	    	grid.add(userName, 0, 4);

	    	TextField userTextField = new TextField();
	    	grid.add(userTextField, 1, 4);
	    	

	    	Label pw = new Label("Password:");
	    	grid.add(pw, 0, 6);

	    	PasswordField pwBox = new PasswordField();
	    	grid.add(pwBox, 1, 6);
	    	
	    	Button btn = new Button("Sign in");
	    	HBox hbBtn = new HBox(10);
	    	hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	    	hbBtn.getChildren().add(btn);
	    	grid.add(hbBtn, 1, 7);
	    	
	    	
	    	btn.setOnAction(new EventHandler<ActionEvent>() 
	    	{
	    		 
	    	    @Override
	    	    public void handle(ActionEvent e)
	    	    {
	    	    	TextField err = new TextField();
	    	        err.setText("UserID or Password did not match");
	    	        err.setStyle("-fx-background-color: #a7f213;");
	    	        grid.add(err, 1, 8);
	    	        
	    	        
	    	    }
	    	});
		
	    	Button reg = new Button("Register");
	    	HBox hbBtn2 = new HBox(10);
	    	hbBtn2.setAlignment(Pos.BOTTOM_LEFT);
	    	hbBtn2.getChildren().add(reg);
	    	grid.add(hbBtn2, 0, 7);
	    	
	    	reg.setOnAction(new EventHandler<ActionEvent>() 
	    	{
	    		 
	    	    @Override
	    	    public void handle(ActionEvent e)
	    	    {
	    	    	Stage register=new Stage();
	    	    	GridPane grid = new GridPane();
	    	    	grid.setAlignment(Pos.CENTER);
	    	    	grid.setHgap(10);
	    	    	grid.setVgap(10);
	    	    	grid.setPadding(new Insets(25, 25, 25, 25));
	    	    	
	    	    	Text scenetitle = new Text(" CREATE ACCOUNT");
	    	    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
	    	    	grid.add(scenetitle, 1, 2);
	    	    	grid.setStyle("-fx-background-color: #d16314;");
	    	    	
	    	    	Label userName = new Label("Enter IIIT Email:");
	    	    	grid.add(userName, 0, 4);

	    	    	TextField userTextField = new TextField();
	    	    	grid.add(userTextField, 1, 4);
	    	    	
	    	    	Label Name = new Label("Enter Full Name:");
	    	    	grid.add(Name, 0, 6);

	    	    	TextField userInp = new TextField();
	    	    	grid.add(userInp, 1, 6);
	    	    	
	    	    	Label pw = new Label("Enter User Type:");
	    	    	grid.add(pw, 0, 8);
	    	    	
	    	    	ChoiceBox cb = new ChoiceBox<String>();
	    	    	cb.setItems(FXCollections.observableArrayList("Student", "Faculty","Admin"));
	    	    	grid.add(cb,1,8);
	    	    	

	    	    	Label poow = new Label("Enter Password:");
	    	    	grid.add(poow, 0, 10);
	    	    	

	    	    	
	    	    	PasswordField pwBox = new PasswordField();
	    	    	grid.add(pwBox, 1, 10);
	    	    	
	    	    	
	    	    	Button btn = new Button("Register");
	    	    	HBox hbBtn = new HBox(10);
	    	    	hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	    	    	hbBtn.getChildren().add(btn);
	    	    	grid.add(hbBtn, 1, 11);
	    	    	
	    	    	Scene scene = new Scene(grid, 100, 100,Color.RED);
	    	    	register.setScene(scene);
	    			register.setHeight(1000);
	    			register.setWidth(1000);
	    			register.show();
	    	    	register.setTitle("Room Booking System | Create Account");
	    	    	register.show();
	    	    	
	    	    }
	    	});
		
	    	
	    	
	    	

	    	Scene scene = new Scene(grid, 100, 100,Color.RED);
	    	primaryStage.setScene(scene);
			primaryStage.setHeight(1000);
			primaryStage.setWidth(1500);
			primaryStage.setTitle("Room Booking System | Login");
			primaryStage.show();
	    }

}
