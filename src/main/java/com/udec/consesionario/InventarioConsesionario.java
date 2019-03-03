package com.udec.consesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sun.security.krb5.internal.ktab.KeyTabConstants;



/**
 * Esta clase es donde estara el inventario de los vehiculos, tambien contiene los metodos de buscar por el mas 
 * caro y el mas barato
 * @author David
 */
public class InventarioConsesionario{
    /**
     * Se declaran las listas de que se van usar, para manejo del inventario,
     * y que seran usadas para guardar los datos del mas caro mas bararo 
     * y las lista unificada del los autos en lista inventario
     */
    ArrayList<CarrosPrincipal> listaInventario = new ArrayList<CarrosPrincipal>();
     List<vendedor> Lvendedor = new ArrayList<vendedor>();
    ClasePrincipal pricipal = new ClasePrincipal();
    Cliente cl = new Cliente();
    Venta ven= new Venta();
    vendedor vendedor= new vendedor();
    Scanner scanner = new Scanner(System.in);
    
    
    /**
     * este es el constructo vacio para pocer intaciar los metodos de la clase
     */
    public InventarioConsesionario() {        
    }

    /**
     * Contiene el menu para hallar el mas caro el mas barato y el vender 
     * 
     */
    public void unificar(){   
        System.out.println ("Seleccione el auto quiere insertar");
        System.out.println ("1. Ver inventario");
        System.out.println ("2. ver mas caro");
        System.out.println ("3. ver mas Barato");
        System.out.println ("4. vender");
        System.out.println ("5. Regresar menu");
        String variableControl = scanner.nextLine();
            int variableSeleccion=Integer.parseInt(variableControl);            
            if(variableSeleccion==1){
                impresionUnificacion();
            }else if(variableSeleccion==2){
                masCaro();
            }else if(variableSeleccion==3){
                    masBarato();
            }else if(variableSeleccion==4){
                   vender();
            }else if(variableSeleccion==5){
                ClasePrincipal cl = new ClasePrincipal();
                cl.menu();
            }  
    }
    
    /**
     * imprime, todo el inventario actual
     */
    public void impresionUnificacion(){
        for (CarrosPrincipal carro : listaInventario) {
            System.out.println("<-------El invantario es:"+""+carro.getMarca()+"------->\n"
            +"--su precio es:"+carro.getPrecio()+"\n--su color es:"+carro.getColor()+"\n--su cilindraje es:"+carro.getCilindraje()
            +"\n--tiene un numero de ruedas"+carro.getNumeroRuedas()+"\n y su placa:"+carro.getPlaca());  
        }
        unificar();
    }

    /**
     * ENcuentra el vehiculo mas caro en las listas
     */
    public void masCaro(){   
    float mayor=0; 
    String marca="";
        for(CarrosPrincipal cp : listaInventario){
            if(cp.getPrecio() > mayor){            
                mayor=cp.getPrecio();
                marca=cp.getMarca();
            }
        }
            System.out.println("<-------El mas caro es:"+""+marca+"------->\n"
            +"--su precio es:"+mayor);
        unificar();
    }
    
    /**
     * encuentra el vehiculo mas barato de la lista
     */
    public void masBarato(){   
    float menor=100000000;
    String marca="";
        for(CarrosPrincipal cp : listaInventario){
            if(cp.getPrecio() < menor){           
                menor=cp.getPrecio();
                marca=cp.getMarca();
            }
        
        }
        System.out.println("<-------El mas Barato es:"+""+marca+"------->\n"
            +"--su precio es:"+menor);
        unificar();
    }
    
 
    /**
     * En este metodo es donde se realiza la operacion de venta validando por su placa
     */
    public void vender(){
        System.out.println("Ingrese la placa a vender:");
        String placaVehiculo = scanner.nextLine();    
        for(CarrosPrincipal pc:listaInventario){
            if(pc.getPlaca().equals(placaVehiculo)){
                System.out.println("Seguro de que sea Vender el vehiculo: "+""+pc.getPlaca()+"\nConfrime la compra (s/n)");
                String caracter = scanner.next();
                if(caracter.equals("s")){
                    int indexLista = buscarIndex(placaVehiculo);
                    ven.Lventa.add(listaInventario.get(indexLista));
                    System.out.println("ingrese el nombre del cliente: ");
                    String nombre= scanner.next();
                    System.out.println("ingrese la Cedula del cliente: ");
                    String Cedula= scanner.next();
                    int ced=Integer.parseInt(Cedula);
                    cl.setNombreCliente(nombre);
                    cl.setCedulaCliente(ced);
                    ven.Lcliente.add(cl);
                    vendorVehiculo();
                } 

            }
        }     
        
    }
    
    /**
     * Este metodo recibe el estring de la placa del vehiculo para realizar la busqueda de su pocision de la lista 
     * y así poder retornar el index 
     * @param r
     * @return index
     */
    public int buscarIndex(String r){
    int index = -1;
    int bound = listaInventario.size();
    for (int userInd = 0; userInd < bound; userInd++) {
        if (listaInventario.get(userInd).getPlaca().equals(r)) {
            index = userInd;
            break;
        }
    }
    return index;
}
 
    /**
     * Recibe el parametro del nombre del vendedor,y retorna la pocison donde se encuentra el vendedor
     * @param r
     * @return index
     */
    public int buscarVendedor(String r){
    int index = -1;
    int bound = Lvendedor.size();
    for (int userInd = 0; userInd < bound; userInd++) {
        if (Lvendedor.get(userInd).getNombreVendedor().equals(r)) {
            index = userInd;
            break;
        }
    }
    return index;
}
    /**
     * este metodo se encarga de hacer toda la parte de la comision
     */
    public void vendorVehiculo(){
        System.out.println("ingrese el Nombre  del vendedor: ");
        String codigo= scanner.next();   
        float valorComision=(float) 0.05;
        for(vendedor vende : Lvendedor){
            if(vende.getNombreVendedor().equals(codigo)){
               for(CarrosPrincipal cr : ven.Lventa){
                    int indexVendedor=buscarVendedor(codigo);
                    float comision = cr.getPrecio();
                    comision=comision*valorComision;
                    Lvendedor.get(indexVendedor).setComision(comision);
                    ven.Lvendedor.addAll(Lvendedor);
            }
          }  
        }
    }
}
