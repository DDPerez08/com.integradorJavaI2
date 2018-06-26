package vehiculo.entidades;

import base.entidades.Persona;

public class Vendedor extends Persona {

    private int cantAutosVendidos;

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

    public Vendedor(String nombre, String apellido, String numeroDocumento, int cantAutosVendidos )
    {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setNumeroDocumento(numeroDocumento);
        this.setCantAutosVendidos(cantAutosVendidos);
    }

    public String ToSting()
    {
        return super.toString()+" Cantidad de Autos Vendidos: "+getCantAutosVendidos();
    }
}
