package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.User;

import java.io.IOException;

public class LoginController {

    @FXML
    private JFXTextField txtname;

    @FXML
    private JFXPasswordField txtpassword;
    @FXML
    private Label txtlogintxt;

    private String name;
    private String password;

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        Stage stage=new Stage();
        stage.setTitle("Add Task");
        String name=txtname.getText();
        String password=txtpassword.getText();

        if(name.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("123")){
            txtlogintxt.setText("Sucessfully  Login....");
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/add_task_form.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("DashBoard Form");
            stage.show();

        }else {
            txtlogintxt.setText("Login Fail Please try again.....");
        }
       User user=new User();
    }

}
