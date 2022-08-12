package _02_observer.self_implementation;

public class CurrentConditionsObserverDisplay implements Observer, DisplayElement {
    
    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsObserverDisplay(Subject weatherData){
 
        this.weatherData = weatherData;

        this.weatherData.registerObserver(this);

    }

    public void update(float temperature, float humidity, float pressure){

        this.temperature = temperature;

        this.humidity = humidity;

        display();

    }

    // Another way, but needs to change code.
    public void update(){

        this.temperature = ((WeatherDataSubject) weatherData).getTemperature();

        this.humidity = ((WeatherDataSubject) weatherData).getHumidity();

        display();

    }    

    public void display(){

        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity");

    }

    public void removeMeFromSubject(){

        this.weatherData.removeObserver(this);

    }    

}