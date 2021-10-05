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

public class AdminLoginPageController {
    public AnchorPane adminContext;
    public JFXTextField adminName;
    public JFXPasswordField adminPassword;
    public Label adminLabel;

    public void backToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void logInToAdminForm(ActionEvent actionEvent) throws IOException {

            if(adminPassword.getText().equals("1234") & adminName.getText().equalsIgnoreCase("Admin")){
                URL resource = getClass().getResource("../view/AdminTasks.fxml");
                Parent load = FXMLLoader.load(resource);
                Stage window = (Stage) adminContext.getScene().getWindow();
                window.setScene(new Scene(load));
            }
        else{
            adminLabel.setText("Enter correct username or password");
       }
    }

    public void moveToPassword(ActionEvent actionEvent) {
        adminPassword.requestFocus();
    }
}
