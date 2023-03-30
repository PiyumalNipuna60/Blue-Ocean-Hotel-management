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
        String tempUserName=txtReceptionUserName.getText();
        String tempPassword=txtReceptionPassword.getText();
        if (tempUserName.equals("Resept") && tempPassword.equals("12345")) {
            Stage stage = (Stage) btnLogin.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/UserDashBoard.fxml"))));
            stage.show();
        }else{
            new Alert(Alert.AlertType.CONFIRMATION,"Try Again!").show();
        }
    }

    public void cancelReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnCancel.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePage.fxml"))));
        stage.show();
    }


}
