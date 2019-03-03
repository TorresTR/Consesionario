/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.consesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *Esta clase se encarga de tener la lista unificada de la factura, y de calcular el mas vendido y el menos vendido
 * @author David
 */
public class ListaFactura {
    /**
     * Creamos una lista que contiene objetos de tipo Factura dentro de si misma
     */
    List<Factura> LfacturaFinal = new ArrayList<Factura>();
    List<CarrosPrincipal>  CarroP = new ArrayList<CarrosPrincipal>();
    Scanner scanner = new Scanner(System.in);
    /**
     * constructor de la clase
     */
    public ListaFactura() {
    }

    /**
     * Retorna el valor de los datos en factura 
     * @return LfacturaFinal
     */
    public List<Factura> getLfacturaFinal() {
        return LfacturaFinal;
    }

    /**
     * permite asignar valores a la lista 
     * @param LfacturaFinal 
     */
    public void setLfacturaFinal(List<Factura> LfacturaFinal) {
        this.LfacturaFinal = LfacturaFinal;
    }
    
    /**
     * metodo que recibe una lista de tipo factura para poder guardarla en la lista de la clase 
     * @param fac 
     */
    public void recibirLista(List<Factura> fac){
        LfacturaFinal.addAll(fac);
        for (int i = 0; i <= LfacturaFinal.size()-1; i++) {
               System.out.println("-------------------Factura---------------------------"
                    +"\ncodigo Factura: " +LfacturaFinal.get(i).getCodigoFactura()
                    +"\nfecha: "+ LfacturaFinal.get(i).getFecha()
                    +"\nNombre del cliente: " + LfacturaFinal.get(i).facturaVenta.get(i).Lcliente.get(i).getNombreCliente()
                    +"\nCedula Cliente: " + LfacturaFinal.get(i).facturaVenta.get(i).Lcliente.get(i).getCedulaCliente()
                    +"\nNombre Vendedor: "+LfacturaFinal.get(i).facturaVenta.get(i).Lvendedor.get(i).getNombreVendedor()
                    );
            for(int j=0;j<=LfacturaFinal.get(i).facturaVenta.get(i).Lventa.size()-1;j++){
                System.out.println("\nVehiculo Comprado: "+LfacturaFinal.get(i).facturaVenta.get(i).Lventa.get(j).getMarca()
                    +"\nPlaca Vehiculo: "+LfacturaFinal.get(i).facturaVenta.get(i).Lventa.get(j).getPlaca()
                    +"\nPrecio Vehiculo: "+LfacturaFinal.get(i).facturaVenta.get(i).Lventa.get(j).getPrecio()
                    +"\n----------------------------------------------");
            }
        }
        menu(LfacturaFinal);
    }
    
   
    /**
     * menu que se encarga de llevar al menos vendido y al ams vendido 
     * @param LfacturaFinal 
     */
    public void menu(List<Factura> LfacturaFinal){
        System.out.println ("<--------------Seleccione una opcion: ------------------>");
        System.out.println ("1. ver mas vendido");
        System.out.println ("2. ver menos vendido");
        System.out.println ("3. volver");
        int variableControl = scanner.nextInt();
            if(variableControl==1){
                masVendido(LfacturaFinal);
            }else if(variableControl==2){
                    
            }else if(variableControl==3){
                    InventarioConsesionario inv = new InventarioConsesionario();
                    inv.menuFacturaYVendedor();
            }
    }
    
    /**
     * metodo que se encarga de clacular el mas vendido 
     */
    public void masVendido(List<Factura> LfacturaFinal){
      int  contador=0;
      for (int i = 0; i <= LfacturaFinal.size()-1; i++) {
            for(int j=0;j<=LfacturaFinal.get(i).facturaVenta.get(i).Lventa.size()-1;j++){
                if(LfacturaFinal.get(i).facturaVenta.get(i).Lventa.get(i).getMarca().equals(LfacturaFinal.get(i).facturaVenta.get(i).Lventa.get(j).getMarca())){
                    contador=contador+1;
                System.out.println("\nVehiculo mas vendido: "+LfacturaFinal.get(i).facturaVenta.get(i).Lventa.get(j).getMarca()
                    +"su cantidad vendida es de: "+contador    
                    +"\n----------------------------------------------");
                }
                
            }
        }
        menu(LfacturaFinal);
    }
    
    /**
     * metodo que se encarga de calcular el menos vendido 
     */
    public void menosVendido(List<Factura> LfacturaFinal){
        int  contador=0;
      for (int i = 0; i <= LfacturaFinal.size()-1; i++) {
            for(int j=0;j<=LfacturaFinal.get(i).facturaVenta.get(i).Lventa.size()-1;j++){
                if(LfacturaFinal.get(i).facturaVenta.get(i).Lventa.get(i).getMarca().equals(LfacturaFinal.get(i).facturaVenta.get(i).Lventa.get(i).getMarca())){
                    contador=contador+1;
                System.out.println("\nVehiculo menos vendido: "+LfacturaFinal.get(i).facturaVenta.get(i).Lventa.get(j).getMarca()
                    +"su cantidad vendida es de: "+contador    
                    +"\n----------------------------------------------");
                }
                
            }
        }
        menu(LfacturaFinal);
    }
    
    
    
    
    
}
