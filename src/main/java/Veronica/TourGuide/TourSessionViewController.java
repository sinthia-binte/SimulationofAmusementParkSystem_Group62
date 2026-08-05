package Veronica.TourGuide;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;


public class TourSessionViewController {


    @FXML
    private TextField MeetingPointTF;

    @FXML
    private ComboBox<String> CategoryCB;

    @FXML
    private TextField StartTimeTF;

    @FXML
    private TextArea PreviewTA;

    @FXML
    private TextField TitleTF;

    @FXML
    private TextField CapacityTF;

    @FXML
    private ComboBox<String> DurationCB;

    @FXML
    private TextField PriceTF;

    @FXML
    private DatePicker DateDP;

    @FXML
    private TextArea DescriptionTF;

    @FXML
    private TextField EndTimeTF;

    @FXML
    private TextField LocationTF;



    @FXML
    public void initialize() {


        CategoryCB.getItems().addAll(
                "Adventure",
                "Historical",
                "Nature",
                "City",
                "Food"
        );


        DurationCB.getItems().addAll(
                "1 Hour",
                "2 Hours",
                "Half Day",
                "Full Day"
        );

    }





    @FXML
    public void saveTourButtonOA(ActionEvent actionEvent) {


        if (TitleTF.getText().isBlank()
                || DescriptionTF.getText().isBlank()
                || LocationTF.getText().isBlank()
                || DateDP.getValue() == null
                || CategoryCB.getValue() == null
                || DurationCB.getValue() == null) {


            PreviewTA.setText(
                    "Please complete all required fields."
            );

            return;
        }



        float price;

        int capacity;


        try {

            price = Float.parseFloat(
                    PriceTF.getText()
            );


            capacity = Integer.parseInt(
                    CapacityTF.getText()
            );


        } catch (NumberFormatException e) {


            PreviewTA.setText(
                    "Price and capacity must be numbers."
            );

            return;
        }




        ArrayList<TourSession> tourList =
                BinaryFileUtil.readList(
                        "TourSessions.bin"
                );



        String tourGuideId =
                "TG" + (tourList.size() + 1);




        TourSession tour =
                new TourSession(

                        tourGuideId,
                        TitleTF.getText(),
                        DescriptionTF.getText(),
                        LocationTF.getText(),
                        DurationCB.getValue(),
                        CategoryCB.getValue(),
                        MeetingPointTF.getText(),
                        DateDP.getValue(),
                        StartTimeTF.getText(),
                        EndTimeTF.getText(),
                        price,
                        capacity

                );




        tourList.add(tour);



        BinaryFileUtil.saveList(
                "TourSessions.bin",
                tourList
        );




        PreviewTA.setText(
                "Tour saved successfully!"
                        + "\nTour ID: " + tourGuideId
        );

    }







    @FXML
    public void previewButtonOA(ActionEvent actionEvent) {


        PreviewTA.setText(

                "Tour Title: " + TitleTF.getText()
                        + "\nCategory: " + CategoryCB.getValue()
                        + "\nDate: " + DateDP.getValue()
                        + "\nStart Time: " + StartTimeTF.getText()
                        + "\nEnd Time: " + EndTimeTF.getText()
                        + "\nDuration: " + DurationCB.getValue()
                        + "\nLocation: " + LocationTF.getText()
                        + "\nMeeting Point: " + MeetingPointTF.getText()
                        + "\nCapacity: " + CapacityTF.getText()
                        + "\nPrice: " + PriceTF.getText()
                        + "\nDescription: " + DescriptionTF.getText()

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
