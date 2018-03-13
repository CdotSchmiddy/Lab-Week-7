package f18.mar07;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Calum
 */
public class LaunchInspirationView extends Application
{

    public static void main(String[] args)
    {
        launch(args);   
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //load the FXML file
        //If you get the error "location not set", that means that
        //the fxml file name is either spelled incorrectly or it is not
        //in the specified folder
        primaryStage.setTitle("Inspire Me");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("InspireView.fxml"));
        
        //create a Parent object from the fxml file
        Parent parent = loader.load();
        
        //use the Parent to create a Scene (note: the Scene is what shows
        //on the Stage
        Scene scene = new Scene(parent);
        
        //Configure the stage with the scene - you can configure the title
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}