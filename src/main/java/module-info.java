module com.oop.simulationofamusementparksystem_group62 {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens com.oop.simulationofamusementparksystem_group62 to javafx.fxml;
    exports com.oop.simulationofamusementparksystem_group62;

    exports Veronica;
    opens Veronica to javafx.fxml;

    exports Sinthia;
    opens Sinthia to javafx.fxml;

    exports Sinthia.SecurityInCharge;
    opens Sinthia.SecurityInCharge to javafx.fxml;
}