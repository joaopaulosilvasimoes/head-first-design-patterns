package _02_observer.java_implementation_deprecated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

public class WeatherStatsObserverDisplay implements Observer, DisplayElement {
    
    private ArrayList<Float> temperatures;

    private Observable observable;

    public WeatherStatsObserverDisplay(Observable observable){

        this.temperatures = new ArrayList<Float>();
        
        this.observable = observable;

        this.observable.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        
        if(o instanceof WeatherDataObservable){

            WeatherDataObservable weatherDataObservable =  (WeatherDataObservable) o;

            this.temperatures.add(weatherDataObservable.getTemperature());

            display();

        }

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

}