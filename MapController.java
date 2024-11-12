package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class MapController {

    @FXML
    private Button bisbeeAzButton;

    @FXML
    private void showBisbeeEvent() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cs112/lab09/event-view.fxml"));
            Parent root = loader.load();
            EventController eventController = loader.getController();
            eventController.initData("Bisbee, Arizona", new RevisedHistoricalEvent("Bisbee Event", "Some Date", "Details", "Involved Parties"));
            
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}