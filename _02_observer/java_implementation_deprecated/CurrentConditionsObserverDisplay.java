package _02_observer.java_implementation_deprecated;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsObserverDisplay implements Observer, DisplayElement {
    
    private float temperature;

    private float humidity;

    private Observable observable;

    public CurrentConditionsObserverDisplay(Observable observable){
 
        this.observable = observable;

        this.observable.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        
        if(o instanceof WeatherDataObservable){

            WeatherDataObservable weatherDataObservable =  (WeatherDataObservable) o;

            this.temperature = weatherDataObservable.getTemperature();

            this.humidity = weatherDataObservable.getHumidity();

            display();

        }

    }

    public void display(){

        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity");

    }

}