package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Calcul extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		   
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Parent root=FXMLLoader.load(getClass().getResource("GUI.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("CALCULATRICE");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
