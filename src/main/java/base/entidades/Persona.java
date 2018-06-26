package base.entidades;

import java.util.Date;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private  String numeroDocumento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    private Date fechaDeNacimiento;

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }


    public Persona(String apellido, String nombre, String numeroDocumento)
    {
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setNumeroDocumento(numeroDocumento);

    }

    public Persona(){}

    public String toString(){
        return "Nombre: "+ getNombre()+" Apellido: "+getApellido()+" D.N.I.: "+getNumeroDocumento();
    }
}
