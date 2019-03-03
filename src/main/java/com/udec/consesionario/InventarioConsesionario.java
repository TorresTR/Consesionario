package com.udec.consesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




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
    List<Vendedor> LvendedorInventario = new ArrayList<Vendedor>();
    List<Venta> LventaInventario= new ArrayList<Venta>();     
    ClasePrincipal pricipal = new ClasePrincipal();
    Cliente cl = new Cliente();
    Venta ven= new Venta();
    Vendedor vendedor= new Vendedor();
    Factura factu = new Factura();
    Scanner scanner = new Scanner(System.in);
    Boolean bandera = false;
    
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
        System.out.println ("<--------------Seleccione una opcion: ------------------>");
        System.out.println ("1. Ver inventario");
        System.out.println ("2. ver mas caro");
        System.out.println ("3. ver mas Barato");
        System.out.println ("4. vender");
        System.out.println ("5. Facturacion");
        System.out.println ("6. Regresar menu");
        int variableControl = scanner.nextInt();         
            if(variableControl==1){
                impresionUnificacion();
            }else if(variableControl==2){
                masCaro();
            }else if(variableControl==3){
                    masBarato();
            }else if(variableControl==4){
                   vender();
            }else if(variableControl==5){
                menuFacturaYVendedor();
            }else if(variableControl==6){
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
        ven = new Venta();
        System.out.println("Ingrese la placa a vender:");
        String placaVehiculo = scanner.next();    
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
                }else if(caracter.equals("n")){
                    bandera=true;
                    unificar();
                }
            }
        }  
    }
    
    /**
     * este metodo se encarga de hacer toda la parte de la comision
     */
    public void vendorVehiculo(){
        System.out.println("ingrese el Nombre  del vendedor: ");
        String codigo= scanner.next();   
        System.out.println("ingrese el Codigo  de la venta: ");
        String codigoEntero= scanner.next(); 
        float valorComision=(float) 0.05;
        int contador=0;
        for(Vendedor vende : LvendedorInventario){
            if(vende.getNombreVendedor().equals(codigo)){
               for(CarrosPrincipal cr : listaInventario){
                    if(contador==0){
                        int indexVendedor=buscarVendedor(codigo);
                        float comision = cr.getPrecio();
                        comision=comision*valorComision;
                        LvendedorInventario.get(indexVendedor).setComision(comision);
                        ven.Lvendedor.add(LvendedorInventario.get(indexVendedor));
                        ven.setCodigoVenta(codigoEntero);
                        LventaInventario.add(ven);
                    }
                    contador+=contador+1;
            }
          }  
        }
        System.out.println("Desea agregar mas Ventas(s/n): ");
        String ventas= scanner.next();
        if(ventas.equals("s")){
            seguirVentas(codigoEntero,codigo,valorComision);
        }else if(ventas.equals("n")){
            bandera=true;
            unificar();
        }     
    }
    
    /**
     * Implementa, agregar un nueva venta, de los vehiculos para un mismo usuario
     * @param codigo
     * @param vendedor
     * @param valorComision 
     */
    public void seguirVentas(String codigo,String vendedor,float valorComision){
        int valorIndex = buscarIndexVenta(codigo);
        System.out.println("Ingrese la placa a vender:");
        String placaVehiculo = scanner.next(); 
         for(CarrosPrincipal pc:listaInventario){
            if(pc.getPlaca().equals(placaVehiculo)){
                 System.out.println("Seguro de que sea Vender el vehiculo: "+""+pc.getPlaca()+"\nConfrime la compra (s/n)");
                    String caracter = scanner.next();
                    if(caracter.equals("s")){
                        int indexLista = buscarIndex(placaVehiculo);
                        LventaInventario.get(valorIndex).Lventa.add(listaInventario.get(indexLista));
                        int indexVendedor=buscarVendedorLVenta(vendedor);
                        float comision = pc.getPrecio();
                        float val = ven.Lvendedor.get(indexVendedor).getComision();
                        comision=(comision*valorComision)+val;
                        LventaInventario.get(valorIndex).Lvendedor.get(indexVendedor).setComision(comision);
                        seguirVentas(codigo, vendedor, valorComision);
                    }else if(caracter.equals("n")){
                        unificar();
                    }
            }
         }
         
    }
    
    /**
     * Metodo para hacer que el programa quede cilcico
     * @param codigo
     * @param vendedor
     * @param valorComision 
     */
    public void confirmarSeguir(String codigo,String vendedor,float valorComision){
        System.out.println("Desea agregar mas Ventas(s/n): ");
        String ventas= scanner.next();
        if(ventas.equals("s")){
        seguirVentas( codigo, vendedor, valorComision);
        }else if(ventas.equals("n")){
            unificar();
        }    
    
    }
    
    public void menuFacturaYVendedor(){
        System.out.println ("<--------------Seleccione una opcion de factura: ------------------>");
        System.out.println ("1. Generar Factura");
        System.out.println ("2. ver mas vendido");
        System.out.println ("3. ver menos vendido");
        int variableControl = scanner.nextInt();         
            if(variableControl==1){
                if(bandera == true){
                    factu.generarFactura(LventaInventario);
                }else{
                    System.out.println ("no hay datos para facturar");
                    unificar();
                }
            }else if(variableControl==2){
                masCaro();
            }else if(variableControl==3){
                    masBarato();
            }
        
    }
    
    /**
     * Busca, el index de la venta que esta guardado en la lista de ventas
     * @param r
     * @return 
     */
     public int buscarIndexVenta(String r){
    int index = -1;
    int bound = LventaInventario.size();
    for (int userInd = 0; userInd < bound; userInd++) {
        if (LventaInventario.get(userInd).getCodigoVenta().equals(r)) {
            index = userInd;
            break;
        }
    }
    return index;
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
     * Recibe el parametro del nombre del Vendedor,y retorna la pocison donde se encuentra el Vendedor
     * @param r
     * @return index
     */
    public int buscarVendedor(String r){
    int index = -1;
    int bound = LvendedorInventario.size();
    for (int userInd = 0; userInd < bound; userInd++) {
        if (LvendedorInventario.get(userInd).getNombreVendedor().equals(r)) {
            index = userInd;
            break;
        }
    }
    return index;
}
    
    /**
     * Retorna el index del Vendedor en la lista de ventas 
     * @param r
     * @return 
     */
    public int buscarVendedorLVenta(String r){
    int index = -1;
    int bound = LventaInventario.size();
    for (int userInd = 0; userInd < bound; userInd++) {
        if (LventaInventario.get(userInd).Lvendedor.get(userInd).getNombreVendedor().equals(r)) {
            index = userInd;
            break;
        }
    }
    return index;
}
    
}//clase Inventario


