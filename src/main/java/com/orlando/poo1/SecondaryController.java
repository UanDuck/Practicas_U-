package com.orlando.poo1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class SecondaryController implements Initializable{//igual agregamos el initializable
    @FXML private Label lbl_prom;
    @FXML private Label lbl_prAp;
    @FXML private Label lbl_prRp;
    
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    public void datosAl(Alumno[] alum) { //deb ser publico
        estadisticas stats=new estadisticas(alum);
        
        float promedio=stats.promedio();
        float porcentajeAprobados=stats.aprobados();
        float porcentajeReprobados=stats.reprobados();// jalamos los datos ya calculados en estadisticas.kjava
        
        //y los seteamos en los label
        lbl_prom.setText("Promedio: "+promedio);
        lbl_prAp.setText("Aprobados: %"+porcentajeAprobados);
        lbl_prRp.setText("Reprobados: %"+porcentajeReprobados);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}//public class secondary