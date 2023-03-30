package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class IncomController {
    public TextField txtTotalIncome;
    public TextField txtTotalExpehnses;
    public TextField txtNetProfit;
    public Button btnViewMonthly;
    public Button btnViewAnnually;
    public Button btnBack;

    public void ViewMonthlyOnAction(ActionEvent actionEvent) {
        //cCal monthly Cost
    }

    public void ViewOnAction(ActionEvent actionEvent) {
        //Cal Coust
    }

    public void BackOnActio9n(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Management.fxml"))));
        stage.show();
    }
}
