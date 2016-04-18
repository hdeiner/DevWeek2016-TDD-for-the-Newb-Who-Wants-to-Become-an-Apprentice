package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.GeoLocationUtilitiesInterface;
import main.GeoLocationUtilitiesImplementation;

public class TestGeoLocationUtilities {

	private GeoLocationUtilitiesInterface geoLocationUtilities = new GeoLocationUtilitiesImplementation();

	@Test
	public void testLatLongForTheStafford() {
		double[] geoTheStafford = new double[2];
		geoTheStafford = geoLocationUtilities.getLatLongFromPostalcode("SW1A 1NJ");
		assertArrayEquals(new double[] {51.5059089138853, -0.140379565359194}, geoTheStafford, 0.1);
	}

	@Test
	public void testLatLongForCentralHallWestminster() {
		double[] geoCentralHallWestminster = geoLocationUtilities.getLatLongFromPostalcode("SW1H 9NH");
		assertArrayEquals(new double[] {51.4999994919247, -0.130116786932411}, geoCentralHallWestminster, 0.1);
	}

	@Test
	public void testLatLongForOxfordUniversity() {
		double[] geoOxfordUniversity = geoLocationUtilities.getLatLongFromPostalcode("OX1 2JD");
		assertArrayEquals(new double[] {51.7580400229174, -1.26201026426438}, geoOxfordUniversity, 0.1);
	}
}
