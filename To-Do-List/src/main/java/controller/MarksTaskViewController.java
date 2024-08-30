package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



public class MarksTaskViewController {

    @FXML
    private TableColumn<?, ?> coldate;

    @FXML
    private TableColumn<?, ?> coldescription;

    @FXML
    private TableColumn<?, ?> colid;

    @FXML
    private TableColumn<?, ?> coltittle;

    @FXML
    private TableView<?> tblViewTask;

    @FXML
    void btnDeleteOnAction(ActionEvent actionEvent) {

    }


    @FXML
    void btnReloadOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    private void loadTable(){

        colid.setCellValueFactory(new PropertyValueFactory<>("id"));
        coltittle.setCellValueFactory(new PropertyValueFactory<>("tasktittle") );
        coldescription.setCellValueFactory(new PropertyValueFactory<>("taskdesc"));
        coldate.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

}
