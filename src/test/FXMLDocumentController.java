/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {
    @FXML private TextField txtChieuCao;
    @FXML private TextField txtCannang;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void OnAction(ActionEvent event){
        Double cao = Double.parseDouble(this.txtChieuCao.getText());
        Double nang = Double.parseDouble(this.txtCannang.getText());
        Double BMI = nang / Math.pow(cao,2);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(String.valueOf(BMI));
        alert.show();
    }
}
