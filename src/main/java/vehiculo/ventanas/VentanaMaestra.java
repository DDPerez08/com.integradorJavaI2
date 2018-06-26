package vehiculo.ventanas;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class VentanaMaestra extends Application {


//    private ObservableList<Person> personData = FXCollections.observableArrayList();
    
    public VentanaMaestra(){

    }

    @FXML
    private void handleAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Educacion IT :: Integrator");
        alert.setHeaderText("About");
        alert.setContentText("Author: XXX");

        alert.showAndWait();
    }

    //@Override
  /*  public void start(Stage primaryStage)
    {

        // StackPane panelPrincipal = new StackPane();
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("VentanaMaestra.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }*/

    private Stage primaryStage;
    private BorderPane rootLayout;
    public void start(Stage primaryStage)
    {

        // StackPane panelPrincipal = new StackPane();
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("VentanaMaestra.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

  //    @FXML
  //  private void handleAbout() {
  //     System.exit(0);
  //  }
}
