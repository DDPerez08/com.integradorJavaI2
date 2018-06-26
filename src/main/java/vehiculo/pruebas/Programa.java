package vehiculo.pruebas;

import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Parent;


public class Programa extends Application {
    //public Programa(){}

   //  private Stage primaryStage;

    //private BorderPane rootLayout;

  //  private ObservableList<Persona> personData = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage)throws Exception
    {

       // StackPane panelPrincipal = new StackPane();

            Parent root = FXMLLoader.load(getClass().getResource("../ventanas/VentanaMaestra.fxml"));
        primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 700, 275));
            primaryStage.show();

    }

    public static void main (String[] args)
    { launch(args);

    }



}
