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
        InventarioConsesionario inv;  
        
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
        /**
         * insercion auto, personalizado
         */
        cp= new CarrosPersonalizado("bmw",120000,"rojo",4,1200);
        cp.setAlerones(4);
        cp.setTamañoRuedas(22);
        cp.setNo2("si tiene no2");
        listaCarrosPersonalizado.add(cp);
        inv = new InventarioConsesionario();
        contador+=1;
        cp= new CarrosPersonalizado("bmw",120000,"rojo",4,1200);
        cp.setAlerones(4);
        cp.setTamañoRuedas(22);
        cp.setNo2("si tiene no2");
        cp.setIdInventario(contador);
        inv.listaInventario.add(cp);
        /**
         * insercion de auto tipo maquinaria
         */
        cm= new CarrosMaquinaria("jhonn deer",500000,"verde",16,800);
        cm.setPesoTon(16);
        cm.setHorugas(0);
        cm.setTipoTrabajo("camion de carga pesada");
        listaCarrosMaquinaria.add(cm);
        contador+=1;
        cm= new CarrosMaquinaria("jhonn deer",500000,"verde",16,800);
        cm.setPesoTon(16);
        cm.setHorugas(0);
        cm.setTipoTrabajo("camion de carga pesada");
        cm.setIdInventario(contador);
        inv.listaInventario.add(cm);
        
        /**
         * insertar auto deportivo
         */
        cd= new CarrosDeportivo("ferrari",300000,"azul",4,200);
        cd.setAceleracion(3);
        cd.setAdherenciaAsfalto(50);
        cd.setCaballosFuerza(500);
        cd.setVelocidadMaxima(450);
        listaCarrosDeportivos.add(cd);
        contador+=1;
        cd= new CarrosDeportivo("ferrari",300000,"azul",4,200);
        cd.setAceleracion(3);
        cd.setAdherenciaAsfalto(50);
        cd.setCaballosFuerza(500);
        cd.setVelocidadMaxima(450);
        cd.setIdInventario(contador);
        inv.listaInventario.add(cd);
        /**
         * insertar autos estandar
         */
        ce= new CarrosEstandar("toyota",50000,"gris",4,500);
        ce.setConsumoConbustible(19);
        ce.setErgonomia("consumo de ocnbustible bajo y ergonomico");
        ce.setNumeroPasajaeros(6);
        listaCarrosEstandar.add(ce);
        contador+=1;
        ce= new CarrosEstandar("toyota",50000,"gris",4,500);
        ce.setConsumoConbustible(19);
        ce.setErgonomia("consumo de ocnbustible bajo y ergonomico");
        ce.setNumeroPasajaeros(6);
        ce.setIdInventario(contador);
        inv.listaInventario.add(ce);
         /**
         * insercion auto, personalizado
         */
        cp= new CarrosPersonalizado("subaru",140000,"rojo",2,120);
        cp.setAlerones(2);
        cp.setTamañoRuedas(12);
        cp.setNo2("no tiene no2");
        listaCarrosPersonalizado.add(cp);
        contador+=1;
        cp= new CarrosPersonalizado("subaru",140000,"rojo",2,120);
        cp.setAlerones(2);
        cp.setTamañoRuedas(12);
        cp.setNo2("no tiene no2");
        cp.setIdInventario(contador);
        inv.listaInventario.add(cp);
        
        /**
         * insercion de auto tipo maquinaria
         */
        cm= new CarrosMaquinaria("Ford",6000,"negro",16,80);
        cm.setPesoTon(13);
        cm.setHorugas(2);
        cm.setTipoTrabajo("retroescavadora");
        listaCarrosMaquinaria.add(cm);
        contador+=1;
        cm= new CarrosMaquinaria("Ford",6000,"negro",16,80);
        cm.setPesoTon(13);
        cm.setHorugas(2);
        cm.setTipoTrabajo("retroescavadora");
        cm.setIdInventario(contador);
        inv.listaInventario.add(cm);
        /**
         * insertar auto deportivo
         */
        cd= new CarrosDeportivo("maserrati",30000,"amarillo",4,20);
        cd.setAceleracion(34);
        cd.setAdherenciaAsfalto(10);
        cd.setCaballosFuerza(200);
        cd.setVelocidadMaxima(650);
        listaCarrosDeportivos.add(cd);
         contador+=1;
        cd= new CarrosDeportivo("maserrati",30000,"amarillo",4,20);
        cd.setAceleracion(34);
        cd.setAdherenciaAsfalto(10);
        cd.setCaballosFuerza(200);
        cd.setVelocidadMaxima(650);
        cd.setIdInventario(contador);
        inv.listaInventario.add(cd);
        
        /**
         * insertar autos estandar
         */
        ce= new CarrosEstandar("mazda",2000,"gris",4,20);
        ce.setConsumoConbustible(2);
        ce.setErgonomia("solo ergonomico");
        ce.setNumeroPasajaeros(3);
        listaCarrosEstandar.add(ce);
        contador+=1;
        ce= new CarrosEstandar("mazda",2000,"gris",4,20);
        ce.setConsumoConbustible(2);
        ce.setErgonomia("solo ergonomico");
        ce.setNumeroPasajaeros(3);
        ce.setIdInventario(contador);
        inv.listaInventario.add(ce);
        menu();
    }
    
    
    public  void menu(){
            System.out.println ("Bienvenido al meno del Consesionario:");
            System.out.println ("Seleccione una opcion");
            System.out.println ("1.Insertar autos");
            System.out.println ("2.Insertar empleados");
            System.out.println ("3.vender autos");
            System.out.println ("4.vehiculo Mas Caro");
            System.out.println ("5.vehiculo Mas barato ");
            System.out.println ("6.ver inventario ");
            String variableControl = scanner.nextLine();
            int variableSeleccion=Integer.parseInt(variableControl);
            
            if(variableSeleccion==1){
                menuInsertar();
            }else if(variableSeleccion==2){
                
            }else if(variableSeleccion==3){
                
            }else if (variableSeleccion == 4){
                InventarioConsesionario inventarioC = new InventarioConsesionario();
                if(listaCarrosDeportivos != null && listaCarrosEstandar !=null && listaCarrosMaquinaria !=null && listaCarrosPersonalizado !=null){
                    inventarioC.masCaro(listaCarrosDeportivos, listaCarrosEstandar, listaCarrosMaquinaria, listaCarrosPersonalizado);
                }else{
                    System.out.println ("no hay datos de vehiculos inserve uno valido");
                    menu();
                } 
            }else if (variableSeleccion == 5){
                InventarioConsesionario inventarioC = new InventarioConsesionario();
                if(listaCarrosDeportivos != null && listaCarrosEstandar !=null && listaCarrosMaquinaria !=null && listaCarrosPersonalizado !=null){
                    inventarioC.masBarato(listaCarrosDeportivos, listaCarrosEstandar, listaCarrosMaquinaria, listaCarrosPersonalizado);
                }else{
                    System.out.println ("no hay datos de vehiculos inserve uno valido");
                    menu();
                } 
            }else if(variableSeleccion == 6){
                InventarioConsesionario inventarioC = new InventarioConsesionario();
                //inventarioC.listadoInventario(listaCarrosDeportivos, listaCarrosEstandar, listaCarrosMaquinaria, listaCarrosPersonalizado);
                
            }else{
                System.out.println ("Inserte una opcion valida");
                menu();
            }
        }//menu Principal   
        
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
    
    public void capturaDeportivos(){
        //Pedimos los datos de los vehiculos deportivos
        System.out.print("Ingresa La marca del vehiculo: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Ingresa el precio del vehiculo: ");
        String precioVehiculo = scanner.nextLine();
        int pv=Integer.parseInt(precioVehiculo);
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
        insertarDeportivo(marcaVehiculo, pv, colorVehiculo, nr, cv, av, aA, cf, vm);
    }//captura los datos de los autos deportivos
    
    public void insertarDeportivo(String marcaVehiculo,int pv,String colorVehiculo,int nr,int cv, int av,int aA,int cf,int vm){
        cd= new CarrosDeportivo(marcaVehiculo,pv,colorVehiculo,nr,cv);
        cd.setAceleracion(av);
        cd.setAdherenciaAsfalto(aA);
        cd.setCaballosFuerza(cf);
        cd.setVelocidadMaxima(vm);
        listaCarrosDeportivos.add(cd);
        cd= new CarrosDeportivo(marcaVehiculo,pv,colorVehiculo,nr,cv);
        contador+=1;
        cd.setAceleracion(av);
        cd.setAdherenciaAsfalto(aA);
        cd.setCaballosFuerza(cf);
        cd.setVelocidadMaxima(vm);
        cd.setIdInventario(contador);
        inv.listaInventario.add(cd);
        
        menuInsertar();
    }
    
    public void capturarEstandar(){
        //Pedimos los datos de los vehiculos deportivos
        System.out.print("Ingresa La marca del vehiculo: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Ingresa el precio del vehiculo: ");
        String precioVehiculo = scanner.nextLine();
        int pv=Integer.parseInt(precioVehiculo);
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
        insertarEstandar(marcaVehiculo, pv, colorVehiculo, nr, cv, cvc, ergonomia, np);
    }
    
    public void insertarEstandar(String marcaVehiculo,int pv,String colorVehiculo,int nr,int cv, int cvc,String ergonomia,int np){
        ce= new CarrosEstandar(marcaVehiculo,pv,colorVehiculo,nr,cv);
        ce.setConsumoConbustible(cvc);
        ce.setErgonomia(ergonomia);
        ce.setNumeroPasajaeros(np);
        listaCarrosEstandar.add(ce);
        contador+=1;
        ce= new CarrosEstandar(marcaVehiculo,pv,colorVehiculo,nr,cv);
        ce.setConsumoConbustible(cvc);
        ce.setErgonomia(ergonomia);
        ce.setNumeroPasajaeros(np);
        ce.setIdInventario(contador);
        inv.listaInventario.add(ce);
        menuInsertar();
    }
    
    
    public void CapturarMaquinaria(){
        //Pedimos los datos de los vehiculos deportivos
        System.out.print("Ingresa La marca del vehiculo: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Ingresa el precio del vehiculo: ");
        String precioVehiculo = scanner.nextLine();
        int pv=Integer.parseInt(precioVehiculo);
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
        insertarMaquinaria(marcaVehiculo, pv, colorVehiculo, nr, cv, pvton, horu, tipoTrabajo);
    }
    
    public void insertarMaquinaria(String marcaVehiculo,int pv,String colorVehiculo,int nr,int cv, int pvton,int horu,String tipoTrabajo){
        cm= new CarrosMaquinaria(marcaVehiculo,pv,colorVehiculo,nr,cv);
        cm.setPesoTon(pvton);
        cm.setHorugas(horu);
        cm.setTipoTrabajo(tipoTrabajo);
        listaCarrosMaquinaria.add(cm);
        contador+=1;
        cm= new CarrosMaquinaria(marcaVehiculo,pv,colorVehiculo,nr,cv);
        cm.setPesoTon(pvton);
        cm.setHorugas(horu);
        cm.setTipoTrabajo(tipoTrabajo);
        cm.setIdInventario(contador);
        inv.listaInventario.add(cm);
        menuInsertar();
    }
    
    
    public void capturarPersonalizado(){
        //Pedimos los datos de los vehiculos deportivos
        System.out.print("Ingresa La marca del vehiculo: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Ingresa el precio del vehiculo: ");
        String precioVehiculo = scanner.nextLine();
        int pv=Integer.parseInt(precioVehiculo);
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
        insertarPersonalizado(marcaVehiculo, pv, colorVehiculo, nr, cv, av, tr, no2);
    }
    
    public void insertarPersonalizado(String marcaVehiculo,int pv,String colorVehiculo,int nr,int cv, int av,int tr,String no2){
        cp= new CarrosPersonalizado(marcaVehiculo,pv,colorVehiculo,nr,cv);
        cp.setAlerones(av);
        cp.setTamañoRuedas(tr);
        cp.setNo2(no2);
        listaCarrosPersonalizado.add(cp);
        contador+=1;
        cp= new CarrosPersonalizado(marcaVehiculo,pv,colorVehiculo,nr,cv);
        cp.setAlerones(av);
        cp.setTamañoRuedas(tr);
        cp.setNo2(no2);
        cp.setIdInventario(contador);
        inv.listaInventario.add(cp);
        menuInsertar();
    }
    
    
}//clase principal


