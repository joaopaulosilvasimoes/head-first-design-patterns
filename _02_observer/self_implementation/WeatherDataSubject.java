package _02_observer.self_implementation;

import java.util.ArrayList;

public class WeatherDataSubject implements Subject {
    
    private ArrayList<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherDataSubject(){

        observers = new ArrayList<Observer>();

    }

    @Override
    public void registerObserver(Observer o) {
        
        observers.add(o);
        
    }

    @Override
    public void removeObserver(Observer o) {

        int i = observers.indexOf(o);

        if(i >= 0){

            observers.remove(i);

        }
        
    }

    @Override
    public void notifyObservers() {

        for(int i = 0; i < observers.size(); i++){

            Observer observer = observers.get(i);

            observer.update(temperature, humidity, pressure);

        }
        
    }

    public void measurementsChange(){

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