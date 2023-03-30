package controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MaintenanceAdminController {
    public TextField txtName;
    public ComboBox cmbRoomAvailable;
    public ToggleGroup Room;
    public RadioButton rbtnRoomType;
    public RadioButton rbtnRoomCapacity;
    public ToggleGroup Capasity;
    public Button btnAddGuest;
    public Button btnDeleteGuest;
    public Button btnBack;

    public void initialize() {
        ObservableList<String> roomAvailable = FXCollections.observableArrayList();
        roomAvailable.add("Cleand");
        roomAvailable.add("Not Cleand");
        roomAvailable.add("Booking");
        roomAvailable.add("At Work");
        cmbRoomAvailable.setItems(roomAvailable);
        cmbRoomAvailable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
        });
    }

    public void deleteGuestOnAction(ActionEvent actionEvent) {
        //Delete guest method
    }

    public void addGuestOnAction(ActionEvent actionEvent) {
        //Add Guest Method
    }

    public void nameOnKeyTyped(KeyEvent keyEvent) {
        //Add Guest name
    }

    public void BackOnActio9n(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoard.fxml"))));
        stage.show();
    }
}
