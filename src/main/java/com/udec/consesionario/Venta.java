/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.consesionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class Venta {
    /**
     * codigoVenta guarda el codigo de las ventas
     */
    private String codigoVenta;
    /**
     * Lventa es la lista que guadara los datos de las ventas
     * Lcliente es un alista que alamacena los datos del cliente
     */
    List<CarrosPrincipal> Lventa = new ArrayList<CarrosPrincipal>();
    List<Cliente> Lcliente = new ArrayList<Cliente>();
    List<VendedorConsesionario> Lvendedor = new ArrayList<VendedorConsesionario>();
    /**
     * contructor vacio para inicializar los datos
     */
    public Venta() {
    }

    /**
     * Retorna el codigo de venta
     * @return codigoVenta
     */
    public String getCodigoVenta() {
        return codigoVenta;
    }

    /**
     * Asigana el valor de codigo de venta
     * @param codigoVenta 
     */
    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    /**
     * Retorna la lista de venta
     * @return Lventa
     */
    public List<CarrosPrincipal> getLventa() {
        return Lventa;
    }

    /**
     * Permitre escribir los datos de la lista 
     * @param Lventa 
     */
    public void setLventa(List<CarrosPrincipal> Lventa) {
        this.Lventa = Lventa;
    }

    public List<Cliente> getLcliente() {
        return Lcliente;
    }

    public void setLcliente(List<Cliente> Lcliente) {
        this.Lcliente = Lcliente;
    }

    public List<VendedorConsesionario> getLvendedor() {
        return Lvendedor;
    }

    public void setLvendedor(List<VendedorConsesionario> Lvendedor) {
        this.Lvendedor = Lvendedor;
    }
    
    
}
