package vehiculo.entidades;

import base.entidades.Persona;

public class Comprador extends Persona {

 private double presupuesto;

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Comprador (String nombre, String apellido, String numeroDocumento, double presupuesto){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setNumeroDocumento(numeroDocumento);
        this.setPresupuesto(presupuesto);

    }

    public String toString(){
        return super.toString()+" Presupuesto: "+ getPresupuesto();
    }
}
