package sample.controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sample.entity.Contract;

public class ResultViewController {

    @FXML
    void initialize(ObservableList<Contract> observableList) {
        TableView<Contract> tableContracts = new TableView<>();

        TableColumn<Contract, Integer> idColumn = new TableColumn<>("id");

        TableColumn<Contract, String> signingDateColumn = new TableColumn<>("signing_date");

        TableColumn<Contract, Integer> contractIdColumn = new TableColumn<>("contract_id");

        TableColumn<Contract, String> updateDateColumn = new TableColumn<>("update_date");

        TableColumn<Contract, Boolean> checkBox = new TableColumn<>("checkbox");

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableContracts.getColumns().add(idColumn);

        signingDateColumn.setCellValueFactory(new PropertyValueFactory<>("signingDate"));
        tableContracts.getColumns().add(signingDateColumn);

        contractIdColumn.setCellValueFactory(new PropertyValueFactory<>("contractId"));
        tableContracts.getColumns().add(contractIdColumn);

        updateDateColumn.setCellValueFactory(new PropertyValueFactory<>("updateDate"));
        tableContracts.getColumns().add(updateDateColumn);

        checkBox.setCellValueFactory(new PropertyValueFactory<>("checkbox"));
        tableContracts.getColumns().add(checkBox);

        tableContracts.setItems(observableList);

        StackPane root = new StackPane();
        root.setPadding(new Insets(10));
        root.getChildren().add(tableContracts);
        Scene scene = new Scene(root, 600, 400);

        Stage stage = new Stage();
        stage.setTitle("All contracts");
        stage.setScene(scene);
        stage.showAndWait();

        tableContracts.setItems(observableList);
    }
}




