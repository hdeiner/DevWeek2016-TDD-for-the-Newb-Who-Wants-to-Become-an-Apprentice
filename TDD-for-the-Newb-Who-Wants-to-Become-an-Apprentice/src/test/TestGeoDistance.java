package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.GeoLocationUtilitiesImplementation;
import main.GeoLocationUtilitiesInterface;
import main.Haversine;

public class TestGeoDistance {
	private GeoLocationUtilitiesInterface geoLocationUtilities = new GeoLocationUtilitiesImplementation();
	private Haversine haversine = new Haversine();

	@Test
	public void testDistanceTheStaffordToCentralHallWestminster() {
		double[] geoTheStafford = geoLocationUtilities.getLatLongFromPostalcode("SW1A 1NJ");
		double[] geoCentralHallWestminster = geoLocationUtilities.getLatLongFromPostalcode("SW1H 9NH");
		double geoDistance = haversine.getDistanceBetweenTwoLatLongs(geoTheStafford, geoCentralHallWestminster);
		assertEquals(0.6013151371706834, geoDistance, 0.1);  
	}

	@Test
	public void testDistanceCentralHallWestministerToOxfordUniversity() {
		double[] geoCentralHallWestminster = geoLocationUtilities.getLatLongFromPostalcode("SW1H 9NH");
		double[] geoOxfordUniversity = geoLocationUtilities.getLatLongFromPostalcode("OX1 2JD");
		double geoDistance = haversine.getDistanceBetweenTwoLatLongs(geoCentralHallWestminster, geoOxfordUniversity);
		assertEquals(51.719454539079884, geoDistance, 0.1);
	}

}
