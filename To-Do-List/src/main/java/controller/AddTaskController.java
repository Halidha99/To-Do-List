package controller;

import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import model.User;

import java.io.IOException;

import java.util.List;

public class AddTaskController {

    @FXML
    private CheckBox chk11;
    @FXML
    private CheckBox chk21;
    @FXML
    private CheckBox chk31;
    @FXML
    private CheckBox chk41;
    @FXML
    private CheckBox chk5;
    @FXML
    private CheckBox chkbxtask1;
    @FXML
    private CheckBox chkbxtask10;
    @FXML
    private CheckBox chkbxtask2;
    @FXML
    private CheckBox chkbxtask3;
    @FXML
    private CheckBox chkbxtask4;
    @FXML
    private CheckBox chkbxtask5;
    @FXML
    private CheckBox chkbxtask6;
    @FXML
    private CheckBox chkbxtask7;
    @FXML
    private CheckBox chkbxtask8;
    @FXML
    private CheckBox chkbxtask9;
    @FXML
    private Label lblMyDay;
    @FXML
    private Label lbltask1;
    @FXML
    private Label lbltask11;
    @FXML
    private Label lbltask2;
    @FXML
    private Label lbltask21;
    @FXML
    private Label lbltask3;
    @FXML
    private Label lbltask31;
    @FXML
    private Label lbltask4;
    @FXML
    private Label lbltask41;
    @FXML
    private Label lbltask5;
    @FXML
    private Label lbltask51;
    @FXML
    private TextField txttask;
    @FXML
    private Label lblFull;

    List<User> taskList = DBConnection.getInstance().getConnection();
    private User currentUser;




    @FXML
    void btnTaskAddOnAction(ActionEvent event) {
        String taskText = txttask.getText();
        txttask.setText("");

        if (!taskText.isEmpty()) {
            if (lbltask1.getText().isEmpty()) {
                lbltask1.setText(taskText);
                lbltask1.setDisable(false);
            } else if (lbltask2.getText().isEmpty()) {
                lbltask2.setText(taskText);
                lbltask2.setDisable(false);
            } else if (lbltask3.getText().isEmpty()) {
                lbltask3.setText(taskText);
                lbltask3.setDisable(false);
            } else if (lbltask4.getText().isEmpty()) {
                lbltask4.setText(taskText);
                lbltask4.setDisable(false);
            } else if (lbltask5.getText().isEmpty()) {
                lbltask5.setText(taskText);
                lbltask5.setDisable(false);
            } else {
                lblFull.setText("All task labels are full....");
            }
        }
    }

    @FXML
    void btnViewOnAction(ActionEvent event) {
        Stage stage = new Stage();
        stage.setTitle("View Tasks");
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/view_task.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.show();
    }

    private void selectedTasks() {
        if (chkbxtask1.isSelected() && !lbltask1.getText().isEmpty()) {
            User taskOne = new User();
            taskOne.setText(lbltask1.getText());
            taskList.add(taskOne);
        }

        if (chkbxtask2.isSelected() && !lbltask2.getText().isEmpty()) {
            User taskTwo = new User();
            taskTwo.setText(lbltask2.getText());
            taskList.add(taskTwo);
        }

        if (chkbxtask3.isSelected() && !lbltask3.getText().isEmpty()) {
            User taskThree = new User();
            taskThree.setText(lbltask3.getText());
            taskList.add(taskThree);
        }

        if (chkbxtask4.isSelected() && !lbltask4.getText().isEmpty()) {
            User taskFour = new User();
            taskFour.setText(lbltask4.getText());
            taskList.add(taskFour);
        }

        if (chkbxtask5.isSelected() && !lbltask5.getText().isEmpty()) {
            User taskFive = new User();
            taskFive.setText(lbltask5.getText());
            taskList.add(taskFive);
        }

    }

    @FXML
    void btnFinishOnAction(ActionEvent event) {
        selectedTasks();
    }

    @FXML
    void btnAddOnAction(ActionEvent event) {


        ObservableList<User> taskObservableList = FXCollections.observableArrayList(taskList);


        Label[] dayLabels = {lbltask11, lbltask21, lbltask31, lbltask41, lbltask51};


        for (Label label : dayLabels) {
            label.setText("");
        }


        for (int i = 0; i < taskObservableList.size() && i < dayLabels.length; i++) {
            dayLabels[i].setText(taskObservableList.get(i).getText());
        }

    }
}
