module com.example.lab4v2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.testng;

    opens com.example.lab4v2 to javafx.fxml;
    exports com.example.lab4v2;
}