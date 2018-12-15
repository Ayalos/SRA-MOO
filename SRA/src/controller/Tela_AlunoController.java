package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sra.Tela_Aluno_Cadastro;

public class Tela_AlunoController implements Initializable {

    @FXML private Button btn_adicionar_aluno;
    @FXML private Button btn_deletar_aluno;
    @FXML private Button btn_editar_aluno;
    @FXML private Button btn_atualizar_table_view;
    @FXML private TextField label_texto_pesquisa;
    @FXML private Button btn_pesquisar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        btn_adicionar_aluno.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Tela_Aluno_Cadastro tela_Aluno_Cadastro = new Tela_Aluno_Cadastro(); // ESTANCIANDO OBJETO DA TELA PRINCIPAL
                try {
                    tela_Aluno_Cadastro.start(new Stage()); // INICIANDO A TELA PRINCIPAL ( PASSANDO O STAGE COM ARGUMENTO )
                } catch (Exception ex) { // TRATAMENTO DE ERRO ( EXCEPRION )
                    Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }    
    
}
