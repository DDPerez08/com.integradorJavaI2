package vehiculo.ventanas;

/****************
 * @author David
***************** */

public enum Ventanas {

    VentanaPrincipal("/vehiculo/ventanas/VentanaMaestra.fxml", "Administracion de Concesionaria"),
    AutosVentana("/vehiculo/ventanas/AutosVentana.fxml", "Administracion de Autos"),
    VendedoresVentana("/vehiculo/ventanas/VendedoresVentana.fxml", "Administracion de Vendedores"),
    CompradoresVentana("/vehiculo/ventanas/CompradoresVentana.fxml", "Administracion de Compradores"),
    AutosEdicion("/vehiculo/ventanas//AutosEdicion.fxml", "Edicion de Autos"),
    CompradoresEdicion("/vehiculo/ventanas//CompradoresEdicion.fxml", "Edicion de Compradores"),
    VendedoresEdicion("/vehiculo/ventanas//VendedoresEdicion.fxml", "Edicion de Vendedores"),
    ConfiguracionVentana("/vehiculo/ventanas//ConfiguracionVentana.fxml", "Ventana de configuracion");

    private String path;
    private String title;
    private Boolean isopen;

    public String getPath() {
        return path;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getIsopen() {
        return isopen;
    }

    public void setIsopen(Boolean isopen) {
        this.isopen = isopen;
    }


    private Ventanas(String path, String title) {
        this.path = path;
        this.title = title;
        isopen = false;
    }



}