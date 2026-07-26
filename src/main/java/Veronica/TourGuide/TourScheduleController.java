package Veronica.TourGuide;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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

    @FXML
    private TextArea DetailsTA;


    private ObservableList<TourSchedule> tourList;


    @FXML
    public void initialize() {

        // Connect table columns with TourSchedule attributes

        TourNameColumn.setCellValueFactory(data ->
                new SimpleStringProperty(
                        data.getValue().getTourName()
                )
        );


        DateColumn.setCellValueFactory(data ->
                new SimpleStringProperty(
                        data.getValue().getDate()
                )
        );


        TimeColumn.setCellValueFactory(data ->
                new SimpleStringProperty(
                        data.getValue().getTime()
                )
        );


        LocationColumn.setCellValueFactory(data ->
                new SimpleStringProperty(
                        data.getValue().getLocation()
                )
        );


        loadTourSchedule();

    }



    private void loadTourSchedule() {

        tourList = FXCollections.observableArrayList();


        // Sample assigned tours
        tourList.add(
                new TourSchedule(
                        1,
                        "City History Tour",
                        "26-07-2026",
                        "10:00 AM",
                        "Main Gate",
                        "Historical attraction tour"
                )
        );


        tourList.add(
                new TourSchedule(
                        2,
                        "Nature Adventure",
                        "28-07-2026",
                        "09:00 AM",
                        "Forest Area",
                        "Guided nature exploration"
                )
        );


        ScheduleTable.setItems(tourList);

    }



    @FXML
    public void viewDetailsOA(ActionEvent actionEvent) {


        TourSchedule selectedTour =
                ScheduleTable.getSelectionModel()
                        .getSelectedItem();


        if(selectedTour == null){

            Alert alert =
                    new Alert(Alert.AlertType.ERROR);

            alert.setContentText(
                    "Please select a tour first."
            );

            alert.showAndWait();

            return;
        }


        DetailsTA.setText(
                "Tour ID: " + selectedTour.getTourId()
                        + "\nTour Name: " + selectedTour.getTourName()
                        + "\nDate: " + selectedTour.getDate()
                        + "\nTime: " + selectedTour.getTime()
                        + "\nLocation: " + selectedTour.getLocation()
                        + "\nDescription: " + selectedTour.getDescription()
        );

    }
}