/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.consesionario;

/**
 *Clase pojo que almacena los datos del cliente
 * @author David
 */
public class Cliente {
 
    /**
     * guarda el nombre del cliente
     */
    private String nombreCliente;
    
    /**
     * guarda la cedula del cliente
     */
    private int cedulaCliente;

    /**
     * contructor que permite llamar a la clase cliente
     */
    public Cliente() {
    }

    /**
     * Retorna el nombre del cliente
     * @return nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * PErmite asignar un nombre al cliente
     * @param nombreCliente 
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Retorna la cedula del cliente
     * @return cedulaCliente
     */
    public int getCedulaCliente() {
        return cedulaCliente;
    }

    /**
     * permite asignar un valor a la cedula cel cliente
     * @param cedulaCliente 
     */
    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
    
    
}
