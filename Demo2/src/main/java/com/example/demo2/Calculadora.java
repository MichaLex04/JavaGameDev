package com.example.demo2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculadora extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label numero1 = new Label("Numero 1");
        TextField campotexto1 = new TextField();
        Label numero2 = new Label("Numero 2");
        TextField campotexto2 = new TextField();

        Button botonsumar = new Button("Sumar");
        Button botonrestar = new Button("Restar");
        Button botonmultiplicar = new Button("Multiplicar");
        Button botondividir = new Button("Dividir");

        Label respuesta = new Label("Ingrese Operación");
        botonsumar.setOnAction(e->{
            try {
                double variable1 = Double.parseDouble(campotexto1.getText());
                double variable2 = Double.parseDouble(campotexto1.getText());
                respuesta.setText("La Suma es: " + (variable1 + variable2));
            }catch (NumberFormatException ex){
                respuesta.setText("Error: Ingresa Numeros Validos");
            }
        });

        botonrestar.setOnAction(e->{
            try {
                double variable1 = Double.parseDouble(campotexto1.getText());
                double variable2 = Double.parseDouble(campotexto1.getText());
                respuesta.setText("La Resta es: " + (variable1 - variable2));
            }catch (NumberFormatException ex){
                respuesta.setText("Error: Ingresa Numeros Validos");
            }
        });

        botonmultiplicar.setOnAction(e->{
            try {
                double variable1 = Double.parseDouble(campotexto1.getText());
                double variable2 = Double.parseDouble(campotexto1.getText());
                respuesta.setText("La Multiplicación es: " + (variable1 * variable2));
            }catch (NumberFormatException ex){
                respuesta.setText("Error: Ingresa Numeros Validos");
            }
        });

        botondividir.setOnAction(e->{
            try {
                double variable1 = Double.parseDouble(campotexto1.getText());
                double variable2 = Double.parseDouble(campotexto1.getText());
                respuesta.setText("La Division es: " + (variable1 / variable2));
            }catch (NumberFormatException ex){
                respuesta.setText("Error: Ingresa Numeros Validos");
            }
        });

        VBox caja = new VBox(15);

        HBox fila1 = new HBox(10);
        fila1.getChildren().addAll(campotexto1, numero1);
        HBox fila2 = new HBox(10);
        fila2.getChildren().addAll(campotexto2, numero2);
        HBox fila3 = new HBox(10);
        fila3.getChildren().addAll(botonsumar, botonrestar, botonmultiplicar, botondividir);
        HBox fila4 = new HBox(10);
        fila4.getChildren().addAll(respuesta);

        caja.getChildren().addAll(fila1, fila2, fila3, fila4);
        caja.setPadding(new Insets(25));

        Scene scene = new Scene(caja, 500, 300);


//        scene.getStylesheets().add(
//                getClass().getResource("styles.css").toExternalForm()
//        );
//
//        campotexto1.getStyleClass().add("campo");
//        campotexto2.getStyleClass().add("campo");
//        numero1.getStyleClass().add("numero");
//        numero2.getStyleClass().add("numero");
//        botonsumar.getStyleClass().add("botones");
//        botonrestar.getStyleClass().add("botones");
//        botonmultiplicar.getStyleClass().add("botones");
//        botondividir.getStyleClass().add("botones");

        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }
}