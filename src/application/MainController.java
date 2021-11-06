package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    private Stage stage;

    @FXML
    void onClick2048Button(MouseEvent e) throws IOException {
    	Node node = (Node)(e.getSource());
        stage = (Stage)(node.getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("Play2048UI.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("2048");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void onClickOmokButton(MouseEvent e) throws IOException {
        Node node = (Node)(e.getSource());
        stage = (Stage)(node.getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("OmokUI.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("오목");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void onClickWorkChainGameButton(MouseEvent e) throws IOException {
        Node node = (Node)(e.getSource());
        stage = (Stage)(node.getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("WordChainGameUI.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("끝말잇기");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void onClickWorkChainGameComputerButton(MouseEvent e) throws IOException {
        Node node = (Node)(e.getSource());
        stage = (Stage)(node.getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("WordChainGameComputerUI.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("컴퓨터와 함께하는 끝말잇기");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void onClickBluemarbleButton(MouseEvent e) throws IOException {
        Node node = (Node)(e.getSource());
        stage = (Stage)(node.getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("bluemarble/client/ConnectModal/index.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("부루마블");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void onHoverEnter(MouseEvent e) {
        Node source = (Node)e.getSource();
        source.setStyle("-fx-cursor:hand;");
    }
    @FXML
    void onHoverExit(MouseEvent e) {
        Node source = (Node)e.getSource();
        source.setStyle("-fx-cursor:default;");
    }
}