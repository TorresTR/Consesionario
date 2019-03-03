package com.udec.consesionario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta es la clase principal donde se ejecutara todo el programa, donde estan los menus 
 * y algunos metodos para ejecuion 
 * @author David
 */

public class ClasePrincipal {
        /**
         * Se inicializan los ArrayList para, poder guardar los automoviles en sus respectivas
         * listas
         */
        ArrayList listaCarrosDeportivos = new ArrayList<>();
        ArrayList listaCarrosEstandar = new ArrayList<>();
        ArrayList listaCarrosMaquinaria = new ArrayList<>();
        ArrayList listaCarrosPersonalizado = new ArrayList<>();
        ArrayList listaVendedores = new ArrayList<>();
        /**
         * Inicializa el scanner para capturar las variables de entradas
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * instanciamos las calses hijas
         */
        CarrosDeportivo cd;
        CarrosEstandar ce;
        CarrosMaquinaria cm;
        CarrosPersonalizado cp;
        VendedorConsesionario ven;
        Venta venta = new Venta();
        
        int contador=0;
        /**
         * se llamada a la clase inventario
         */
        
        /**
         * Metodo main para iniciar la ejecucion del programa
         * @param args 
         */
        public static void main (String [ ] args) {          
            ClasePrincipal cs = new ClasePrincipal();
            cs.autosPordefecto();
             
    } //Cierre del main
    
    /**
     * esta clase insarta los autos por defecto al iniciar el programa
     */
    public void autosPordefecto(){
        
        ven=new VendedorConsesionario();
        ven.setCodigoVendedor(1);
        ven.setNombreVendedor("arturo");
        ven.setComision(0);
        listaVendedores.add(ven);

        ven=new VendedorConsesionario();
        ven.setCodigoVendedor(2);
        ven.setNombreVendedor("julian");
        ven.setComision(0);
        listaVendedores.add(ven);

        ven=new VendedorConsesionario();
        ven.setCodigoVendedor(3);
        ven.setNombreVendedor("manuel");
        ven.setComision(0);
        listaVendedores.add(ven);
        
        /**
         * insercion auto, personalizado
         */
        cp= new CarrosPersonalizado("bmw",120000,"rojo",4,1200,"tui789");
        cp.setAlerones(4);
        cp.setTamañoRuedas(22);
        cp.setNo2("si tiene no2");
        listaCarrosPersonalizado.add(cp);
        
        /**
         * insercion de auto tipo maquinaria
         */
        cm= new CarrosMaquinaria("jhonn deer",500000,"verde",16,800,"aaa111");
        cm.setPesoTon(16);
        cm.setHorugas(0);
        cm.setTipoTrabajo("camion de carga pesada");
        listaCarrosMaquinaria.add(cm);
       
        
        /**
         * insertar auto deportivo
         */
        cd= new CarrosDeportivo("ferrari",300000,"azul",4,200,"fvs453");
        cd.setAceleracion(3);
        cd.setAdherenciaAsfalto(50);
        cd.setCaballosFuerza(500);
        cd.setVelocidadMaxima(450);
        listaCarrosDeportivos.add(cd);
        
        /**
         * insertar autos estandar
         */
        ce= new CarrosEstandar("toyota",50000,"gris",4,500,"gr453");
        ce.setConsumoConbustible(19);
        ce.setErgonomia("consumo de ocnbustible bajo y ergonomico");
        ce.setNumeroPasajaeros(6);
        listaCarrosEstandar.add(ce);
       
         /**
         * insercion auto, personalizado
         */
        cp= new CarrosPersonalizado("subaru",140000,"rojo",2,120,"tyr773");
        cp.setAlerones(2);
        cp.setTamañoRuedas(12);
        cp.setNo2("no tiene no2");
        listaCarrosPersonalizado.add(cp);
         
        /**
         * insercion de auto tipo maquinaria
         */
        cm= new CarrosMaquinaria("Ford",6000,"negro",16,80,"rey658");
        cm.setPesoTon(13);
        cm.setHorugas(2);
        cm.setTipoTrabajo("retroescavadora");
        listaCarrosMaquinaria.add(cm);
        /**
         * insertar auto deportivo
         */
        cd= new CarrosDeportivo("maserrati",30000,"amarillo",4,20,"saf780");
        cd.setAceleracion(34);
        cd.setAdherenciaAsfalto(10);
        cd.setCaballosFuerza(200);
        cd.setVelocidadMaxima(650);
        listaCarrosDeportivos.add(cd);
        
        /**
         * insertar autos estandar
         */
        ce= new CarrosEstandar("mazda",2000,"gris",4,20,"vbn456");
        ce.setConsumoConbustible(2);
        ce.setErgonomia("solo ergonomico");
        ce.setNumeroPasajaeros(3);
        listaCarrosEstandar.add(ce);
        menu();
    }
    
