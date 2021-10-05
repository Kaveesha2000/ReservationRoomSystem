package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomAvailability {
    public AnchorPane roomAvailability;
    public JFXComboBox roomType1;

    public void initialize(){
        roomType1.getItems().addAll(
                "Single Rooms",
                "Double Rooms",
                "Triple Rooms",
                "Quad Rooms"
        );
        roomType1.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // roomType.setText(newValue);
        });
    }

    public void backToReceptionTasks(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionTasks.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomAvailability.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void bookingRooms(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReserveRoom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomAvailability.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
