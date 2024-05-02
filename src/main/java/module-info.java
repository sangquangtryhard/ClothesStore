module com.example.clothesstore_se330 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.clothesstore_se330 to javafx.fxml;
    exports com.example.clothesstore_se330;
}