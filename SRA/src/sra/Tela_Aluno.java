package sra;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tela_Aluno extends Application {
    
    private static Stage stage; //Janela 
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Tela_Aluno.fxml")); // CARREGANDO FXML
        
        Scene scene = new Scene(root); // COLOCANDO FXML NA CENA 
        stage.setTitle("Aluno - SRA"); // COLOCANDO UM TITULO 
        stage.setScene(scene); /// PASSANDO A CENA PARA UMA JANELA 
        stage.setResizable(false); // NAO É POSSIVEL REDIMENSIONAR A JANELA
        
        
        stage.show(); // ABRINDO A JANELA
        
        setStage(stage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Tela_Aluno.stage = stage;
    }
}
