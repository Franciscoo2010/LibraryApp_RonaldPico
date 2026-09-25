/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.rp.dao.ClienteDAO;
import org.rp.execption.DaoException;
import org.rp.model.Cliente;
import org.rp.util.Conexion;

/**
 * se crea la clase ClienteDaoImpl y imlplementa la interface ClienteDAO
 * @author Ronald Pico
 * @version 1.0.0
 *@see org.rp.dao.impl.ClienteDAOImpl
 */
public class ClienteDAOImpl implements ClienteDAO {
    
    /**
     *nos devuelve la lista 
     * @return nos regresa la lista con tos lo clientes 
     */
    @Override
    public ArrayList<Cliente> listarTodos() {
    ArrayList<Cliente> lista = new ArrayList<> ();
    String sql = "{call sp_listarlientes()}" ;
        try (Connection conexion = Conexion.getInstancia().conectar(); CallableStatement consulta = conexion.prepareCall(sql); ResultSet rs = consulta.executeQuery()) {
            while (rs.next())  {
                 Cliente c = new Cliente();
                 c.setCui(rs.getLong("cui"));
                 c.setNombreCliente(rs.getString("nombre_cliente"));
                 c.setCorreoElectronico(rs.getString("correo_electronico"));
                lista.add(c);
    }
        } catch (SQLException e) {
            throw new DaoException("Error al listar clientes: " + e.getMessage(), e);
        }  
        return lista;
        }
        
    /**
     *Busqueda por id 
     * @param cui identificador unico
     * @return nos regresa el cliente
     */
    @Override
    public Cliente buscarPorId(Long cui) {
        Cliente c = null;
        String sql = "{call sp_buscarcliente(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar(); CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setLong(1, cui);
            try (ResultSet rs = consulta.executeQuery()) {
                if (rs.next()) {
                    c = new Cliente();
                    c.setCui(rs.getLong("cui"));
                    c.setNombreCliente(rs.getString("nombre_cliente"));
                    c.setApellidoCliente(rs.getString("apellido_cliente"));
                    c.setCorreoElectronico(rs.getString("correo_electronico"));
                }
            }
        } catch (SQLException e) {
            throw new DaoException("Error al buscar cliente: " + e.getMessage(), e);
        }
        return c;
    }
    
    /**
     * Crea un cliente 
     * @param cliente persona que compra el libro 
     * @return nos devuelve el nuevo cliente 
     */
    @Override
    public boolean crear(Cliente cliente) {
        String sql = "{call sp_insertarcliente(?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar(); CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setLong(1, cliente.getCui());
            consulta.setString(2, cliente.getNombreCliente());
            consulta.setString(3, cliente.getApellidoCliente());
            consulta.setString(4, cliente.getCorreoElectronico());
            return consulta.executeUpdate() > 0;
        }    catch (SQLException e) {
            throw new DaoException("Error al insertar cliente: " + e.getMessage(), e);
        }
    }
      
    /**
     *Actualiza el cliente 
     * @param cliente persona que compra el libro 
     * @return nos devuelve la actualizacion del cliente ingresado 
     */
    @Override
    public boolean actualizar(Cliente cliente) {
        String sql = "{call sp_actualizarcliente(?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setLong(1, cliente.getCui());
            consulta.setString(2, cliente.getNombreCliente());
            consulta.setString(3, cliente.getApellidoCliente());
            consulta.setString(4, cliente.getCorreoElectronico());
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al actualizar cliente: " + e.getMessage(), e);
        }
    }
    
    /**
     *Elimina un cliente de la lista 
     * @param cui identificador unico de cliente 
     * @return la lista sin el cliente eliminado 
     */
    @Override
    public boolean eliminar(Long cui) {
        String sql = "{call sp_eliminarcliente(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar(); CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setLong(1, cui);
    return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al eliminar cliente: " + e.getMessage(), e);
        }
    }    
    
}

