package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HotelRoomDetailsManageController {
    public TextField txtRoomType;
    public TextField txtROOMCharge;
    public TextField txtNumberOfRoom;
    public TableView tblRoom;
    public Button btnADD;
    public Button btnBack;

    public void ADDOnAction(ActionEvent actionEvent) throws IOException {
        ArrayList<TableView> roomsArray=new ArrayList<TableView>();

        //Room Chekingt Add Method
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Management.fxml"))));
        stage.show();
    }
}
