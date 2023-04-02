package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagementController {


    public Button btnRoomDetails;
    public Button btnMealDetails;
    public Button btnIncomDetails;
    public Button btnBack1;

    public void RoomDetailsOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnRoomDetails.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HotelRoomDetailsManage.fxml"))));
        stage.show();
    }

    public void MealDetailsOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnMealDetails.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPlanDetails.fxml"))));
        stage.show();
    }

    public void IncomeDetailsOnAction(ActionEvent actionEvent) throws IOException {

    }

    public void BackOnActio9n(ActionEvent actionEvent) throws IOException {

    }
}
