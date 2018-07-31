package vehiculo.pruebas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.stage.WindowEvent;

import  vehiculo.ventanas.Ventanas;

import vehiculo.ventanas.VentanaMaestraControlador;
import vehiculo.ventanas.ConcesionariaControlador;


//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;


public class Programa extends Application {
    //public Programa(){}

    private Stage primaryStage;
    private BorderPane rootLayout;
    private boolean internalWindowIsOpen = false;

  //  private ObservableList<Persona> personData = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle(Ventanas.VentanaPrincipal.getTitle());
        this.primaryStage.setMaximized(true);
        // this.primaryStage.setFullScreen(true);
        initVentanaMaestra();

       // StackPane panelPrincipal = new StackPane();

    /*        Parent root = FXMLLoader.load(getClass().getResource("../ventanas/VentanaMaestra.fxml"));
        primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 700, 275));
            primaryStage.show();*/

    }

    public void initVentanaMaestra() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(Ventanas.VentanaPrincipal.getPath()));
            rootLayout = (BorderPane) loader.load();

            VentanaMaestraControlador controller = loader.getController();
            controller.setMainApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args)
    { launch(args);

    }
//adaptar metodo
    public void mostrarVentanaModal(Ventanas ventana, Stage stage, Object entidad) {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Programa.class.getResource(ventana.getPath()));
            AnchorPane page = (AnchorPane) loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle(ventana.getTitle());
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(stage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            dialogStage.setResizable(false);

            // Setea la entidad en el controller.
           // EdicionControlador controller = loader.getController();
          //  controller.setearEntidad(entidad);

            dialogStage.showAndWait();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mostrarVentanaInterna(Ventanas ventana) {
        if (!ventana.getIsopen()) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(ventana.getPath()));
                AnchorPane contactABM = (AnchorPane) loader.load();

                ConcesionariaControlador controller = loader.getController();
                controller.setMainApp(this);

                Stage internalStage = new Stage();
                internalStage.setTitle(ventana.getTitle());
                internalStage.initModality(Modality.NONE);
                internalStage.initOwner(primaryStage);
                Scene scene = new Scene(contactABM);
                internalStage.setScene(scene);
                internalStage.show();

                internalStage.setMinWidth(300);
                internalStage.setMinHeight(400);

                ventana.setIsopen(true);
                internalStage.setOnHidden((WindowEvent we) -> {
                    ventana.setIsopen(false);
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  //  @FXML
 // private void handleAutos() {
    //     System.exit(0);
  //   }

}
