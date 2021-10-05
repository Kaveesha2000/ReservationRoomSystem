package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Room;
import view.tm.RoomTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class RoomViewingController {
    public AnchorPane roomViewingContext;
    public JFXTextField roomNo;
    public JFXTextField roomType;
    public TableColumn colRoomNo;
    public TableColumn colRoomType;
    public TableView<RoomTM> tblRoomViewing;

    static ArrayList<Room> roomList = new ArrayList();
    public TableColumn colDelete;

    public void initialize() {

        colRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn1"));
    }

    public void viewRoomDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Rooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomViewingContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void addRooms(ActionEvent actionEvent) {
        Room room = new Room(roomNo.getText(),roomType.getText());
        if (roomList.add(room)){
            loadAllRooms();
            new Alert(Alert.AlertType.CONFIRMATION,"Saved successfully...", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again...", ButtonType.CLOSE).show();
        }
    }
    private void loadAllRooms(){
        ObservableList<RoomTM> tmObservableList = FXCollections.observableArrayList();
        for (Room temp:roomList) {
            Button btn1 = new Button("Delete");
            tmObservableList.add(new RoomTM(temp.getRoomNo(),temp.getRoomType(),btn1));

            btn1.setOnAction((e)->{

                ButtonType yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are You Sure You Want To Delete This Customer?",yes,no);
                alert.setTitle("Confirmation Alert");

                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no)==yes){
                    roomList.remove(temp);
                    loadAllRooms();
                }else{

                }
            });
        }
        tblRoomViewing.setItems(tmObservableList);
    }

    public void moveToRoomType(ActionEvent actionEvent) {
        roomType.requestFocus();
    }

    public void backToAdminTasks(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminTasks.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomViewingContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
