package com.udec.consesionario;

/**
 * Esta clase se capturan los datos de autos deportivos
 * @author David
 */
public class CarrosDeportivos extends CarrosPrincipal{

    private int aceleracion;
    
    private int velocidadMaxima;
    
    private int adherenciaAsfalto;
    
    private int caballosFuerza;
    
    public CarrosDeportivos(String marca, int precio, String color, int numeroRuedas, int cilindraje) {
        super(marca, precio, color, numeroRuedas, cilindraje);
        aceleracion=0;
        velocidadMaxima=0;
        adherenciaAsfalto=0;
        caballosFuerza=0;
    }

    public CarrosDeportivos() {
    }

 

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getAdherenciaAsfalto() {
        return adherenciaAsfalto;
    }

    public void setAdherenciaAsfalto(int adherenciaAsfalto) {
        this.adherenciaAsfalto = adherenciaAsfalto;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
    
     public void pintarCarro() {
        System.out.println ("el vehiculo deportivo es: " + getMarca()+ "\n su color es:" +  getColor()+
         "\n su precio es: " + getPrecio()+"\n su numero de ruedas es: "+getNumeroRuedas()
                +"\n su cilindraje es:"+getCilindraje()+"\n su aceleracion es:"+getAceleracion()+"\n su adherencia es:"+getAdherenciaAsfalto()
       +"\n sus caballos de fuerza son:"+getCaballosFuerza()+"\n su velocidad maxima es:"+getVelocidadMaxima()); }
    
   
     
}
