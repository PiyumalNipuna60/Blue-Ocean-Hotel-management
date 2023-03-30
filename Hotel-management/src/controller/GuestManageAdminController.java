package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class GuestManageAdminController {
    public TextField txtName;
    public TextField txtNIC;
    public TextField txtAddress;
    public TextField txtTelNo;
    public Button btnADDGUEST;
    public Button btnDELETEGUEST;
    public Button btnBack;


    public void DeleteGuestOnAction(ActionEvent actionEvent) throws IOException {
        //Delete guest Method
    }

    public void addGuestOnAction(ActionEvent actionEvent) throws IOException {
        //Guest Add Method
    }

    public void nameOnKeyTyped(KeyEvent keyEvent) throws IOException {
        //Take Name
    }

    public void nicOnKeyTyped(KeyEvent keyEvent) throws IOException {
        //Take Nic
    }

    public void licenseOnKeyTyped(KeyEvent keyEvent) throws IOException {
        //Take Email
    }

    public void addressOnKeyTyped(KeyEvent keyEvent) throws IOException {
        //take Address
    }

    public void BackOnActio9n(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoard.fxml"))));
        stage.show();
    }
}
