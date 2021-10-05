package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionistLoginPageController {
    public AnchorPane receptionPageContext;
    public Label receptionLabel;
    public JFXTextField txtName;
    public JFXPasswordField txtPassword;

    public void backToHome1(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionPageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void moveToReceptionHome(ActionEvent actionEvent) throws IOException {

            if (txtPassword.getText().equals("4567") & txtName.getText().equalsIgnoreCase("Receptionist")) {
                URL resource = getClass().getResource("../view/ReceptionTasks.fxml");
                Parent load = FXMLLoader.load(resource);
                Stage window = (Stage) receptionPageContext.getScene().getWindow();
                window.setScene(new Scene(load));
            } else {
                receptionLabel.setText("Enter correct username or password");
            }
    }

    public void moveToPw(ActionEvent actionEvent) {
        txtPassword.requestFocus();
    }
}

