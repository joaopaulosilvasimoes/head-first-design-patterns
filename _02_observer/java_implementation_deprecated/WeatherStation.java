package _02_observer.java_implementation_deprecated;

public class WeatherStation {
    
    public static void main(String[] args){

        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();

        CurrentConditionsObserverDisplay currentConditionsObserverDisplay = new CurrentConditionsObserverDisplay(weatherDataObservable);
        WeatherStatsObserverDisplay weatherStatsObserverDisplay = new WeatherStatsObserverDisplay(weatherDataObservable);
        // Add many others displays.

        weatherDataObservable.setMeasurements(80, 65, 30.4f);

        weatherDataObservable.setMeasurements(82, 70, 29.2f);

        weatherDataObservable.setMeasurements(78, 90, 29.2f);

    }

}
