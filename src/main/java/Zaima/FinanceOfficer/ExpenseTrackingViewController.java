package Zaima.FinanceOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class ExpenseTrackingViewController {
    @javafx.fxml.FXML
    private TableColumn VendorTC;
    @javafx.fxml.FXML
    private TableColumn CategoryTC;
    @javafx.fxml.FXML
    private ComboBox CategoryCB;
    @javafx.fxml.FXML
    private TableColumn AmountTC;
    @javafx.fxml.FXML
    private TableColumn ExpenseIDTC;
    @javafx.fxml.FXML
    private Label ExpenseTrackingLabel;
    @javafx.fxml.FXML
    private TextField AmountTF;
    @javafx.fxml.FXML
    private TableColumn DateTC;
    @javafx.fxml.FXML
    private TextField VendorTF;
    @javafx.fxml.FXML
    public void initialize() {

        ExpenseTrackingLabel.setText(
                "Expense Tracking"
        );

        CategoryCB.getItems().addAll(
                "Food",
                "Transportation",
                "Maintenance",
                "Utilities",
                "Other"
        );
    }

    @javafx.fxml.FXML
    public void UpdateOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveOA(ActionEvent actionEvent) {
    }
}
