package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class MainController {

    @FXML
    private Label descriptionLabel;
    @FXML
    private Button startButton;

    @FXML
    private void handleStartButtonAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cs112/lab09/map-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) startButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}