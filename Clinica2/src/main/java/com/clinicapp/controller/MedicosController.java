package com.clinica.controller;

import com.clinica.model.Medico;
import com.clinica.utils.DatabaseManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MedicosController {

    @FXML private TableView<Medico> tableMedicos;
    @FXML private TableColumn<Medico, Integer> colId;
    @FXML private TableColumn<Medico, String> colNombre;
    @FXML private TableColumn<Medico, String> colApellido;
    @FXML private TableColumn<Medico, String> colEspecialidad;
    @FXML private TableColumn<Medico, String> colTelefono;

    /**
     * Inicializa la vista de médicos
     */
    @FXML
    public void initialize() {
        // Configurar columnas
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colEspecialidad.setCellValueFactory(new PropertyValueFactory<>("especialidad"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));

        // Cargar datos
        cargarMedicos();
    }

    /**
     * Carga médicos desde la base de datos
     */
    @FXML
    private void cargarMedicos() {
        ObservableList<Medico> medicosList = FXCollections.observableArrayList(
                DatabaseManager.obtenerTodosMedicos()
        );
        tableMedicos.setItems(medicosList);
    }
}