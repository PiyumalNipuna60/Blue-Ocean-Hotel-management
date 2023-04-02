package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class MealPlanDetailsController {
    public TextField txtMealType;
    public TextField txtMealCharge;
    public TextField txtNumberOfRoom;
    public Label txtServise;
    public TableView tblRoom;
    public ImageView btnADD;
    public Button btnBack;

    public void ADDOnAction(ActionEvent actionEvent) {
        //Add details
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Management.fxml"))));
        stage.show();
    }
}
