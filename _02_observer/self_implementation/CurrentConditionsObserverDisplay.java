package _02_observer.self_implementation;

public class CurrentConditionsObserverDisplay implements Observer, DisplayElement {
    
    private float temperature;

    private float humidity;

    private Subject wheatherData;

    public CurrentConditionsObserverDisplay(Subject weatherData){
 
        this.wheatherData = weatherData;

        this.wheatherData.registerObserver(this);

    }

    public void update(float temperature, float humidity, float pressure){

        this.temperature = temperature;

        this.humidity = humidity;

        display();

    }

    public void display(){

        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity");

    }

    public void removeMeFromSubject(){

        this.wheatherData.removeObserver(this);

    }    

}