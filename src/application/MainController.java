package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    private Stage stage;

    @FXML
    void onClick2048Button(ActionEvent e) {

    }

    @FXML
    void onClickOmokButton(ActionEvent e) throws IOException {
        Node node = (Node)(e.getSource());
        stage = (Stage)(node.getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("OmokUI.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("오목");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onClickWorkChainGameButton(ActionEvent e) throws IOException {
        Node node = (Node)(e.getSource());
        stage = (Stage)(node.getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("WordChainGame.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("끝말잇기");
        stage.setScene(scene);
        stage.show();
    }

}