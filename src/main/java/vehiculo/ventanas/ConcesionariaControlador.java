package vehiculo.ventanas;

        import vehiculo.pruebas.Programa;

public abstract class ConcesionariaControlador {

    protected Programa mainApp;

    public void setMainApp(Programa runner) {
        this.mainApp = runner;
    }

    public void mostrarMensajeDeError(String error, Exception ex) {
      /*  Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(error);
        alert.setContentText("ERROR: " + ex.getMessage());
        alert.showAndWait();*/
    }
}
