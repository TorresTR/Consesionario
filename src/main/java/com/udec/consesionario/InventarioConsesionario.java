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
    /**
     * Se declaran las listas de que se van usar, para manejo del inventario,
     * y que seran usadas para guardar los datos del mas caro mas bararo 
     * y las lista unificada del los autos en lista inventario
     */
    ArrayList listaInventario = new ArrayList<>();
    ArrayList listaMasCaro = new ArrayList<>();
    ArrayList listaMasBarato = new ArrayList<>();
    ClasePrincipal pricipal = new ClasePrincipal();

    /**
     * este es el constructo vacio para pocer intaciar los metodos de la clase
     */
    public InventarioConsesionario() {        
    }


    
    /**
     * Este metodo recibe 4 Arraylist los cuales contiene  los datos de los autos, se envian a los metodos de hallar 
     * para que las listas sean organizadas de mayo a menor y son guardados en lista mas caro, luego de lista mas caro usando 
     * compare comparamos y obtenemos el meyor de todos ellos
     * @param listaDeportivos = lista que contiene los datos de los vehiculos deportivos
     * @param listaEstandar = lista que contiene los datos de los vehiculos estandar
     * @param listaMaquinaria = lista que contiene de datos de la mquinaria
     * @param listaPersonalizado = lista que contiene los datos de los vehiculos personalizados
     */
    public void masCaro(ArrayList listaDeportivos,ArrayList listaEstandar,ArrayList listaMaquinaria,ArrayList listaPersonalizado){
        hallarDeportivoMayor(listaDeportivos);
        hallarEstandarMayor(listaEstandar);
        hallarMaquinariaMayor(listaMaquinaria);
        hallarPersonalizadoMayor(listaPersonalizado);       
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
        pricipal.autosPordefecto();
    }// mas caro fin
   
    
    /**
     * Recibe las 4 listas  para enviarlas y que sean ordenadas de menor a mayor para luiego ser guardadas en la lista de mas baratos
     * y calcular cual es el auto mas barato de todos
     * @param listaDeportivos
     * @param listaEstandar
     * @param listaMaquinaria
     * @param listaPersonalizado 
     */
    public void masBarato(ArrayList listaDeportivos,ArrayList listaEstandar,ArrayList listaMaquinaria,ArrayList listaPersonalizado){
        hallarDeportivoMenor(listaDeportivos);
        hallarEstandarMenor(listaEstandar);
        hallarMaquinariaMenor(listaMaquinaria);
        hallarPersonalizadoMenor(listaPersonalizado);       
        Collections.sort(listaMasBarato, new Comparator<CarrosPrincipal>() {
        @Override
        public int compare(CarrosPrincipal p1, CarrosPrincipal p2) {
            int  variableComparadora;
            variableComparadora = new Integer(p1.getPrecio()).compareTo(p2.getPrecio());            
            return variableComparadora;
            }
        });
        for (Object obj : listaMasBarato) {
            CarrosPrincipal carro = (CarrosPrincipal)obj;
            System.out.println("El vechiculo mas Barato es:"+""+carro.getMarca()+"\n"
            +"y su precio es:"+carro.getPrecio());
            break;
        }
        pricipal.autosPordefecto();
    }// mas caro fin
    
    
    
    /**
     * Recibe un arraylist de listaDeportivos el cual se encargara de organizar de mayor a menor y almacenara el vehiculo
     * el cual tenga el mayor precrio en dicha lista
     * @param listaDeportivos
     */
    public void hallarDeportivoMayor(ArrayList listaDeportivos){
  
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
    
    /**
     * Halla el autodeportivo de menor valor
     * @param listaDeportivos 
     */
    public void hallarDeportivoMenor(ArrayList listaDeportivos){
       
            Collections.sort(listaDeportivos, new Comparator<CarrosDeportivo>() {
            @Override
             public int compare(CarrosDeportivo p1, CarrosDeportivo p2) {
              int  variableComparadora;
              variableComparadora = new Integer(p1.getPrecio()).compareTo(p2.getPrecio());
              listaMasBarato.add(p1);
              return variableComparadora;
                }
            });
    }    
    
    
    /**
     * Recibe un arraylist de listaEstandar el cual se encargara de organizar de mayor a menor y almacenara el vehiculo
     * el cual tenga el mayor precrio en dicha lista
     * @param listaEstandar 
     */
    public void hallarEstandarMayor(ArrayList listaEstandar){
       
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
    
    /**
     * Hallar el auto estandar de menor valor 
     * @param listaEstandar 
     */
    public void hallarEstandarMenor(ArrayList listaEstandar){
       
            Collections.sort(listaEstandar, new Comparator<CarrosEstandar>() {
            @Override
            public int compare(CarrosEstandar p1, CarrosEstandar p2) {
              int  variableComparadora;
              variableComparadora = new Integer(p1.getPrecio()).compareTo(p2.getPrecio());
              listaMasBarato.add(p1);
              return variableComparadora;
            }
        });         
    }
    
    /**
     * Recibe un arraylist de listaMaquinaria el cual se encargara de organizar de mayor a menor y almacenara el vehiculo
     * el cual tenga el mayor precrio en dicha lista
     * @param listaMaquinaria 
     */
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
    
    /**
     * Recibe un ArrayList y retorna el de menor valor en la lista de maquinaria
     * 
     * @param listaMaquinaria 
     */
    public void hallarMaquinariaMenor(ArrayList listaMaquinaria ){
 
            Collections.sort(listaMaquinaria, new Comparator<CarrosMaquinaria>() {
            @Override
            public int compare(CarrosMaquinaria p1, CarrosMaquinaria p2) {
              int  variableComparadora;
              variableComparadora = new Integer(p1.getPrecio()).compareTo(p2.getPrecio());
              listaMasBarato.add(p1);
              return variableComparadora;
            }
        });              
    }
    
    /**
     * Recibe un arraylist de listaPersonalizado el cual se encargara de organizar de mayor a menor y almacenara el vehiculo
     * el cual tenga el mayor precrio en dicha lista
     * @param listaPersonalizado 
     */
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
    
    /**
     * Recibe un arraylist y retorna el de menor valor en la lista de autos personalizados
     * @param listaPersonalizado 
     */
    public void hallarPersonalizadoMenor(ArrayList listaPersonalizado ){
        
            Collections.sort(listaPersonalizado, new Comparator<CarrosPersonalizado>() {
            @Override
            public int compare(CarrosPersonalizado p1, CarrosPersonalizado p2) {
              int  variableComparadora;
              variableComparadora = new Integer(p1.getPrecio()).compareTo(p2.getPrecio());
              listaMasBarato.add(p1);
              return variableComparadora;
            }
        });   
    }
    
}
