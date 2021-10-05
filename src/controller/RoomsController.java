package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomsController {
    public AnchorPane roomContext;
    public TableView customerTbl;
    public TableColumn tblNic;
    public TableColumn tblName;
    public TableColumn tblContact;
    public TableColumn tblAddress;
    public TableColumn tblRoomNo;

    public void backToAdminRoom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminTasks.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToHome3(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void initialize(){
        customerTbl.setItems(FXCollections.observableArrayList(ReserveRoomController.customerList));
        tblRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        tblName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tblNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        tblContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        tblAddress.setCellValueFactory(new PropertyValueFactory<>("address"));

    }
}
