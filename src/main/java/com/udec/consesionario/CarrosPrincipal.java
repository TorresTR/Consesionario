package com.udec.consesionario;



/**
 * Esta es la clase padre que contiene todo lo que van a heredar las clases hijas
 * @author David
 */
public abstract class CarrosPrincipal {
    
   
    /*
    la variable marca guardara la marca del vehiculo
    */
    private String marca;
    
    /*
    la variable precio almacena el precio de los vehiculos
    */
    private int precio;
    
    /*
    La variabel color guarda el color de los vehiculos
    */
    private String color;
    
    /*
    La variabel numeroRuedas guarda la cantidad de ruedas que puede tener un vehiculo
    */
    private int numeroRuedas;
    
    /*
    La variabel cilindraje guarda el cilindraje de los vehiculos
    */
    private int cilindraje;

    /**
     * Este constructor permite inicializar con los datos Basicos para almacenar un vehiculo
     * @param marca
     * @param precio
     * @param color
     * @param numeroRuedas
     * @param cilindraje 
     */
    public CarrosPrincipal(String marca, int precio, String color, int numeroRuedas, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.numeroRuedas = numeroRuedas;
        this.cilindraje = cilindraje;
    }

    /**
     * CarrosPrincipal es un contructor vacio que permite el manejo de los set de que estan en las diferentes
     * clases
     */
    public CarrosPrincipal() {
    }

    /**
     * retorna la marca del vehiculo
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * setMarca permite asignar la marca del vehiculo
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * getPrecio retorna el precio del vehiculo
     * @return precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * setPrecio permite asignar el  precio del vehiculo
     * @param precio 
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * getColor retorna el color del vehiculo
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * setColor permite asignar el  color del vehiculo
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * getNumeroRuedas retorna el numero de ruedas  del vehiculo
     * @return numeroRuedas
     */
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    /**
     * setNumeroRuedas permite asignar el  numero de ruedas del vehiculo
     * @param numeroRuedas 
     */
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    /**
     * getCilindraje retorna el cilindraje del vehiculo
     * @return cilindraje
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * setCilindraje permite asignar el  cilindraje del vehiculo
     * @param cilindraje 
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
    
}
