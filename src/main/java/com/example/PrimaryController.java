package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.Service.LoginService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PrimaryController implements Initializable {

    private LoginService loginService;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginService = new LoginService();
    }

//    public PrimaryController(LoginService loginService){
//        this.loginService = loginService;
//    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        loginService.setRoot();
    }



}
