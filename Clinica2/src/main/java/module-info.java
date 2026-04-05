module com.clinicapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfxcore;
    requires java.sql;

    opens com.clinicapp to javafx.fxml;
    exports com.clinicapp;
}