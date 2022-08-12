package _02_observer.self_implementation;

import java.util.ArrayList;
import java.util.Collections;

public class WeatherStatsObserverDisplay implements Observer, DisplayElement {
    
    private ArrayList<Float> temperatures;

    private Subject weatherData;

    public WeatherStatsObserverDisplay(Subject weatherData){

        this.temperatures = new ArrayList<Float>();
        
        this.weatherData = weatherData;

        this.weatherData.registerObserver(this);

    }

    public void update(float temperature, float humidity, float pressure){

        this.temperatures.add(temperature);

        display();

    }

    public void display(){


        float avgTemperature = 0;

        float totalTemperature = 0;

        for(Float f : temperatures){
            totalTemperature += f;
        }

        avgTemperature = totalTemperature / temperatures.size();

        float minTemperature = Collections.min(temperatures);

        float maxTemperature = Collections.max(temperatures);

        System.out.println("Weather Stats: " + "Avg. Temperature: " + avgTemperature + " Min. Temperature: " + minTemperature + " Max. Temperature: " + maxTemperature);

    }

    public void removeMeFromSubject(){

        this.weatherData.removeObserver(this);

    }

}