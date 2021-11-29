package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.entity.Contract;
import sample.http_client.MyHttpClient;

import java.util.List;

public class FirstViewController {

    @FXML
    private Button showButton;

    @FXML
    void initialize() {
        showButton.setOnAction(event -> {

            showButton.getScene().getWindow().hide();

            List<Contract> contracts = MyHttpClient.getContent();

            ObservableList<Contract> observableList = FXCollections.observableList(contracts);
            new ResultViewController().initialize(observableList);

        });
    }
}
