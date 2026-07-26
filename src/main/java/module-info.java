module com.oop.simulationofamusementparksystem_group62 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.simulationofamusementparksystem_group62 to javafx.fxml;
    exports com.oop.simulationofamusementparksystem_group62;
    exports Veronica;
    opens Veronica to javafx.fxml;
}