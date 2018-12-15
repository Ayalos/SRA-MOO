/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import sra.Tela_Aluno;
import sra.Tela_Diretor;
import sra.Tela_Professor;

/**
 * FXML Controller class
 *
 * @author klebson
 */
public class Tela_PrincipalController implements Initializable {

    @FXML private MenuItem MenuItem_Arquivo_Sair;
    @FXML private MenuItem MenuItem_Professor_Listagem;
    @FXML private MenuItem MenuItem_Aluno_Listagem;
    @FXML private MenuItem MenuItem_Diretor_Listagem;
    @FXML private MenuItem MenuItem_Relatorio_Aluno;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        MenuItem_Arquivo_Sair.setOnAction((ActionEvent e) -> {
            
        });
        
        MenuItem_Professor_Listagem.setOnAction((ActionEvent e) -> {
            
            Tela_Professor tela_Professor = new Tela_Professor(); // ESTANCIANDO OBJETO DA TELA PRINCIPAL 
            try {
                tela_Professor.start(new Stage()); // INICIANDO A TELA PRINCIPAL ( PASSANDO O STAGE COM ARGUMENTO )
            } catch (Exception ex) { // TRATAMENTO DE ERRO ( EXCEPRION )
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        MenuItem_Aluno_Listagem.setOnAction((ActionEvent e) -> {
            
            Tela_Aluno tela_Aluno = new Tela_Aluno(); // ESTANCIANDO OBJETO DA TELA PRINCIPAL 
            try {
                tela_Aluno.start(new Stage()); // INICIANDO A TELA PRINCIPAL ( PASSANDO O STAGE COM ARGUMENTO )
            } catch (Exception ex) { // TRATAMENTO DE ERRO ( EXCEPRION )
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        MenuItem_Diretor_Listagem.setOnAction((ActionEvent e) -> {
            
            Tela_Diretor tela_Diretor = new Tela_Diretor(); // ESTANCIANDO OBJETO DA TELA PRINCIPAL 
            try {
                tela_Diretor.start(new Stage()); // INICIANDO A TELA PRINCIPAL ( PASSANDO O STAGE COM ARGUMENTO )
            } catch (Exception ex) { // TRATAMENTO DE ERRO ( EXCEPRION )
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
    }    


}
