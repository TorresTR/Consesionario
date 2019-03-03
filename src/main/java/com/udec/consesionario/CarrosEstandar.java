package com.udec.consesionario;

/**
 *Esta clase contiene los carros estandar sin ningun tipo de modificacion los comunes
 * @author David
 */
public class CarrosEstandar extends CarrosPrincipal {
    
    /**
     * consumoConbustible guerda el valor del consumo de conbustible del vehiculo
     */
    private int consumoConbustible;
    
    /**
     * ergonomia guarda si un auto es ergonomico eficiente cuando consume por kilometro
     */
    private String ergonomia;
    
    /**
     * numeroPasajaeros guarda el numero el numero de pasajeros que puedde llevar el vehiculo
     */
    private int numeroPasajaeros;

    /**
     * Este es el constructor, que solicita los datos basicos para poder inicializar los valores
     * @param marca
     * @param precio
     * @param color
     * @param numeroRuedas
     * @param cilindraje 
     */
    public CarrosEstandar(String marca, float precio, String color, int numeroRuedas, int cilindraje,String placa) {
        super(marca, precio, color, numeroRuedas, cilindraje, placa);
        consumoConbustible = 0;
        ergonomia="";
        numeroPasajaeros=0;
    }

    /**
     * CarrosEstandar contructor vacio para poder inicializar variables que van a ser quemadas
     */
    public CarrosEstandar() {
    }

    /**
     * Retorna el valor del consumo de conbustible
     * @return consumoConbustible
     */
    public int getConsumoConbustible() {
        return consumoConbustible;
    }

    /**
     * setConsumoConbustible permite asignar un valor para el consumo de conbustible
     * @param consumoConbustible 
     */
    public void setConsumoConbustible(int consumoConbustible) {
        this.consumoConbustible = consumoConbustible;
    }

    /**
     * getErgonomia retorna el valor para la ergonomia
     * @return ergonomia
     */
    public String getErgonomia() {
        return ergonomia;
    }

    /**
     * setErgonomia permite asignar el valor para ergonomia 
     * @param ergonomia 
     */
    public void setErgonomia(String ergonomia) {
        this.ergonomia = ergonomia;
    }

    /**
     * getNumeroPasajaeros retorna el valor del numero de pasajeros del vehiculo
     * @return numeroPasajaeros
     */
    public int getNumeroPasajaeros() {
        return numeroPasajaeros;
    }

    /**
     * setNumeroPasajaeros permite asignar un valor para el numero de pasajeros
     * @param numeroPasajaeros 
     */
    public void setNumeroPasajaeros(int numeroPasajaeros) {
        this.numeroPasajaeros = numeroPasajaeros;
    }
    
    
}
