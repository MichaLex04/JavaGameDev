package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Ventana {
    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Label resultado;

    public double[] leernumeros(){
        Double a = Double.parseDouble((num1.getText()));
        Double b = Double.parseDouble((num1.getText()));
        return new double[]{a,b};
    }

    public void mostrar(double valor){
        resultado.setText("resultado: " + valor);
    }

    public void sumar(){
        double[] n = leernumeros();
        mostrar(n[0] + n[1]);
    }

    public void restar(){
        double[] n = leernumeros();
        mostrar(n[0] - n[1]);
    }

    public void multiplicar(){
        double[] n = leernumeros();
        mostrar(n[0] * n[1]);
    }

    public void dividir(){
        double[] n = leernumeros();
        mostrar(n[0] / n[1]);
    }
}
