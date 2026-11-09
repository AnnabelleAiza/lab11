/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fxml;

import java.net.URL;
import java.util.ResourceBundle;
iimport javafx.fxml.FXML;
mport javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
/**
 * FXML Controller class
 *
 * @author 2565007
 */
public class OrderSummaryController implements Initializable {


    @FXML
    private Pane OrderSummary;
    @FXML
    private Label summaryTitle;
    @FXML
    private Label entreelbl;
    @FXML
    private Label drinkLbl;
    @FXML
    private Label waterRequestLbl;
    @FXML
    private Label specialRqstLbl;
    @FXML
    private Label totalLbl;
    @FXML
    private Button closeBtn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
