/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18.mar07;

import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Calum
 */
public class InspireViewController implements Initializable {

    
    @FXML private TextArea textArea;
    
    /**
     * This is the first method called when the view is loaded.
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textArea.setText("Code what you like, and like what you Code.");
    }    
    
    /**
     * This method will update the text area with a super inspirational message.
     */
    
    public void inspireButtonPushed(){
        
        SecureRandom rng = new SecureRandom();
        int selectNum = rng.nextInt(3);
        textArea.setText("It is during our darkest moments that we must focus to see the light.");
        textArea.setText("The only way to discover the limits of the possible is to go beyond them into the impossible.");
        };
        
    }
}
