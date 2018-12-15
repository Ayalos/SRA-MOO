/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sra;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author klebson
 */
public class Tela_Principal  extends Application {
    
    private static Stage stage; //Janela 
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Tela_Principal.fxml")); // CARREGANDO FXML
        
        Scene scene = new Scene(root); // COLOCANDO FXML NA CENA 
        stage.setTitle("Home - SRA"); // COLOCANDO UM TITULO 
        stage.setScene(scene); /// PASSANDO A CENA PARA UMA JANELA 
        stage.setMaximized(true); // DEIXANDO JANELA MAXIMIZED
        stage.setResizable(true); // NAO É POSSIVEL REDIMENSIONAR A JANELA
        
        
        stage.show(); // ABRINDO A JANELA
        
        setStage(stage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Tela_Principal.stage = stage;
    }
}
