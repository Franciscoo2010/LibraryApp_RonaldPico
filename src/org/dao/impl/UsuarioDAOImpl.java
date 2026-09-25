/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.rp.dao.UsuarioDAO;
import org.rp.model.Usuario;
import org.rp.util.Conexion;

/**
 *
 * @author USUARIO
 */
public class UsuarioDAOImpl implements UsuarioDAO {
        

    /**
     *
     * @param usernarme
     * @param passwordHash
     * @return
     */
    @Override
    public Usuario iniciarSesion(String usernarme, String passwordHash) {
        Usuario usuario = null;
        String sql = "{call sp_iniciar_sesion(?,?)}";

        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {

            consulta.setString(1, usernarme);
            consulta.setString(2, passwordHash);

            try (ResultSet tablaResultado = consulta.executeQuery()) {
                if (tablaResultado.next()) {
                    usuario = new Usuario();
                    usuario.setId(tablaResultado.getInt(1));
                    usuario.setUsername(tablaResultado.getString(2));
                    usuario.setRol(tablaResultado.getString(3));
                }
            }
        } catch (SQLException e) {
            throw new DaoException("Error al iniciar sesion: " + e.getMessage(), e);
        }

        return usuario;
    }


    /**
     *
     * @param usuario
     * @return
     */
    @Override
    public boolean crearUsuario(Usuario usuario) {
        String sql = "{call sp_crear_usuario(?,?,?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setString(1, usuario.getUsername());
            consulta.setString(2, usuario.getEmail());
            consulta.setString(3, usuario.getFirstName());
            consulta.setString(4, usuario.getLastName());
            consulta.setString(5, usuario.getPasswordHash());
            consulta.setString(6, usuario.getRol());
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al crear usuario: " + e.getMessage(), e);
        }
    }


    /**
     *
     * @param usuario
     * @return
     */
    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        String sql = "{call sp_actualizar_usuario(?,?,?,?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, usuario.getId());
            consulta.setString(2, usuario.getUsername());
            consulta.setString(3, usuario.getEmail());
            consulta.setString(4, usuario.getFirstName());
            consulta.setString(5, usuario.getLastName());
            consulta.setString(6, usuario.getRol());
            consulta.setBoolean(7, usuario.isActivo());
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al actualizar usuario: " + e.getMessage(), e);
        }
    }


    /**
     *
     * @param idUsuario
     * @param passwordHash
     * @return
     */
    @Override
    public boolean cambiarPassword(int idUsuario, String passwordHash) {
        String sql = "{call sp_cambiar_password(?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idUsuario);
            consulta.setString(2, passwordHash);
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al cambiar password: " + e.getMessage(), e);
        }
    }


    /**
     *
     * @param idUsuario
     * @return
     */
    @Override
    public boolean desactivarUsuario(int idUsuario) {
        String sql = "{call sp_desactivar_usuario(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idUsuario);
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al desactivar usuario: " + e.getMessage(), e);
        }
    }


    /**
     *
     * @param idUsuario
     * @return
     */
    @Override
    public boolean eliminarUsuario(int idUsuario) {
        String sql = "{call sp_eliminar_usuario(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idUsuario);
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al eliminar usuario: " + e.getMessage(), e);
        }
    }

   

    /**
     *
     * @return
     */
    @Override
    public ArrayList<Usuario> listarTodosUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();
        String sql = "{call sp_listar_todos_usuarios()}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql);
                ResultSet tablaResultado = consulta.executeQuery()) {
            while (tablaResultado.next()) {
                Usuario u = new Usuario();
                u.setId(tablaResultado.getInt("id_usuario"));
                u.setUsername(tablaResultado.getString("username"));
                u.setEmail(tablaResultado.getString("email"));
                u.setFirstName(tablaResultado.getString("first_name"));
                u.setLastName(tablaResultado.getString("last_name"));
                u.setRol(tablaResultado.getString("rol"));
                u.setActivo(tablaResultado.getBoolean("activo"));
                u.setFechaCreacion(tablaResultado.getTimestamp("fecha_creacion"));
                lista.add(u);
            }
        } catch (SQLException e) {
            throw new DaoException("Error al listar todos los usuarios: " + e.getMessage(), e);
        }
        return lista;
    }


    /**
     *
     * @param idUsuario
     * @return
     */
    @Override
    public Usuario obtenerUsuarioPorId(int idUsuario) {
        Usuario usuario = null;
        String sql = "{call sp_obtener_usuario_por_id(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idUsuario);
            try (ResultSet tablaResultado = consulta.executeQuery()) {
                if (tablaResultado.next()) {
                    usuario = new Usuario();
                    usuario.setId(tablaResultado.getInt("id_usuario"));
                    usuario.setUsername(tablaResultado.getString("username"));
                    usuario.setEmail(tablaResultado.getString("email"));
                    usuario.setFirstName(tablaResultado.getString("first_name"));
                    usuario.setLastName(tablaResultado.getString("last_name"));
                    usuario.setRol(tablaResultado.getString("rol"));
                    usuario.setActivo(tablaResultado.getBoolean("activo"));
                    usuario.setFechaCreacion(tablaResultado.getTimestamp("fecha_creacion"));
                }
            }
        } catch (SQLException e) {
            throw new DaoException("Error al obtener usuario por id: " + e.getMessage(), e);
        }
        return usuario;
    }

}
