package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashBoardController {
    public Label lblRealTime;
    public TableView tblInRooms;
    public Label lblRealDate;
    public TableColumn colRoomNumber;
    public TableColumn colSizeTYpe;
    public TableColumn colPrise;
    public TableColumn colCheckIn;
    public TableColumn colCheckOut;
    public Button btnBack;
    public Button btnHOTELMANAGEMENT;
    public Button btnRESERVEROOM;
    public Button btnMAINTENANCE;
    public Button btnADDGUEST;


    public void AddGuestOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnADDGUEST.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestManageAdmin.fxml"))));
        stage.show();
    }

    public void MantenanceOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnMAINTENANCE.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MaintenanceAdmin.fxml"))));
        stage.show();
    }

    public void ReserveRoomOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnRESERVEROOM.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HotelRoomDetailsAdminDashBorsd.fxml"))));
        stage.show();
    }

    public void BackOnActio9n(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePage.fxml"))));
        stage.show();
    }

    public void HotelManagementOAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnHOTELMANAGEMENT.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Management.fxml"))));
        stage.show();
    }
}
