package _02_observer.java_implementation_deprecated;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherDataObservable extends Observable {
    
    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherDataObservable(){

    }

    public void measurementsChange(){

        setChanged();
        notifyObservers();

    }

    public void setMeasurements(float temperature, float humidity, float pressure){

        this.temperature = temperature;

        this.humidity = humidity;

        this.pressure = pressure;

        measurementsChange();

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}