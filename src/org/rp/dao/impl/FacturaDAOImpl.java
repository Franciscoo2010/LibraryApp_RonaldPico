/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.dao.impl;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.rp.dao.FacturaDAO;
import org.rp.execption.DaoException;
import org.rp.model.LineaFactura;
import org.rp.util.Conexion;

/**
 * se crea la clase FacturaDaoImpl y imlplementa la interface FacturaDAO
 * @author Ronald Pico
 * @version 1.0.0
 *@see org.rp.dao.impl.FacturaDAOImpl
 */
public class FacturaDAOImpl implements FacturaDAO {

    /**
     * Busca la factura y sus líneas asociadas por número de venta
     * @param noVenta número de venta identificador
     * @return nos regresa la lista de líneas de la factura
     */
    @Override
    public ArrayList<LineaFactura> buscarFactura(int noVenta) {
        ArrayList<LineaFactura> lista = new ArrayList<>();
        String sql = "{call sp_buscar_factura(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                            CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, noVenta);
            try (ResultSet rs = consulta.executeQuery()) {
                while (rs.next()) {
                    LineaFactura linea = new LineaFactura();
                    linea.setNumeroFactura(rs.getInt("numero_factura"));
                    linea.setFechaEmision(rs.getString("fecha_emision"));
                    linea.setCuiCliente(rs.getLong("cui_cliente"));
                    linea.setNombreCliente(rs.getString("nombre_cliente"));
                    linea.setCorreoCliente(rs.getString("correo_cliente"));
                    linea.setIsbnLibro(rs.getString("isbn_libro"));
                    linea.setTituloLibro(rs.getString("titulo_libro"));
                    linea.setCantidad(rs.getInt("cantidad"));
                    linea.setPrecioUnitario(rs.getDouble("precio_unitario"));
                    linea.setSubtotal(rs.getDouble("subtotal"));
                    linea.setUsuarioAtendio(rs.getString("usuario_atendio"));
                    linea.setGranTotal(rs.getDouble("gran_total"));
                    lista.add(linea);
                }
            }
        } catch (SQLException e) {
            throw new DaoException("Error al buscar la factura: " + e.getMessage(), e);
        }
        return lista;
    }
}
        

 