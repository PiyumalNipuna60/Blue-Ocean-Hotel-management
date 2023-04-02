package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class UserDashBoardController {
    public Label lblRealDate;
    public Label lblRealTime;
    public ComboBox comboSelectGuest;
    public ComboBox comboSelectMealPlan;
    public ComboBox comboSelectRoom;
    public Button btnAddGuest;
    public Button btnMaintenance;
    public Button btnReseveRoom;
    public Button btnBack;

    public void initialize(){
        ObservableList<String> mealPlan= FXCollections.observableArrayList();
        mealPlan.add("Chinese Meal");
        mealPlan.add("Fride Rice");
        mealPlan.add("Italian Meal");
        mealPlan.add("Blue Osean Special Kottu");
        mealPlan.add("Blue Osean Special Biriyani");
        mealPlan.add("Indian Masala");
         comboSelectMealPlan.setItems(mealPlan);
         comboSelectMealPlan.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

         });

        ObservableList<String> RoomType= FXCollections.observableArrayList();
        RoomType.add("Single Room");
        RoomType.add("Double Room");
        RoomType.add("Wedding Room");
        RoomType.add("Family Pack");
        comboSelectRoom.setItems(RoomType);
        comboSelectRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });

        ObservableList<String> guest= FXCollections.observableArrayList();
        guest.add("1");
        guest.add("2");
        guest.add("3");
        guest.add("4");
        guest.add("5");
        guest.add("6");
        comboSelectGuest.setItems(guest);
        comboSelectGuest.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
    }



    public void AddGuestOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnAddGuest.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestManageReseption.fxml"))));
        stage.show();
    }

    public void MAINTENANCEOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnMaintenance.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MaintenanceResepttion.fxml"))));
        stage.show();
    }

    public void ReserveRoomOnAction(ActionEvent actionEvent) throws IOException {
        //Add
    }

    public void BackOnActio9n(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePage.fxml"))));
        stage.show();
    }


}