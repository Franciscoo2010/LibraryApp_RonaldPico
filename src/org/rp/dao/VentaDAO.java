/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rp.dao;

import java.util.List;
import org.rp.model.LineaVenta;
import org.rp.model.Venta;

/**
 *
 * @author USUARIO
 */
public interface VentaDAO extends Crud<Venta, Integer>{
  
    /**
     *
     * @param venta
     * @param lineas
     * @return
     */
    int crearVenta(Venta venta, List<LineaVenta> lineas);
}
