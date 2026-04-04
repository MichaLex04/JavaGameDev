package com.clinica.utils;

import com.clinica.model.Cliente;
import com.clinica.model.ConexionDB;
import com.clinica.model.Medico;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    /**
     * Obtiene todos los clientes de la base de datos
     */
    public static List<Cliente> obtenerTodosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes ORDER BY apellido, nombre";

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("telefono"),
                        rs.getString("email"),
                        rs.getString("fecha_nacimiento")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo clientes: " + e.getMessage());
        }
        return clientes;
    }

    /**
     * Obtiene todos los médicos de la base de datos
     */
    public static List<Medico> obtenerTodosMedicos() {
        List<Medico> medicos = new ArrayList<>();
        String query = "SELECT * FROM medicos ORDER BY apellido, nombre";

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Medico medico = new Medico(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("especialidad"),
                        rs.getString("telefono")
                );
                medicos.add(medico);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo médicos: " + e.getMessage());
        }
        return medicos;
    }
}