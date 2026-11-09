/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab_11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
/**
 * FXML Controller class
 *
 * @author 2565007
 */
public class PrimaryController implements Initializable {

    @FXML
    private ListView<String> entreeListView;
    @FXML
    private Label drinkSelectionBtn;
    @FXML
    private RadioButton coffeeRB;
    @FXML
    private ToggleGroup drinkToggle;
    @FXML
    private RadioButton teaRB;
    @FXML
    private RadioButton sodaRB;
    @FXML
    private RadioButton juiceRB;
    @FXML
    private MenuBar menuBar;
    @FXML
    private Label currentOrderLbl;
    @FXML
    private Label totalLblv;
    @FXML
    private Button placeBtn;
    @FXML
    private Button clearBtn;
    @FXML
    private CheckBox requestWaterCheck;
    @FXML
    private Label specialRequestsLbl;
    @FXML
    private TextField requestsTxt;
    @FXML
    private Pane root;
    @FXML
    private VBox vBox1;
    
    private ObservableList<String> items = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        entreeListView.setItems(items);
        items.addAll("Chicken Salad", "Turkey Sandwich", "Vegetable Wrap", "Grilled Cheese");
        
        MenuItem placeOrderItem = new MenuItem("Place Order");
        MenuItem clearOrderItem = new MenuItem("Clear Order");
        MenuItem exitItem = new MenuItem("Exit");
        
        fileMenu.getItems().addAll(
            placeOrderItem,clearOrderItem,exitItem);
        
        MenuItem clearEntreeItem = new MenuItem("Entree");
        MenuItem clearDrinkItem = new MenuItem("Drink");
        MenuItem specialRequestItem = new MenuItem("Special Request");
        
        placeBtn.setOnAction(e -> {
            
        });
    }       
}
