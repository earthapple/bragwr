package bragwr;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Bragwr extends Application {

  @Override
  public void start(Stage stage) throws Exception {

    RadioButton bkStatusLbl;
    Label mltLbl;
    Label hltLbl;
    Label bkLbl;
    TextField mltTargetText;
    TextField hltTargetText;
    TextField bkTargetText;
    Label hltTempLbl;
    Label mltTempLbl;
    Label bkTempLbl;
    RadioButton mltStatusLbl;
    RadioButton hltStatusLbl;
    LineChart tempChart;

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("brewery.fxml"));
    Parent root = fxmlLoader.load();

    Scene scene = new Scene(root, 1280, 800);

    stage.setTitle("FXML Welcome");
    stage.setScene(scene);
    stage.show();

    Brewery model = new Brewery();

  }

  public static void main(String[] args) {
    launch(args);
  }


  public void actionPerformed(Event event) {
    System.out.println("Something happened.");
  }
}
