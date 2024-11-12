package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class EventController {

    @FXML
    private Label titleLabel, dateLabel, detailsLabel, partiesLabel;
    @FXML
    private Button closeButton;

    public void initData(String location, RevisedHistoricalEvent event) {
        titleLabel.setText(event.getTitle());
        dateLabel.setText(event.getDate());
        detailsLabel.setText(event.getDetails());
        partiesLabel.setText(event.getParties());
    }

    @FXML
    private void handleCloseButtonAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}

class RevisedHistoricalEvent {
    private String title, date, details, parties;

    public RevisedHistoricalEvent(String title, String date, String details, String parties) {
        this.title = title;
        this.date = date;
        this.details = details;
        this.parties = parties;
    }

    // Getters for all fields
    public String getTitle() { return title; }
    public String getDate() { return date; }
    public String getDetails() { return details; }
    public String getParties() { return parties; }
}