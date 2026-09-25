/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rp.dao;

import java.util.ArrayList;
import org.rp.model.LineaFactura;

/**
 * se crea la clase factura 
 * @author Ronald Pico
 */
public interface FacturaDAO {

    /**
     *
     * @param noVenta numero de vantas 
     * @return nos devuelve el nunmero de venta
     *
     */
    ArrayList<LineaFactura> buscarFactura(int noVenta);
}
