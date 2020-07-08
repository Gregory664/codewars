package codewars.kyu8;

public class GrassHopperWeather {
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32D) * (5D / 9.0);
    }
}
