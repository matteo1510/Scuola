package com.mycompany.clickgamejfx;

import java.time.Duration;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

public class PrimaryController {

    private Timeline timeline;
    private double speed = 2.0;
    
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btn1"
    private Button btn1; // Value injected by FXMLLoader

    @FXML // fx:id="lbl1"
    private Label lbl1; // Value injected by FXMLLoader
    
    @FXML // fx:id="lblScore"
    private Label lblScore; // Value injected by FXMLLoader
    
    private int score = 0;
    private Random random = new Random();  
    
    public void initializeTime() {
    timeline = new Timeline(
            new KeyFrame(javafx.util.Duration.seconds(speed), e -> moveButton())
    );
    timeline.setCycleCount(Timeline.INDEFINITE);
    timeline.play();
}
    
    @FXML
    void onClick(ActionEvent event) {
        score++;
        lblScore.setText("Score: "+ score);
        
        if (score % 5 == 0) {
        speed -= 0.3;
        timeline.stop();
        timeline.getKeyFrames().setAll(
                new KeyFrame(javafx.util.Duration.seconds(speed), e -> moveButton())
        );
        timeline.play();
    }
    }
    
    private void moveButton() {
        btn1.setLayoutX(random.nextInt(560));
        btn1.setLayoutY(random.nextInt(360));
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'primary.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'primary.fxml'.";
        assert lblScore != null : "fx:id=\"lblScore\" was not injected: check your FXML file 'primary.fxml'.";
        initializeTime();
    }

}
