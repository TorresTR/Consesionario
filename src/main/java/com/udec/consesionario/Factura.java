/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.consesionario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *Esta clase se encarga de hacer las facturas
 * @author David
 */
public class Factura {
    
    /**
     * se captura el codigo de la factura
     */
    private String codigoFactura;
    
    /**
     * se captura la fecha de la factura 
     */
    private Date fecha;
    
    /**
     * se hace una lista<venta> la cual se encargara de recibir la lista de la venta en ella 
     * y la lista factura es donde almacenamos la factura ya con su codigo fecha y sera la que se envie a listaFactura
     */
    List<Venta> facturaVenta = new ArrayList<Venta>();
    
    
    

    /**
     * constructor de la clase factura
     */
    public Factura() {
    }

    /**
     * Retorna el codigo de la factura
     * @return codigoFactura
     */
    public String getCodigoFactura() {
        return codigoFactura;
    }

    /**
     * Permite asignar un codigo para la factura
     * @param codigoFactura 
     */
    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    /**
     * retorna la facha para la factura
     * @return 
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * permite asignar un valor para la fecha de la factura
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Retorna la lista de facturaVenta
     * @return facturaVenta
     */
    public List<Venta> getFacturaVenta() {
        return facturaVenta;
    }

    /**
     * permite asignar valores a la lista de facturaVenta
     * @param facturaVenta 
     */
    public void setFacturaVenta(List<Venta> facturaVenta) {
        this.facturaVenta = facturaVenta;
    }
    
    /**
     * Este metodo recibe una lista que contiene objetos venta dentro de si misma para poder guardarlo y unificarlo con los
     * atrubutis de la clase Factura
     * @param ven 
     */
    public void generarFactura(List<Venta> ven){
        ListaFactura Lfactu= new ListaFactura();
        List factura = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        Factura fac = new Factura();
        System.out.println("Ingrese el codigo de la factura:");
        String codigoFac = scanner.next();
        java.util.Date fechaFac = new Date();
        fac.setCodigoFactura(codigoFac);   
        fac.setFecha(fechaFac);
        fac.facturaVenta.addAll(ven);
        factura.add(fac);
        Lfactu.recibirLista(factura);
        
    }
}
