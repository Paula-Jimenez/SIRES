/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aaron
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private String carnet;
    private static String[] etiquetas = {"Carnet", "Nombre", "Edad"};
    private static String[] etiquetasC = {"Carnet", "Nombre"};

    public Estudiante(String nombre, int edad, String carnet) {

        this.nombre = nombre;
        this.edad = edad;
        this.carnet = carnet;
    }

    public static String[] getEtiquetas() {
        return etiquetas;
    }
//tabla
    public String getAtributo(int numeroAtributo) {
        switch (numeroAtributo) {
            case 0:
                return carnet;
            case 1:
                return nombre;
            case 2:
                return Integer.toString(edad);
            default:
                return null;
        }
    }
    public static int getNumeroAtributos(){
        return etiquetas.length;
    }
//tabla
    public static String[] getEtiquetasC() {
        return etiquetasC;
    }
     public String getAtributoC(int numeroAtributo) {
        switch (numeroAtributo) {
            case 0:
                return carnet;
            case 1:
                return nombre;
            default:
                return null;
        }
    }
    public static int getNumeroAtributosC(){
        return etiquetasC.length;
    }
    //otra Tabla
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getInformacion() {
        return this.getCarnet() + "\t" + this.getNombre() + "\t" + this.getEdad() + "\t";
    }

}
