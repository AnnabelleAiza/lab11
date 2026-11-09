module com.mycompany.lab_11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.lab_11 to javafx.fxml;
    exports com.mycompany.lab_11;
}
