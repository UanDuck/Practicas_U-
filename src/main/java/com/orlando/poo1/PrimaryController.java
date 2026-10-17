package com.orlando.poo1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrimaryController implements Initializable{ //implementamos initializable
    
    @FXML private TextField txtAl1; 
    @FXML private TextField txtAl2; 
    @FXML private TextField txtAl3; 
    @FXML private TextField txtAl4; 
    @FXML private TextField txtAl5; 
    @FXML private TextField txtAl6; 
    @FXML private TextField txtAl7; 
    @FXML private TextField txtAl8; 
    @FXML private TextField txtAl9; 
    @FXML private TextField txtAl10; 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException{ //creamos el evento para el btoon
        Alumno[] alum=new Alumno[10];
        alum[0] =new Alumno("Pedro", Integer.parseInt(txtAl1.getText()));
        alum[1] =new Alumno("maria", Integer.parseInt(txtAl2.getText()));
        alum[2] =new Alumno("juan", Integer.parseInt(txtAl3.getText()));
        alum[3] =new Alumno("paco", Integer.parseInt(txtAl4.getText()));
        alum[4] =new Alumno("tito", Integer.parseInt(txtAl5.getText()));
        alum[5] =new Alumno("fulano", Integer.parseInt(txtAl6.getText()));
        alum[6] =new Alumno("pengano", Integer.parseInt(txtAl7.getText()));
        alum[7] =new Alumno("ricardo", Integer.parseInt(txtAl8.getText()));
        alum[8] =new Alumno("carlos", Integer.parseInt(txtAl9.getText()));
        alum[9] =new Alumno("luis", Integer.parseInt(txtAl10.getText()));
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml")); //cargar formulario
        Parent root = loader.load();
        SecondaryController controller =loader.getController();
        controller.datosAl(alum);//el mismo de secondary
        
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

   
}
