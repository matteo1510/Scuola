package com.mycompany.clickgamejfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import javafx.scene.image.Image;

public class App extends Application {

    private static Scene scene;

        public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
        
         stage.getIcons().add(new Image(App.class.getResourceAsStream("logo.png")));

        Scene scene = new Scene(loader.load());
        stage.setTitle("Click Game");
        stage.setResizable(false);
        stage.setScene(scene);
        
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}