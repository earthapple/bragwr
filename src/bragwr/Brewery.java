package bragwr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;

public class Brewery {

  private Number temperature = 399;

  public void addRandomPoint() {
    System.out.println("Add random point.");
    //initChart(event);
   /* Number x = Math.random()*100;
    Number y = Math.random()*100;

    XYChart.Data<Number,Number> randPoint = new XYChart.Data<Number,Number>(x,y);

    tempSeries.getData().add(randPoint);
*/
  }

  public Brewery() {
    System.out.println("Brewery object initialized.");

  }

  public Number getTemperature() {
    return this.temperature;
  }

}
