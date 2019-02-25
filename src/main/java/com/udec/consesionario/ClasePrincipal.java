package com.udec.consesionario;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ClasePrincipal {
        public static void main (String [ ] args) {

        System.out.println ("Bienvenido al meno del Consesionario:");
        System.out.println ("Seleccione una opcion");
    } //Cierre del main
        
        
    public void insertarDeportivos(){
        //Inicializamos el escáner
        Scanner scanner = new Scanner(System.in);
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
        CarrosDeportivos cd;
        cd= new CarrosDeportivos(marcaVehiculo,pv,colorVehiculo,nr,cv);
        cd.setAceleracion(av);
        cd.setAdherenciaAsfalto(aA);
        cd.setCaballosFuerza(cf);
        cd.setVelocidadMaxima(vm);
        cd.listaVehiculos.add(cd);
    }
    
    public void insertarEstandar(){
        //Inicializamos el escáner
        Scanner scanner = new Scanner(System.in);
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
        CarrosEstandar ce;
        ce= new CarrosEstandar(marcaVehiculo,pv,colorVehiculo,nr,cv);
        ce.setConsumoConbustible(cvc);
        ce.setErgonomia(ergonomia);
        ce.setNumeroPasajaeros(np);
        ce.listaVehiculos.add(ce);
    }
    
    public void insertarMaquinaria(){
        //Inicializamos el escáner
        Scanner scanner = new Scanner(System.in);
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
        CarrosMaquinaria cm;
        cm= new CarrosMaquinaria(marcaVehiculo,pv,colorVehiculo,nr,cv);
        cm.setPesoTon(pvton);
        cm.setHorugas(horu);
        cm.setTipoTrabajo(tipoTrabajo);
        cm.listaVehiculos.add(cm);
    }
    
    public void insertarPersonalizado(){
        //Inicializamos el escáner
        Scanner scanner = new Scanner(System.in);
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
        CarrosPersonalizados cp;
        cp= new CarrosPersonalizados(marcaVehiculo,pv,colorVehiculo,nr,cv);
        cp.setAlerones(av);
        cp.setTamañoRuedas(tr);
        cp.setNo2(no2);
        cp.listaVehiculos.add(cp);
    }
    
    
    
    
}//clase principal


