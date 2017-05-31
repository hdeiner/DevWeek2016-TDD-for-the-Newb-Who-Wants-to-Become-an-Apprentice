package main;

public class Haversine {
    public double getDistanceBetweenTwoLatLongs(double[] latLong1, double[] latLong2) {
        double radiusOfEarthInMiles = 3959.0;

        double distance = 0.0;

        double latitude1 = latLong1[0];
        double longitude1 = latLong1[1];
        double latitude2 = latLong2[0];
        double longitude2 = latLong2[1];

        double deltaLatitude = Math.toRadians(latitude2 - latitude1);
        double deltaLongitude = Math.toRadians(longitude2 - longitude1);

        double latitude1Radians = Math.toRadians(latitude1);
        double latitude2Radians = Math.toRadians(latitude2);

        double a = Math.pow(Math.sin(deltaLatitude/2.0), 2.0) + Math.pow(Math.sin(deltaLongitude/2.0), 2.0) * Math.cos(latitude1Radians) * Math.cos(latitude2Radians);
        double c = 2 * Math.asin(Math.sqrt(a));

        distance = radiusOfEarthInMiles * c;

        return distance;
    }
}