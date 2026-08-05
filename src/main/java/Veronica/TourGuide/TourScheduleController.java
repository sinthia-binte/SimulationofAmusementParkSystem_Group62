package Veronica.TourGuide;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;


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
    private Label DetailsLabel;


    private ObservableList<TourSchedule> tourList;



    @FXML
    public void initialize() {


        TourNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("tourName")
        );


        DateColumn.setCellValueFactory(
                new PropertyValueFactory<>("date")
        );


        TimeColumn.setCellValueFactory(
                new PropertyValueFactory<>("time")
        );


        LocationColumn.setCellValueFactory(
                new PropertyValueFactory<>("location")
        );


        loadTourSchedule();

    }





    private void loadTourSchedule() {


        tourList = FXCollections.observableArrayList();



        ArrayList<TourSession> sessions =
                BinaryFileUtil.readList(
                        "TourSessions.bin"
                );



        for (TourSession session : sessions) {


            int tourId =
                    Integer.parseInt(
                            session.getTourguideId()
                                    .replace("TG", "")
                    );



            TourSchedule schedule =
                    new TourSchedule(

                            tourId,
                            session.getTitle(),
                            session.getDate().toString(),
                            session.getStarttime(),
                            session.getLocation(),
                            session.getDescription()

                    );



            tourList.add(schedule);

        }



        ScheduleTable.setItems(tourList);

    }





    @FXML
    public void viewDetailsOA(ActionEvent actionEvent) {


        TourSchedule selectedTour =
                ScheduleTable.getSelectionModel()
                        .getSelectedItem();



        if (selectedTour == null) {


            Alert alert =
                    new Alert(Alert.AlertType.ERROR);


            alert.setContentText(
                    "Please select a tour first."
            );


            alert.showAndWait();

            return;

        }



        DetailsLabel.setText(

                "Tour ID: " + selectedTour.getTourId()
                        + "\nTour Name: " + selectedTour.getTourName()
                        + "\nDate: " + selectedTour.getDate()
                        + "\nTime: " + selectedTour.getTime()
                        + "\nLocation: " + selectedTour.getLocation()
                        + "\nDescription: " + selectedTour.getDescription()

        );

    }





    @FXML
    public void BackToDashboardOA(ActionEvent actionEvent) {


        SceneSwitcher.switchScene(
                actionEvent,
                "/Veronica/TourGuide/TourGuideDashBoardView.fxml",
                "Tour Guide Dashboard"
        );

    }

}
