package com.udec.consesionario;

/**
 * Esta clase tiene los atributos de los autos personalizados
 * @author David
 */
public class CarrosPersonalizado extends CarrosPrincipal{
    
    /*
    alerones guarda la cantidad de alerones que tiene un carro
    */
    private int alerones;
    
    /*
    tamañoRuedas guarda el valor, del tamaño de las ruedas
    */
    private int tamañoRuedas;
    
    /**
     * no2 guarda la descripcion del oxido nitroso y si lleva cual
     */
    private String no2;

    /**
     * Este es el constructor basico que se necesita para poder realizar la insercion de los datos
     * @param marca
     * @param precio
     * @param color
     * @param numeroRuedas
     * @param cilindraje 
     */
    public CarrosPersonalizado(String marca, float precio, String color, int numeroRuedas, int cilindraje, String placa) {
        super(marca, precio, color, numeroRuedas, cilindraje, placa);
        alerones=0;
        tamañoRuedas=0;
        no2="";
    }

    /**
     * CarrosPersonalizados contructor vacio que se usara para dejar los datos quedamos
     */
    public CarrosPersonalizado() {
    }

    /**
     * getAlerones retorna el valor de los alerones y cuantos tiene
     * @return alerones
     */
    public int getAlerones() {
        return alerones;
    }

    /**
     * setAlerones permite asignar el valor de los alerones
     * @param alerones 
     */
    public void setAlerones(int alerones) {
        this.alerones = alerones;
    }

    /**
     * Retorna el valor del tamaño de las ruedas
     * @return tamañoRuedas
     */
    public int getTamañoRuedas() {
        return tamañoRuedas;
    }

    /**
     * setTamañoRuedas permoite guardar el valor del tamaño de las ruedas
     * @param tamañoRuedas 
     */
    public void setTamañoRuedas(int tamañoRuedas) {
        this.tamañoRuedas = tamañoRuedas;
    }

    /**
     * getNo2 retorna la descripcion si se usa el oxido nitroso
     * @return no2
     */
    public String getNo2() {
        return no2;
    }

    /**
     * setNo2 permite asignar la descripcion de oxido nitriso
     * @param no2 
     */
    public void setNo2(String no2) {
        this.no2 = no2;
    }
    
    
    
}
