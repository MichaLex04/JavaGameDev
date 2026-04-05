package com.clinicapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CitasController {

    @FXML private VBox vboxContenido;
    @FXML private Label lblMensaje;

    @FXML
    public void initialize() {
        //No funcional :v
        lblMensaje.setText("📅 Gestión de Citas\n\n⚠️ FUNCIONALIDAD EN DESARROLLO\n\n" +
                "Próximamente podrás:\n" +
                "• Crear nuevas citas\n" +
                "• Ver citas programadas\n" +
                "• Cancelar citas\n" +
                "• Generar reportes");
    }
}