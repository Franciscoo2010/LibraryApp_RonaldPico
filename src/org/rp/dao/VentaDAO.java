/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rp.dao;

import java.util.List;
import org.rp.model.LineaVenta;
import org.rp.model.Venta;

/**
 * se crea la clase Venta con una extencion de crud 
 * @author Ronald Pico
 */
public interface VentaDAO extends Crud<Venta, Integer>{
  
    /**
     *
     * @param venta numero de producto vendido
     * @param lineas 
     * @return
     */
    int crearVenta(Venta venta, List<LineaVenta> lineas);
}