    /**
     * menu para moverse por el programa 
     */
    public  void menu(){
            System.out.println ("Bienvenido al meno del Consesionario:");
            System.out.println ("Seleccione una opcion");
            System.out.println ("1.Insertar autos");
            System.out.println ("2.Insertar empleados");
            System.out.println ("3.Inventario");
            String variableControl = scanner.nextLine();
            int variableSeleccion=Integer.parseInt(variableControl);
            
            if(variableSeleccion==1){
                menuInsertar();
            }else if(variableSeleccion==2){
                
            }else if (variableSeleccion == 3){                
                InventarioConsesionario inventarioC = new InventarioConsesionario();
                if(listaCarrosDeportivos != null && listaCarrosEstandar !=null && listaCarrosMaquinaria !=null && listaCarrosPersonalizado !=null){
                    inventarioC.listaInventario.addAll(listaCarrosDeportivos);
                    inventarioC.listaInventario.addAll(listaCarrosEstandar);
                    inventarioC.listaInventario.addAll(listaCarrosMaquinaria);
                    inventarioC.listaInventario.addAll(listaCarrosPersonalizado);
                    inventarioC.LvendedorInventario.addAll(listaVendedores);
                    inventarioC.unificar();
                }else{
                    System.out.println ("no hay datos de vehiculos inserve uno valido");
                    menu();
                } 
            }else{
                System.out.println ("Inserte una opcion valida");
                menu();
            }
        }//menu Principal   
        
    /**
     * menu que manjea la insercion de autos 
     */
    public  void menuInsertar(){
        System.out.println ("Seleccione el auto quiere insertar");
        System.out.println ("1. Autos Deportivos");
        System.out.println ("2. Autos Estandar");
        System.out.println ("3. Maquinarias");
        System.out.println ("4. Autos Personalizados");
        System.out.println ("5. Volver la menu");
        String variableControl = scanner.nextLine();
        int variableSeleccion=Integer.parseInt(variableControl);
        switch (variableSeleccion) {
            case 1:
                capturaDeportivos();
                break;
            case 2:
                capturarEstandar();
                break;
            case 3:
                CapturarMaquinaria();
                break;
            case 4:
                capturarPersonalizado();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println ("Seleccione una opcion valida");
                menuInsertar();
                break;
            }
        }//menu de captura de datos (insercion) 
    
    /**
     * se capturan los datos de los vehiculos deportivos para poder añadirse en la lista
     */
    public void capturaDeportivos(){
        //Pedimos los datos de los vehiculos deportivos
        System.out.print("Ingresa La marca del vehiculo: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Ingresa La placa del vehiculo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingresa el precio del vehiculo: ");
        String precioVehiculo = scanner.nextLine();
        float pv=Integer.parseInt(precioVehiculo);
        System.out.print("Ingresa el color del vehiculo: ");
        String colorVehiculo = scanner.nextLine();
        System.out.print("Ingresa el numero de ruedas del vehiculo: ");
        String numeroRuedas = scanner.nextLine();
        int nr=Integer.parseInt(numeroRuedas);
        System.out.print("Ingresa el cilindraje del vehiculo: ");
        String cilindrajeVehiculo = scanner.nextLine();
        int cv=Integer.parseInt(cilindrajeVehiculo);
        System.out.print("Ingresa la  aceleracion del vehiculo: ");
        String aceleracionVehiculo = scanner.nextLine();
        int av=Integer.parseInt(aceleracionVehiculo);
        System.out.print("Ingresa la  velocidad maxima del vehiculo: ");
        String velocidadMaxima = scanner.nextLine();
        int vm=Integer.parseInt(velocidadMaxima);
        System.out.print("Ingresa la  adherencia al asfalto del vehiculo: ");
        String adherenciaAsfalto = scanner.nextLine();
        int aA=Integer.parseInt(adherenciaAsfalto);
        System.out.print("Ingresa los caballos de fuerza del vehiculo: ");
        String caballosFuerza = scanner.nextLine();
        int cf=Integer.parseInt(caballosFuerza);
        insertarDeportivo(marcaVehiculo, pv, colorVehiculo, nr, cv, av, aA, cf, vm, placa);
    }//captura los datos de los autos deportivos
    
