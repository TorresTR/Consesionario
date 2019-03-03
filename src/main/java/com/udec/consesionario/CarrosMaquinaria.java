package com.udec.consesionario;

/**
 * Esta clase conquiete ciertas caracteristicas de los vehiculos que son maquinaria 
 * Volquetas retroescavadoras etc...
 * @author David
 */
public class CarrosMaquinaria extends CarrosPrincipal {
    
    /**
     * pesoTon el pero de la maquina en toneladas
     */
    private int pesoTon;
    
    /**
     * horugas si tiene horugas el vehiculo o no
     */
    private int horugas;
    
    /**
     * tipoTrabajo descripcion de que tipo de labores se encarga de realizar la maquina
     */
    private String tipoTrabajo;

    
    /**
     * CarrosMaquinaria contructor que contiene las variables minimas para poder insertar 
     * vehiculos de tipo maquinaria
     * @param marca
     * @param precio
     * @param color
     * @param numeroRuedas
     * @param cilindraje 
     */
    public CarrosMaquinaria(String marca, float precio, String color, int numeroRuedas, int cilindraje, String placa) {
        super(marca, precio, color, numeroRuedas, cilindraje, placa);
        pesoTon=0;
        horugas=0;
        tipoTrabajo="";
    }

    /**
     * Contructor vaio que se usara para quemar los datos de inicio de programa
     */
    public CarrosMaquinaria() {
    }

    /**
     * getPesoTon retorna el valor del peso en toneladas del vehiculo
     * @return pesoTon
     */
    public int getPesoTon() {
        return pesoTon;
    }

    /**
     * setPesoTon permite asigna el valor del peso en toneladas 
     * @param pesoTon 
     */
    public void setPesoTon(int pesoTon) {
        this.pesoTon = pesoTon;
    }

    /**
     * getHorugas retorna el valor guardado en horugas
     * @return horugas
     */
    public int getHorugas() {
        return horugas;
    }

    /**
     * setHorugas permite asignar un valor para las horugas
     * @param horugas 
     */
    public void setHorugas(int horugas) {
        this.horugas = horugas;
    }

    /**
     * getTipoTrabajo retorna la descripcion del tipo de trabajo que realiza la maquina 
     * @return tipoTrabajo
     */
    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    /**
     * setTipoTrabajo permite asignar la descripcion del tipo de trabajo que realiza
     * @param tipoTrabajo 
     */
    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }
    
    
    
    
}
