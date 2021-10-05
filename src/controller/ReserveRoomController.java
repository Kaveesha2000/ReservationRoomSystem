package controller;

import com.jfoenix.controls.JFXComboBox;
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
import model.Customer;
import view.tm.CustomerTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class ReserveRoomController {
    public AnchorPane reserveRoomContext;
    public JFXComboBox<String> mealType1;
    public JFXTextField roomNo;
    public JFXTextField name;
    public JFXTextField nic;
    public JFXTextField contact;
    public JFXTextField address;
    public JFXTextField email;
    public TableColumn tblRoomNo;
    public TableColumn tblName;
    public TableColumn tblNic;
    public TableColumn tblContact;
    public TableColumn tblAddress;
    public TableColumn tblEmail;

    public TableView<CustomerTM> tblCustomer;
    public TableColumn tblBtn;
    static ArrayList<Customer> customerList = new ArrayList();


    public void initialize() {

        mealType1.getItems().addAll(
                "Local Meals",
                "Chinese Meals",
                "French Meals"
        );
        mealType1.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
           // mealType.setText(newValue);
        });

        //---------------------------------------
        tblRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        tblName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tblNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        tblContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        tblAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tblEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tblBtn.setCellValueFactory(new PropertyValueFactory<>("btn"));
        //---------------------------------------
        
        tblCustomer.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            loadCustomerData(newValue);
        });

    }

    private void loadCustomerData(CustomerTM newValue) {
        roomNo.setText(newValue.getRoomNo());
        nic.setText(newValue.getNic());
        name.setText(newValue.getName());
        contact.setText(newValue.getContact());
        address.setText(newValue.getAddress());
        email.setText(newValue.getEmail());
    }

    public void backToReceptionTasks(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomAvailability.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) reserveRoomContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void moveToName(ActionEvent actionEvent) {
        name.requestFocus();
    }

    public void moveToNic(ActionEvent actionEvent) {
        nic.requestFocus();
    }

    public void moveToContact(ActionEvent actionEvent) {
        contact.requestFocus();
    }

    public void moveToAddress(ActionEvent actionEvent) {
        address.requestFocus();
    }

    public void moveToEmail(ActionEvent actionEvent) {
        email.requestFocus();
    }

    public void saveCustomer(ActionEvent actionEvent) {
        Customer customer = new Customer(roomNo.getText(),name.getText(),nic.getText(),contact.getText(),address.getText(),email.getText());
        if (customerList.add(customer)){
            loadAllCustomers();
            new Alert(Alert.AlertType.CONFIRMATION,"Saved successfully...", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again...", ButtonType.CLOSE).show();
        }
    }
    private void loadAllCustomers(){

        ObservableList<CustomerTM> tmObservableList = FXCollections.observableArrayList();
        for (Customer temp:customerList
             ) {
            Button btn = new Button("Delete");
            tmObservableList.add(new CustomerTM(temp.getRoomNo(),temp.getName(),temp.getNic(),temp.getContact(),temp.getEmail(),temp.getAddress(),btn));

            btn.setOnAction((e)->{

                ButtonType yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are You Sure You Want To Delete This Customer?",yes,no);
                alert.setTitle("Confirmation Alert");

                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no)==yes){
                    customerList.remove(temp);
                    loadAllCustomers();
                }else{

                }
            });
        }
        tblCustomer.setItems(tmObservableList);
    }

    public void sendEmail(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION,"Email Send successfully...", ButtonType.CLOSE).show();
    }
}
