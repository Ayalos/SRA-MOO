/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sra;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author LJ01PROG01
 */
public class Login extends Application {
    
    private static Stage stage; //Janela 
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/TelaLogin.fxml")); // CARREGANDO O FXML
        
        Scene scene = new Scene(root); // PASSANDO O FXML PARA CENA 
        stage.setTitle("Login - ProMED"); // COLOCANDO UM TITULO 
        stage.setScene(scene); /// COLOCANDO A CENA EM UM JANELA 
        stage.show(); // ABRINDO UMA JANELA 
        stage.setResizable(false); // NAO É POSSIVEL REDIMENSIONAR A JANELA
        setStage(stage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Login.stage = stage;
    }
}
