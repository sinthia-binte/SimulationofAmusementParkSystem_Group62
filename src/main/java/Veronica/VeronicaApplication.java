package Veronica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VeronicaApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Veronica/LoginView.fxml"));

        Scene scene = new Scene(loader.load());
        stage.setTitle("Independent Amusement Park - Login");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {

        launch(args);

    }
}