package _02_observer.self_implementation;

public class WeatherStation {
    
    public static void main(String[] args){

        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();

        CurrentConditionsObserverDisplay currentConditionsObserverDisplay = new CurrentConditionsObserverDisplay(weatherDataSubject);
        WeatherStatsObserverDisplay weatherStatsObserverDisplay = new WeatherStatsObserverDisplay(weatherDataSubject);
        // Add many others displays.

        weatherDataSubject.setMeasurements(80, 65, 30.4f);

        weatherDataSubject.setMeasurements(82, 70, 29.2f);

        weatherDataSubject.setMeasurements(78, 90, 29.2f);

        // One way remove observer.
        weatherDataSubject.removeObserver(currentConditionsObserverDisplay);

        weatherDataSubject.setMeasurements(100, 50, 35f);

        // One way remove observer.
        weatherStatsObserverDisplay.removeMeFromSubject();

        weatherDataSubject.setMeasurements(78, 90, 29.2f);

    }

}
