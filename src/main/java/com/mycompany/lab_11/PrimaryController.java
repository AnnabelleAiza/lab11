package com.mycompany.lab_11;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PrimaryController {

    @FXML
    private ListView<?> entreeListView;
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

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
