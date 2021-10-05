package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionTasksController {
    public AnchorPane receptionTaskContext;

    public void backToHome1(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionTaskContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void moveToReserveRooms(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomAvailability.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionTaskContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void moveToMarkAsMaintainance(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MarkAsMaintainance.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionTaskContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
