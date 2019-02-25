package com.udec.consesionario;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ClasePrincipal {
        public static void main (String [ ] args) {

        
        System.out.println ("Empezamos el programa");

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
    
        
    } //Cierre del main
}
