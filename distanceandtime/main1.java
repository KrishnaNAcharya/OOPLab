package distanceandtime;

public class main1 {
    public static void main(String[] args) {
        // Distance Conversion
        double meters = 5000;
        double kilometersFromMeters = distance.metersToKilometers(meters);
        System.out.println(meters + " meters is equal to " + kilometersFromMeters + " kilometers.");

        double miles = 10;
        double kilometersFromMiles = distance.milesToKilometers(miles);
        System.out.println(miles + " miles is equal to " + kilometersFromMiles + " kilometers.");

        // Time Conversion
        double hours = 2.5;
        double minutesFromHours = time.hoursToMinutes(hours);
        System.out.println(hours + " hours is equal to " + minutesFromHours + " minutes.");

        double seconds = 7200;
        double hoursFromSeconds = time.secondsToHours(seconds);
        System.out.println(seconds + " seconds is equal to " + hoursFromSeconds + " hours.");
    }
}
    