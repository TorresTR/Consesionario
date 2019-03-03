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
 *
 * @author David
 */
public class Factura {
    
    private String codigoFactura;
    
    private Date fecha;
    
    List<Venta> facturaVenta = new ArrayList<Venta>();
    
    ListaFactura Lfactu= new ListaFactura();
    
    Scanner scanner = new Scanner(System.in);
    Factura fac = new Factura();

    public Factura() {
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Venta> getFacturaVenta() {
        return facturaVenta;
    }

    public void setFacturaVenta(List<Venta> facturaVenta) {
        this.facturaVenta = facturaVenta;
    }
    
    
    public void generarFactura(List<Venta> ven){
        System.out.println("Ingrese el codigo de la factura:");
        String codigoFac = scanner.next();
        java.util.Date fechaFac = new Date();
        fac.setCodigoFactura(codigoFac);   
        fac.setFecha(fechaFac);
        fac.facturaVenta.addAll(ven);
        Lfactu.LfacturaFinal.add(fac);
        
    }
}
