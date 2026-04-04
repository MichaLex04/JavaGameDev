module com.clinicapp.clinica2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.clinicapp.clinica2 to javafx.fxml;
    exports com.clinicapp.clinica2;
}