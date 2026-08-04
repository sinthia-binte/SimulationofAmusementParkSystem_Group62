package Veronica.TourGuide;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TourScheduleController {

    @FXML
    private TableColumn<TourSchedule, String> TimeColumn;

    @FXML
    private TableColumn<TourSchedule, String> DateColumn;

    @FXML
    private TableColumn<TourSchedule, String> LocationColumn;

    @FXML
    private TableColumn<TourSchedule, String> TourNameColumn;

    @FXML
    private TableView<TourSchedule> ScheduleTable;


    private ObservableList<TourSchedule> tourList;
    @FXML
    private Label DetailsLabel;


    @FXML
    public void initialize() {
        TourNameColumn.setCellValueFactory(new PropertyValueFactory<>("tourName"));
        DateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        TimeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        LocationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        loadTourSchedule();

    }
    private void loadTourSchedule() {
        tourList = FXCollections.observableArrayList();  // I am Creating a list that will hold TourSchedule objects and can automatically update my JavaFX TableView
        tourList.add(new TourSchedule(1, "City History Tour", "26-07-2026", "10:00 AM", "Main Gate", "Historical attraction tour"));
        tourList.add(new TourSchedule(2, "Nature Adventure", "28-07-2026", "09:00 AM", "Forest Area", "Guided nature exploration"));
        ScheduleTable.setItems(tourList);


    }



    @FXML
    public void viewDetailsOA(ActionEvent actionEvent) {
        TourSchedule selectedTour = ScheduleTable.getSelectionModel().getSelectedItem();

        if(selectedTour == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a tour first.");
            alert.showAndWait();
            return;}
        DetailsLabel.setText(
                "Tour ID: " + selectedTour.getTourId()
                        + "\nTour Name: " + selectedTour.getTourName()
                        + "\nDate: " + selectedTour.getDate()
                        + "\nTime: " + selectedTour.getTime()
                        + "\nLocation: " + selectedTour.getLocation()
                        + "\nDescription: " + selectedTour.getDescription()
        );

    }
}