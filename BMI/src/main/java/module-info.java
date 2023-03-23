module com.khoabeo.bmi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.khoabeo.bmi to javafx.fxml;
    exports com.khoabeo.bmi;
}
