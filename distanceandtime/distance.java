package distanceandtime;

public class distance {
    
    public static double metersToKilometers(double meters) {
        return meters / 1000.0;
    }

    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000.0;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}
