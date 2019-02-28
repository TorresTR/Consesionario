package com.udec.consesionario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



/**
 * Esta clase es donde estara el inventario de los vehiculos, tambien contiene los metodos de buscar por el mas 
 * caro y el mas barato
 * @author David
 */
public class InventarioConsesionario{
    
    ArrayList listaInventario = new ArrayList<>();
    ArrayList listaMasCaro = new ArrayList<>();
    ArrayList listaMasBarato = new ArrayList<>();
    ClasePrincipal pricipal = new ClasePrincipal();
   /**
    * identificadorInventario indica cual es el seria del carro en el momento
    */
    private int identificadorInventario;

    /**
     * este es el constructo vacio para pocer intaciar los metodos de la clase
     */
    public InventarioConsesionario() {        
    }

    /**
     * Retorna el valor del indenficador del inventario
     * @return identificadorInventario
     */
    public int getIdentificadorInventario() {
        return identificadorInventario;
    }

    /**
     * Permite asignar un id para el inventario 
     * @param identificadorInventario 
     */
    public void setIdentificadorInventario(int identificadorInventario) {
        this.identificadorInventario = identificadorInventario;
    }

    
    
    public void listadoInventario(ArrayList listaDeportivos,ArrayList listaEstandar,ArrayList listaMaquinaria,ArrayList listaPersonalizado){
    
        
        listaInventario.add(listaDeportivos);
        listaInventario.add(listaEstandar);
        listaInventario.add(listaMaquinaria);
        listaInventario.add(listaPersonalizado);
    
        int index = -1;
        int bound = listaInventario.size();
        for (int userInd = 0; userInd < bound; userInd++) {
        if (listaInventario.get(userInd).equals(bound)) {
            index = userInd;
            identificadorInventario=userInd;
            listaInventario.add(index, identificadorInventario);
            break;
            }
        }
    }

    
    /**
     * 
     * @param listaDeportivos
     * @param listaEstandar
     * @param listaMaquinaria
     * @param listaPersonalizado 
     */
    public void masCaro(ArrayList listaDeportivos,ArrayList listaEstandar,ArrayList listaMaquinaria,ArrayList listaPersonalizado){
        hallarDeportivoMayor(listaDeportivos);
        hallarEstandarMayor(listaEstandar);
        hallarMaquinariaMayor(listaMaquinaria);
        hallarPersonalizadoMayor(listaPersonalizado);      
        listadoInventario(listaDeportivos, listaEstandar, listaMaquinaria, listaPersonalizado); 
        Collections.sort(listaMasCaro, new Comparator<CarrosPrincipal>() {
        @Override
        public int compare(CarrosPrincipal p1, CarrosPrincipal p2) {
            int  variableComparadora;
            variableComparadora = new Integer(p2.getPrecio()).compareTo(p1.getPrecio());            
            return variableComparadora;
            }
        });
        for (Object obj : listaMasCaro) {
            CarrosPrincipal carro = (CarrosPrincipal)obj;
            System.out.println("El vechiculo mas caro es:"+""+carro.getMarca()+"\n"
            +"y su precio es:"+carro.getPrecio());
            break;
        }
        pricipal.menu();
    }// mas caro fin
   
    public void hallarDeportivoMayor(ArrayList listaDeportivos ){
        Collections.sort(listaDeportivos, new Comparator<CarrosDeportivo>() {
            @Override
            public int compare(CarrosDeportivo p1, CarrosDeportivo p2) {
              int  variableComparadora;
              variableComparadora = new Integer(p2.getPrecio()).compareTo(p1.getPrecio());
              listaMasCaro.add(p2);
              return variableComparadora;
            }
        });
    }
    
    public void hallarEstandarMayor(ArrayList listaEstandar ){
        Collections.sort(listaEstandar, new Comparator<CarrosEstandar>() {

            @Override
            public int compare(CarrosEstandar p1, CarrosEstandar p2) {
              int  variableComparadora;
              variableComparadora = new Integer(p2.getPrecio()).compareTo(p1.getPrecio());
              listaMasCaro.add(p2);
              return variableComparadora;
            }
        });
    }
    public void hallarMaquinariaMayor(ArrayList listaMaquinaria ){
        Collections.sort(listaMaquinaria, new Comparator<CarrosMaquinaria>() {

            @Override
            public int compare(CarrosMaquinaria p1, CarrosMaquinaria p2) {
              int  variableComparadora;
              variableComparadora = new Integer(p2.getPrecio()).compareTo(p1.getPrecio());
              listaMasCaro.add(p2);
              return variableComparadora;
            }
        });   
    }
    
    public void hallarPersonalizadoMayor(ArrayList listaPersonalizado ){
        Collections.sort(listaPersonalizado, new Comparator<CarrosPersonalizado>() {

            @Override
            public int compare(CarrosPersonalizado p1, CarrosPersonalizado p2) {
              int  variableComparadora;
              variableComparadora = new Integer(p2.getPrecio()).compareTo(p1.getPrecio());
              listaMasCaro.add(p2);
              return variableComparadora;
            }
        });   
    }
    
}
