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
import org.rp.model.Categoria;
import org.rp.util.Conexion;

/**
 *
 * @author informatica
 */
public class CategoriaDAOImpl {
      @Override
    public ArrayList<Categoria> listarTodos() {
    ArrayList<Categoria> lista = new ArrayList<>();
    String sql = "{call sp_listarcategorias()}";
        try (Connection conexion = Conexion.getInstancia().conectar();
            CallableStatement consulta = conexion.prepareCall(sql);
            ResultSet rs = consulta.executeQuery()) {
            while (rs.next())  {
            Categoria c = new Categoria();
            c.setIdCategoria(rs.getInt("id_categoria"));
            c.setNombreCategoria(rs.getString("nombre_categoria"));
                lista.add(c);
            
            }
        } catch (SQLException e) {
          throw new DaoException("Error al listar categorias: " + e.getMessage(), e);
        }
        return lista;
    }

    @Override
    public Categoria buscarPorId(Integer idCategoria) {
        Categoria c = null;
        String sql = "{call sp_buscarcategoria(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
            CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idCategoria);
            try (ResultSet rs = consulta.executeQuery()) {
                if (rs.next()) {
                    c = new Categoria();
                    c.setIdCategoria(rs.getInt("id_categoria"));
                    c.setNombreCategoria(rs.getString("nombre_categoria"));
                }
            }
        } catch (SQLException e) {
          throw new DaoException("Error al buscar categoria: " + e.getMessage(), e);
        }
        return c;
    }

    @Override
    public boolean crear(Categoria categoria) {
        String sql = "{call sp_insertarcategoria(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setString(1, categoria.getNombreCategoria());
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
          throw new DaoException("Error al insertar categoria: " + e.getMessage(), e);
        }
    }

    @Override
    public boolean actualizar(Categoria categoria) {
        String sql = "{call sp_actualizarcategoria(?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, categoria.getIdCategoria());
            consulta.setString(2, categoria.getNombreCategoria());
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
          throw new DaoException("Error al actualizar categoria: " + e.getMessage(), e);
        }
    }

    @Override
    public boolean eliminar(Integer idCategoria) {
        String sql = "{call sp_eliminarcategoria (?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
            CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idCategoria);
        return consulta.executeUpdate() > 0;
            } catch (SQLException e) {
            throw new DaoException("Error al eliminar categoria: " + e.getMessage(), e);
        }
        
    }
}


