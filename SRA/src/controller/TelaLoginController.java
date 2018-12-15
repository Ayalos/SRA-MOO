package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sra.Login;
import sra.Tela_Principal;



public class TelaLoginController implements Initializable{
    
    @FXML private TextField txEmail; // TEXTFILD DE EMAIL
    @FXML private Button btnLogin; // BOTAO DE LOGIN
    @FXML private PasswordField txSenha; // PASSWORDFIEL DE SENHA

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // to do 
        
        // ACAOES DO BOTAO DE LOGIN
        btnLogin.setOnMouseClicked((MouseEvent e)-> { // ACAO PARA CLICK ( MOUSE)
            loginCheck(txEmail, txSenha); // CHAMANDO METODO PARA VERIFICAR LOGIN
        });
        btnLogin.setOnKeyPressed((KeyEvent e) ->{ // ACAO PARA CLICK ( TECLADO )
            if(e.getCode() == KeyCode.ENTER){ // TESTANDO QUAL TECLA FOI PRESSIONADO 
                loginCheck(txEmail, txSenha); // CHAMANDO METODO PARA VERIFICAR LOGIN
            }
        });
        txSenha.setOnKeyPressed((KeyEvent e) ->{ // ACAO PARA CLICK ( TECLADO )
            if(e.getCode() == KeyCode.ENTER){ // TESTANDO QUAL TECLA FOI PRESSIONADO 
                loginCheck(txEmail, txSenha); // CHAMANDO METODO PARA VERIFICAR LOGIN
            }
        });
    }
    
    // METODO DE VERIFICAR LOGIN 
    private void loginCheck(TextField usuario, PasswordField senha){
        if (usuario.getText().equals("admin") && senha.getText().equals("admin")){ // TESTANTO OS DADOS DO USUARIO
            
            Tela_Principal telaPrincipal = new Tela_Principal(); // ESTANCIANDO OBJETO DA TELA PRINCIPAL 
            try {
                telaPrincipal.start(new Stage()); // INICIANDO A TELA PRINCIPAL ( PASSANDO O STAGE COM ARGUMENTO )
                fecha(); // FECHANDO O STAGE DE LOGIN
            } catch (Exception ex) { // TRATAMENTO DE ERRO ( EXCEPRION )
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            Alert alerta = new Alert(AlertType.ERROR); // ESTANCIANDO OBJETO ALERTA DO TIPO ERROR
            alerta.setTitle("Erro"); // PASSANDO UM TITULO PARA OBJETO
            alerta.setHeaderText("Erro ao tentar efetuar login"); // PASSANDO UM HEADER TEXT
            alerta.setContentText("Usuário ou/e senha inválidos!"); // PASSANDO MENSAGEM DO ALERTA
            alerta.show(); // EXIBINDO ALERTA
        }
    }
    
    public void fecha(){ // METODO PARA FECHAR JANELA (STAGE)
        Login.getStage().close();
    }
}
