    module mx.edu.utez.demo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens mx.edu.utez.demo3 to javafx.fxml;
    opens mx.edu.utez.demo3.controller to javafx.fxml;
    opens mx.edu.utez.demo3.model to javafx.base, javafx.fxml;
    exports mx.edu.utez.demo3.ui;
    

}   