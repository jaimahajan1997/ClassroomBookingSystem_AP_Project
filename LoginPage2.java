
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
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
public class A extends Application
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
	    	
			Image image = new Image("File:C:\\Users\\jaima\\Desktop\\logo.png");
			ImageView imageView=new ImageView(image);
			imageView.setFitHeight(200);
			imageView.setFitWidth(600);
			grid.add(imageView,1,0);

	    	
	    	grid.setStyle("-fx-background-color: #11c6bd;");
	    	Label userName = new Label("UserID");
	    	userName.setFont(Font.font("Tohema", FontWeight.BOLD, 20));
	    	grid.add(userName, 0, 4);

	    	TextField userTextField = new TextField();
	    	grid.add(userTextField, 1, 4);
	    	//String name=userTextField.getText();
	    	

	    	Label pw = new Label("Password");
	    	pw.setFont(Font.font("Tohema", FontWeight.BOLD, 20));
	    	grid.add(pw, 0, 6);

	    	PasswordField pwBox = new PasswordField();
	    	grid.add(pwBox, 1, 6);
	    	
	    	Button btn = new Button("Sign in");
	    	HBox hbBtn = new HBox(10);
	    	hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	    	hbBtn.getChildren().add(btn);
	    	grid.add(hbBtn, 1, 10);
	    	
	    	
	    	btn.setOnAction(new EventHandler<ActionEvent>() 
	    	{
	    		 
	    	    @Override
	    	    public void handle(ActionEvent e)
	    	    {
	    	    	BorderPane border = new BorderPane();
	    	    	VBox m=new VBox();
	    	    	
//	    	    	border.setStyle("-fx-background-color: #11c6bd;");
	    			Image image = new Image("File:C:\\Users\\jaima\\Desktop\\logo.png");
	    			ImageView imageView=new ImageView(image);
	    			imageView.setFitHeight(275);
	    			imageView.setFitWidth(350);
	    			border.setTop(imageView);
	    			//border.setPadding(new Insets(25, 25, 25, 25));
	    	    	Scene scenic=new Scene(border,100,100);
	    	    	
//	    	    	GridPane grid2 = new GridPane();
//	    	    	grid2.setAlignment(Pos.TOP_CENTER);
	    	    	m.setStyle("-fx-background-color: #11c6bd;");
//	    	    	grid2.setPadding(new Insets(25, 25, 25, 25));  	    	
	    	    	
	    	    	Label User1 = new Label("USER INFORMATION");
	    	    	User1.setFont(Font.font("Tohema", FontWeight.BOLD, 30));
	    	    	
	    	    	m.setPadding(new Insets(25, 25, 25, 25));
	    	    	Label user2 = new Label("Raghav Bhatia");
	    	    	user2.setFont(Font.font("Tohema", FontWeight.NORMAL, 30));
	    	    	
    	    	
	    	    	Label mytype = new Label("Student");
	    	    	mytype.setFont(Font.font("Tohema", FontWeight.NORMAL, 30));
	    	    	
//
	    	    	Label myID = new Label(userTextField.getText());
	    	    	myID.setFont(Font.font("Tohema", FontWeight.NORMAL, 25));

	    	    	m.getChildren().addAll(User1,user2,mytype,myID);
	    	
	    	    	border.setLeft(m);
	    	
	    			primaryStage.setScene(scenic);
	  
	    	    }
	    	});
		
	    	Button reg = new Button("Register");
	    	HBox hbBtn2 = new HBox(10);
	    	hbBtn2.setAlignment(Pos.BOTTOM_LEFT);
	    	hbBtn2.getChildren().add(reg);
	    	grid.add(hbBtn2, 0, 10);
	    	
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
	    	    	
	    	    	Image image = new Image("File:C:\\Users\\jaima\\Desktop\\logo.png");
	    			ImageView imageView=new ImageView(image);
	    			imageView.setFitHeight(200);
	    			imageView.setFitWidth(400);
	    			grid.add(imageView,1,0);
	    	    	
	    	    	Text scenetitle = new Text(" CREATE ACCOUNT");
	    	    	scenetitle.setFont(Font.font("ALGERIAN", FontWeight.NORMAL, 40));
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
	    	    	
	    	    	
	    	    	Button btn11 = new Button("Register");
	    	    	HBox hbBtn11 = new HBox(10);
	    	    	hbBtn11.setAlignment(Pos.BOTTOM_RIGHT);
	    	    	hbBtn11.getChildren().add(btn11);
	    	    	grid.add(hbBtn11, 1, 11);
	    	    	

	    	    	Scene scene = new Scene(grid, 100, 100,Color.RED);
	    	    	register.setScene(scene);
	    			register.setHeight(1000);
	    			register.setWidth(1000);
	    			register.show();
	    	    	register.setTitle("Room Booking System | Create Account");
	    	    	register.show();
	    	    	
	    	    	btn11.setOnAction(new EventHandler<ActionEvent>() 
	    	    	
	    	 	{
	    	    		@Override
	    	    		public void handle(ActionEvent e)
	    	    		{
	    	    			GridPane grid1 = new GridPane();
	    	    	    	grid1.setHgap(10);
	    	    	    	grid1.setVgap(10);
	    	    	    	Image image = new Image("File:C:\\Users\\jaima\\Desktop\\logo.png");
	    	    			ImageView imageView=new ImageView(image);
	    	    			imageView.setFitHeight(200);
	    	    			imageView.setFitWidth(400);
	    	    			grid1.add(imageView,0,0);
	    	    	    	grid1.setPadding(new Insets(25, 25, 25, 25));
	    	    	    	Label thanks = new Label("Registration Complete!");
	    	    	    	grid1.setAlignment(Pos.CENTER);
	    	    	    	grid1.setStyle("-fx-background-color: #d16314;");
	    	    	    	thanks.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
	    	    	    	Scene next=new Scene(grid1,100,100,Color.RED);
	    	    	    	grid1.add(thanks, 0, 1);
	    	    	    	Button btn12 = new Button("CLOSE");
	    	    	    	HBox hbBtn12 = new HBox(10);
	    	    	    	hbBtn12.setAlignment(Pos.BOTTOM_RIGHT);
	    	    	    	hbBtn12.getChildren().add(btn12);
	    	    	    	grid1.add(btn12, 1, 5);
	    	    	    
	    	    			register.setScene(next);
	    	    			
	    	    		}
	    	 	});
	    	    	
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