    /**
     * Solicita los parametros para poder insertar en el arraylist correspondiente
     * @param marcaVehiculo
     * @param pv
     * @param colorVehiculo
     * @param nr
     * @param cv
     * @param av
     * @param aA
     * @param cf
     * @param vm 
     */
    public void insertarDeportivo(String marcaVehiculo,float pv,String colorVehiculo,int nr,int cv, int av,int aA,int cf,int vm,String placa){
        cd= new CarrosDeportivo(marcaVehiculo,pv,colorVehiculo,nr,cv, placa);
        cd.setAceleracion(av);
        cd.setAdherenciaAsfalto(aA);
        cd.setCaballosFuerza(cf);
        cd.setVelocidadMaxima(vm);
        listaCarrosDeportivos.add(cd);
        
        menuInsertar();
    }
    
    /**
     * captura los datos para, necesarios para poder insertar CarrosEstandar
     */
    public void capturarEstandar(){
        //Pedimos los datos de los vehiculos deportivos
        System.out.print("Ingresa La marca del vehiculo: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Ingresa La placa del vehiculo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingresa el precio del vehiculo: ");
        String precioVehiculo = scanner.nextLine();
        float pv=Integer.parseInt(precioVehiculo);
        System.out.print("Ingresa el color del vehiculo: ");
        String colorVehiculo = scanner.nextLine();
        System.out.print("Ingresa el numero de ruedas del vehiculo: ");
        String numeroRuedas = scanner.nextLine();
        int nr=Integer.parseInt(numeroRuedas);
        System.out.print("Ingresa el cilindraje del vehiculo: ");
        String cilindrajeVehiculo = scanner.nextLine();
        int cv=Integer.parseInt(cilindrajeVehiculo);
        System.out.print("Ingresa el consumo de conbustible del vehiculo: ");
        String consumoVehiculo = scanner.nextLine();
        int cvc=Integer.parseInt(consumoVehiculo);
        System.out.print("Ingresa la  ergonomia  del vehiculo: ");
        String ergonomia = scanner.nextLine();
        System.out.print("Ingresa el numero de pasajeros del vehiculo: ");
        String numeroPasajeros = scanner.nextLine();
        int np=Integer.parseInt(numeroPasajeros);
        insertarEstandar(marcaVehiculo, pv, colorVehiculo, nr, cv, cvc, ergonomia, np, placa);
    }
    
    /**
     * SOlicita los datos necesarios de Autos estandar para poder ser insertados 
     * @param marcaVehiculo
     * @param pv
     * @param colorVehiculo
     * @param nr
     * @param cv
     * @param cvc
     * @param ergonomia
     * @param np 
     */
    public void insertarEstandar(String marcaVehiculo,float pv,String colorVehiculo,int nr,int cv, int cvc,String ergonomia,int np,String placa){
        ce= new CarrosEstandar(marcaVehiculo,pv,colorVehiculo,nr,cv,placa);
        ce.setConsumoConbustible(cvc);
        ce.setErgonomia(ergonomia);
        ce.setNumeroPasajaeros(np);
        listaCarrosEstandar.add(ce);
       menuInsertar();
    }
    
    
    /**
     * Captura los datos necesarios para poder ser insertado en la lista de MAquinaria
     */
    public void CapturarMaquinaria(){
        //Pedimos los datos de los vehiculos deportivos
        System.out.print("Ingresa La marca del vehiculo: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Ingresa La placa del vehiculo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingresa el precio del vehiculo: ");
        String precioVehiculo = scanner.nextLine();
        float pv=Integer.parseInt(precioVehiculo);
        System.out.print("Ingresa el color del vehiculo: ");
        String colorVehiculo = scanner.nextLine();
        System.out.print("Ingresa el numero de ruedas del vehiculo: ");
        String numeroRuedas = scanner.nextLine();
        int nr=Integer.parseInt(numeroRuedas);
        System.out.print("Ingresa el cilindraje del vehiculo: ");
        String cilindrajeVehiculo = scanner.nextLine();
        int cv=Integer.parseInt(cilindrajeVehiculo);
        System.out.print("Ingresa el peso del vehiculo en[TONELADAS]: ");
        String pesoVehiculo = scanner.nextLine();
        int pvton=Integer.parseInt(pesoVehiculo);
        System.out.print("Ingresa las horugas del vehiculo: ");
        String horugas = scanner.nextLine();
        int  horu=Integer.parseInt(horugas);
        System.out.print("Ingresa tipo de carga o de trabajo del vehiculo: ");
        String tipoTrabajo = scanner.nextLine();
        insertarMaquinaria(marcaVehiculo, pv, colorVehiculo, nr, cv, pvton, horu, tipoTrabajo,placa);
    }
    
