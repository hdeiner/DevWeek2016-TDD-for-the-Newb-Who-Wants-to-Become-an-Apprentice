package main;

public class GeoLocationUtilitiesFake implements GeoLocationUtilitiesInterface {

	public double[] getLatLongFromPostalcode(String postalCode) {
		if (postalCode.equals("SW1A 1NJ")) {
			return new double[] {51.5059089138853, -0.140379565359194};
		}
		if (postalCode.equals("SW1H 9NH")) {
			return new double[] {51.4999994919247, -0.130116786932411};
		}
		if (postalCode.equals("OX1 2JD")) {
			return new double[] {51.7580400229174, -1.26201026426438};
		}
		return null;
	}
}
