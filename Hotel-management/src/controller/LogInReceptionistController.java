package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInReceptionistController {
    public PasswordField txtReceptionPassword;
    public PasswordField txtReceptionUserName;
    public Button btnLogin;
    public Button btnCancel;

    public void ReceptionistLogInOnAction(ActionEvent actionEvent) throws IOException {

    }

    public void cancelReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnCancel.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePage.fxml"))));
        stage.show();
    }


}
