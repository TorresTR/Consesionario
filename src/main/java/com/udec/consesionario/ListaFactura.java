/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.consesionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class ListaFactura {
    
    List<Factura> LfacturaFinal = new ArrayList<Factura>();

    public ListaFactura() {
    }

    public List<Factura> getLfacturaFinal() {
        return LfacturaFinal;
    }

    public void setLfacturaFinal(List<Factura> LfacturaFinal) {
        this.LfacturaFinal = LfacturaFinal;
    }
    
}
