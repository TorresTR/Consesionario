package com.udec.consesionario;

/**
 * Esta clase se capturan los datos de autos deportivos
 * @author David
 */
public class CarrosDeportivo extends CarrosPrincipal{

    /*
    aceleracion guarda el valor de la aceleracion del vehiculo
    */
    private int aceleracion;
    
    /*
    velocidadMaxima guarda la velocidad maxima del vehiculo
    */
    private int velocidadMaxima;
    
    /*
    adherenciaAsfalto guarda la adherencia que tiene el vehiculo al asfalto
    */
    private int adherenciaAsfalto;
    
    /*
    caballosFuerza guarda los caballos de fuerza del vehiculo
    */
    private int caballosFuerza;
    
    /**
     * Este constructor solicita los datos para ser inicializado 
     * @param marca
     * @param precio
     * @param color
     * @param numeroRuedas
     * @param cilindraje 
     */
    public CarrosDeportivo(String marca, int precio, String color, int numeroRuedas, int cilindraje) {
        super(marca, precio, color, numeroRuedas, cilindraje);
        aceleracion=0;
        velocidadMaxima=0;
        adherenciaAsfalto=0;
        caballosFuerza=0;
    }

    /**
     * CarrosDeportivos es un constructor vacio que permite dejar quemados ciertos datos
     */
    public CarrosDeportivo() {
    }

 
    /*
    getAceleracion permite retornar el valor de la aceleracion
    */
    public int getAceleracion() {
        return aceleracion;
    }

    /*
    setAceleracion peromite Asignar un valor para la aceleracion
    */
    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    /*
    getVelocidadMaxima retorna el valor de la velocidad maxima
    */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * setVelocidadMaxima permite asignar el valor de la velocidad maxima
     * @param velocidadMaxima 
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * getAdherenciaAsfalto retorna el valor de la adherencia
     * @return adherenciaAsfalto
     */
    public int getAdherenciaAsfalto() {
        return adherenciaAsfalto;
    }

    /**
     * setAdherenciaAsfalto permite asinar el valor de la adherencia
     * @param adherenciaAsfalto 
     */
    public void setAdherenciaAsfalto(int adherenciaAsfalto) {
        this.adherenciaAsfalto = adherenciaAsfalto;
    }
    
    /**
     * getCaballosFuerza retorna el valor de los caballos de fuerza del vehiculo
     * @return caballosFuerza
     */
    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * setCaballosFuerza permite asignar un valor para los caballos de fuerza 
     * @param caballosFuerza 
     */
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
     
}
