module com.orlando.poo1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.orlando.poo1 to javafx.fxml;
    exports com.orlando.poo1;
}
