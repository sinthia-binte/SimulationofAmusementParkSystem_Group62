package Zaima.FinanceOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class BudgetPlanningViewController {
    @javafx.fxml.FXML
    private TableColumn BudgetTC;
    @javafx.fxml.FXML
    private TextField BudgetLimitTF;
    @javafx.fxml.FXML
    private TableColumn DepartmentTC;
    @javafx.fxml.FXML
    private TableColumn SpentTC;
    @javafx.fxml.FXML
    private TableColumn RemainingTC;
    @javafx.fxml.FXML
    private Label BudgetPlanningLabel;

    @javafx.fxml.FXML
    public void UpdateBudgetOA(ActionEvent actionEvent) {
        if (BudgetLimitTF.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please enter a budget limit."
            );
            alert.showAndWait();

        }
        else {

            try {

                Float.parseFloat(BudgetLimitTF.getText());

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText(
                        "Budget updated successfully."
                );
                alert.showAndWait();

            } catch (NumberFormatException e) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText(
                        "Please enter a valid budget amount."
                );
                alert.showAndWait();
            }
        }
    }
}


