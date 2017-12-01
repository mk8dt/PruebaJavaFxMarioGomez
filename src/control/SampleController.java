package control;
import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

// TODO: Auto-generated Javadoc
/**
 * The Class SampleController.
 * esta es la clase que controla los dos stages.
 */
public class SampleController {
	
	/** The anchor Pane.*/
    @FXML
    private AnchorPane pane;
    
	/** The anchor Pane2.*/
	@FXML
	private AnchorPane pane2;
	
	/** The btn get started. Este es el boton que nos lleva al otro stage */
	@FXML
    private JFXButton btnGetStarted;
	
	/** The btn get started. Este es el boton que nos cierra la app.*/
    @FXML
    private JFXButton btnClose;
    /**
     * Close App.
     *
     * @param event the event
     * @see cerramos la app.
     */
    @FXML
    void closeApp(MouseEvent event) {
    	System.exit(0);
    }
    /**
     * Open stage.
     *
     * @param event the event
     * @see con este metodo abrimos el segundo stage.
     */
    @FXML
    void openStage(MouseEvent event) {

    	FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("../vista/FreeSolo.fxml"));
		
		Parent root1;
		try {
			
			root1 = (Parent)fxmlLoader.load();
			Stage stage= new Stage();
			
			stage.setScene(new Scene(root1));
		    stage.initStyle(StageStyle.UNDECORATED);
		  
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
