package com.college.views;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;


public class RoomView extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    //2 ways manual way, or scene builder way. prob use scenebuilder cause everyone else prob has to for proj

    @Override
    public void start(Stage stage) throws Exception {
//        Label label = new Label("Hello, JavaFX!");
//        StackPane root = new StackPane(label);

//        stage.setTitle("Room Booking");
//        Group root = new Group(); // group of nodes


        //scene + icon
//        Scene scene = new Scene(root, Color.BLACK);
//        Image icon = new Image(getClass().getResourceAsStream("/icon.png"));
//        stage.getIcons().add(icon);
//
//        //stage
//        stage.setWidth(800);
//        stage.setHeight(800);



        //run scenebuilder instead
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/MainView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        scene.getStylesheets().add(getClass().getResource("/css/buttonStyle.css").toExternalForm());

        Image icon = new Image(getClass().getResourceAsStream("/icon.png"));
        stage.getIcons().add(icon);

        stage.setScene(scene);
//        stage.setWidth(1000); Ammar res
//        stage.setHeight(600);
        stage.show();


        //run
//        stage.setScene(scene);
//        stage.show();
    }
}
