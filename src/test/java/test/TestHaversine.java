package test;

import main.Haversine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHaversine {

    @Test
    public void testDistanceBetweenNebraskaAndKansas() {
        Haversine haversine = new Haversine();
        double[] latLongPequannock = new double[] {40.959794, -74.297401};
        double[] latLongPaloAlto = new double[] {37.441986, -122.146682};
        double geoDistance = haversine.getDistanceBetweenTwoLatLongs(latLongPequannock, latLongPaloAlto);
        assertEquals(2540.0, geoDistance, 10.0);
    }

}