package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInAdminController {
    public PasswordField txtAdminPassword;
    public Button btnAdminCancel;
    public PasswordField txtAdminUserName;
    public Button btnAdminLogIn;

    public void AdmintLogInOnAction(ActionEvent actionEvent) throws IOException {

    }

    public void cancelAdminOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnAdminCancel.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePage.fxml"))));
        stage.show();
    }
}
