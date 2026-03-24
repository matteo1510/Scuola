package com.mycompany.sparatutto;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ShooterGame {

    @FXML private AnchorPane root;
    @FXML private Rectangle player;
    @FXML private ProgressBar healthBar;
    @FXML private Text scoreText;

    private boolean up, down, left, right;
    private double mouseX, mouseY;

    private int score = 0;
    private double health = 1.0;

    private ArrayList<Circle> bullets = new ArrayList<>();
    private ArrayList<Rectangle> enemies = new ArrayList<>();

    private Random rand = new Random();

    @FXML
    public void initialize() {
        root.setFocusTraversable(true);
        root.requestFocus();

        root.setOnKeyPressed(this::keyPressed);
        root.setOnKeyReleased(this::keyReleased);
        root.setOnMouseMoved(this::mouseMoved);
        root.setOnMouseClicked(this::shoot);

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        }.start();
    }

    private void keyPressed(KeyEvent e) {
        switch (e.getCode()) {
            case W: up = true; break;
            case S: down = true; break;
            case A: left = true; break;
            case D: right = true; break;
        }
    }

    private void keyReleased(KeyEvent e) {
        switch (e.getCode()) {
            case W: up = false; break;
            case S: down = false; break;
            case A: left = false; break;
            case D: right = false; break;
        }
    }

    private void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    private void shoot(MouseEvent e) {
        Circle bullet = new Circle(5, Color.YELLOW);
        bullet.setLayoutX(player.getLayoutX() + 20);
        bullet.setLayoutY(player.getLayoutY() + 20);

        double dx = mouseX - bullet.getLayoutX();
        double dy = mouseY - bullet.getLayoutY();
        double len = Math.sqrt(dx*dx + dy*dy);

        bullet.setUserData(new double[]{dx/len*10, dy/len*10});

        bullets.add(bullet);
        root.getChildren().add(bullet);
    }

    private void update() {
        if (up) player.setLayoutY(player.getLayoutY() - 4);
        if (down) player.setLayoutY(player.getLayoutY() + 4);
        if (left) player.setLayoutX(player.getLayoutX() - 4);
        if (right) player.setLayoutX(player.getLayoutX() + 4);

        if (rand.nextInt(100) < 2) spawnEnemy();

        moveBullets();
        moveEnemies();
        checkCollisions();
    }

    private void spawnEnemy() {
        Rectangle enemy = new Rectangle(40, 40, Color.RED);
        enemy.setLayoutX(rand.nextInt(860));
        enemy.setLayoutY(rand.nextInt(560));
        enemies.add(enemy);
        root.getChildren().add(enemy);
    }

    private void moveBullets() {
        Iterator<Circle> it = bullets.iterator();
        while (it.hasNext()) {
            Circle b = it.next();
            double[] v = (double[]) b.getUserData();
            b.setLayoutX(b.getLayoutX() + v[0]);
            b.setLayoutY(b.getLayoutY() + v[1]);

            if (b.getLayoutX() < 0 || b.getLayoutX() > 900 || b.getLayoutY() < 0 || b.getLayoutY() > 600) {
                root.getChildren().remove(b);
                it.remove();
            }
        }
    }

    private void moveEnemies() {
        for (Rectangle e : enemies) {
            double dx = player.getLayoutX() - e.getLayoutX();
            double dy = player.getLayoutY() - e.getLayoutY();
            double len = Math.sqrt(dx*dx + dy*dy);
            e.setLayoutX(e.getLayoutX() + dx/len * 1.5);
            e.setLayoutY(e.getLayoutY() + dy/len * 1.5);
        }
    }

    private void checkCollisions() {
        Iterator<Rectangle> eit = enemies.iterator();
        while (eit.hasNext()) {
            Rectangle e = eit.next();

            if (e.getBoundsInParent().intersects(player.getBoundsInParent())) {
                health -= 0.01;
                healthBar.setProgress(health);
                if (health <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            }

            Iterator<Circle> bit = bullets.iterator();
            while (bit.hasNext()) {
                Circle b = bit.next();
                if (b.getBoundsInParent().intersects(e.getBoundsInParent())) {
                    root.getChildren().removeAll(b, e);
                    bit.remove();
                    eit.remove();
                    score++;
                    scoreText.setText("Score: " + score);
                    break;
                }
            }
        }
    }
}
