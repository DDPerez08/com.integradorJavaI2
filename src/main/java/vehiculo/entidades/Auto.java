package vehiculo.entidades;

import base.entidades.Vehiculo;

public class Auto extends Vehiculo {

    private  String marca;
    private String modelo;
    private String color;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Auto (String marca, String modelo, String color, int largo, int ancho, int altura){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setColor(color);
        this.setLargo(largo);
        this.setAncho(ancho);
        this.setAlto(altura);


    }

    public String toString() {
        return "marca: " + getMarca() + "modelo: " + getModelo() + "color: "+ getColor() + " [" + super.toString() + "]";
    }

}
