package com.clinica.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML private Button btnClientes;
    @FXML private Button btnCitas;
    @FXML private Button btnMedicos;

    /**
     * Navegación a página de Clientes
     */
    @FXML
    private void mostrarClientes(ActionEvent event) {
        cargarVista("/fxml/Clientes.fxml", event);
    }

    /**
     * Navegación a página de Citas (No funcional)
     */
    @FXML
    private void mostrarCitas(ActionEvent event) {
        cargarVista("/fxml/Citas.fxml", event);
    }

    /**
     * Navegación a página de Médicos
     */
    @FXML
    private void mostrarMedicos(ActionEvent event) {
        cargarVista("/fxml/Medicos.fxml", event);
    }

    /**
     * Método genérico para cargar vistas
     */
    private void cargarVista(String fxmlPath, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root, 1000, 700);
            scene.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());
            stage.setScene(scene);

        } catch (IOException e) {
            System.err.println("Error cargando vista: " + e.getMessage());
        }
    }
}