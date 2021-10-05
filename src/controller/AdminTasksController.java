package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminTasksController {
    public AnchorPane adminTaskContext;

    public void backToHome2(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminTaskContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void goToRooms(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomViewing.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminTaskContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void moveToMealPackage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Meals.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminTaskContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void goToIncomeRoom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReport.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminTaskContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

}
