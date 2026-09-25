/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rp.dao;

import java.util.ArrayList;
import org.rp.model.LineaFactura;

/**
 *
 * @author USUARIO
 */
public interface FacturaDAO {

    /**
     *
     * @param noVenta
     * @return
     */
    ArrayList<LineaFactura> buscarFactura(int noVenta);
}
