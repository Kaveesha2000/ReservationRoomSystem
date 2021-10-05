package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HomePageController {
    public AnchorPane homePageContext;

    public void moveToAdminLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminLoginPage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }


    public void moveReceptionistLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistLoginPage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
