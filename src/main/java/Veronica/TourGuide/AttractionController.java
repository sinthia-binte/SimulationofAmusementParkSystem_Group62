package Veronica.TourGuide;

import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class AttractionController {
    @FXML
    private TextField SearchTF;
    @FXML
    private TextField AttractionNameTF;
    @FXML
    private TextField LocationTF;
    @FXML
    private TextField VisitingTimeTF;
    @FXML
    private TextArea DescriptionTA;
    ArrayList<Attraction> attractionList =
            new ArrayList<>();

    @FXML
    public void initialize() {
        attractionList.add(new Attraction(1, "Roller Coaster", "Zone A", "High speed thrilling ride", "10:00 AM - 8:00 PM"));
        attractionList.add(new Attraction(2, "Water Park", "Zone B", "Water entertainment area", "9:00 AM - 7:00 PM"));
        attractionList.add(new Attraction(3, "Ferris Wheel", "Zone C", "Large observation wheel", "11:00 AM - 9:00 PM")
        );

    }
    @FXML
    public void searchAttractionOA(ActionEvent event) {
        String search = SearchTF.getText();
        boolean found = false;
        for(Attraction a : attractionList){
            if(a.getName().equalsIgnoreCase(search)){
                AttractionNameTF.setText(a.getName());
                LocationTF.setText(a.getLocation());
                VisitingTimeTF.setText(a.getVisitingTime());
                DescriptionTA.setText(a.getDescription());
                found = true;
                break;}
        }
        if(!found){
            AttractionNameTF.clear();
            LocationTF.clear();
            VisitingTimeTF.clear();
            DescriptionTA.setText(
                    "Attraction not found.");
        }

    }
    @FXML
    public void viewAttractionOA(ActionEvent event) {

        if(AttractionNameTF.getText().isEmpty()){

            DescriptionTA.setText(
                    "Search an attraction first."
            );

        }

    }
    @FXML
    public void backToDashboardOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "TourGuideDashboard.fxml", "Tour Guide Dashboard");

    }

}
