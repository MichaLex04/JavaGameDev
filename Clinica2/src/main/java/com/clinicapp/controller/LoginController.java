package com.clinicapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtPassword;
    @FXML private Label lblMensaje;

    //Credenciales de prueba: admin / 1234
    @FXML
    private void handleLogin(ActionEvent event) {
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();

        if ("admin".equals(usuario) && "1234".equals(password)) {
            mostrarMainView(event);
        } else {
            lblMensaje.setText("❌ Usuario o contraseña incorrectos");
            lblMensaje.setVisible(true);
        }
    }

    private void mostrarMainView(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root, 1000, 700);
            scene.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());
            stage.setScene(scene);
            stage.setTitle("Sistema de Gestión Clínica - Dashboard");
            stage.setResizable(true);

        } catch (IOException e) {
            System.err.println("Error cargando Main.fxml: " + e.getMessage());
        }
    }
}