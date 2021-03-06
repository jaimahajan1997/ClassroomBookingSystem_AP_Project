package application;

	
import controller.Request;
import controller.admin;
import controller.user;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/**
 * Main method to launch project
 * @author Raghav and Jai
 *
 */
public class Main extends Application {
	public static  Stage primaryStage;
	@Override
	
	public void start(Stage pStage) {
		try {
			primaryStage=pStage;
			//primaryStage.setFullScreen(true);
			
	        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/application/page_1.fxml")), 1000, 751);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		
		try
		{	//Request.serialize();
			controller.user.init();
			controller.Request.init();
		
		}
		catch(Exception e)	{}
		try
		{controller.course.init();
		
		}
		catch(Exception e)	{}
		try {
			controller.admin.init();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		launch(args);
	}
}
