package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(getClass().getResource("/com/example/demo2/ventana.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana.fxml"));
        Scene scene = new Scene(loader.load(), 320, 240);
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}