    /**
     * Solicita los datos minimos para poder insertar en los Arraylist el nuevo, vehiculo
     * @param marcaVehiculo
     * @param pv
     * @param colorVehiculo
     * @param nr
     * @param cv
     * @param pvton
     * @param horu
     * @param tipoTrabajo 
     */
    public void insertarMaquinaria(String marcaVehiculo,float pv,String colorVehiculo,int nr,int cv, int pvton,int horu,String tipoTrabajo,String placa){
        cm= new CarrosMaquinaria(marcaVehiculo,pv,colorVehiculo,nr,cv,placa);
        cm.setPesoTon(pvton);
        cm.setHorugas(horu);
        cm.setTipoTrabajo(tipoTrabajo);
        listaCarrosMaquinaria.add(cm);
        menuInsertar();
    }
    
    
    /**
     * Solicita los datos necesarios de los autos personalizados
     */
    public void capturarPersonalizado(){
        //Pedimos los datos de los vehiculos deportivos
        System.out.print("Ingresa La marca del vehiculo: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Ingresa La placa del vehiculo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingresa el precio del vehiculo: ");
        String precioVehiculo = scanner.nextLine();
        float pv=Integer.parseInt(precioVehiculo);
        System.out.print("Ingresa el color del vehiculo: ");
        String colorVehiculo = scanner.nextLine();
        System.out.print("Ingresa el numero de ruedas del vehiculo: ");
        String numeroRuedas = scanner.nextLine();
        int nr=Integer.parseInt(numeroRuedas);
        System.out.print("Ingresa el cilindraje del vehiculo: ");
        String cilindrajeVehiculo = scanner.nextLine();
        int cv=Integer.parseInt(cilindrajeVehiculo);
        System.out.print("Ingresa el numero de alerones del vehiculo: ");
        String aleronesVehiculos = scanner.nextLine();
        int av=Integer.parseInt(aleronesVehiculos);
        System.out.print("Ingresa Tamaño de las ruedas  del vehiculo: ");
        String tamañoRuedas = scanner.nextLine();
        int  tr=Integer.parseInt(tamañoRuedas);
        System.out.print("Ingresa NO2 en el  vehiculo: ");
        String no2 = scanner.nextLine();
        insertarPersonalizado(marcaVehiculo, pv, colorVehiculo, nr, cv, av, tr, no2, placa);
    }
    
    /**
     * REcibe los parametros necesarios para insertar, en el arraylist de autos personalizados
     * @param marcaVehiculo
     * @param pv
     * @param colorVehiculo
     * @param nr
     * @param cv
     * @param av
     * @param tr
     * @param no2 
     */
    public void insertarPersonalizado(String marcaVehiculo,float pv,String colorVehiculo,int nr,int cv, int av,int tr,String no2, String placa){
        cp= new CarrosPersonalizado(marcaVehiculo,pv,colorVehiculo,nr,cv,placa);
        cp.setAlerones(av);
        cp.setTamañoRuedas(tr);
        cp.setNo2(no2);
        listaCarrosPersonalizado.add(cp);
        menuInsertar();
    }
    
    
}//clase principal


