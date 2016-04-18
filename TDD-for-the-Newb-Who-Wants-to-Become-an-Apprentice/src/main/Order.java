package main;

import main.GeoLocationUtilitiesImplementation;

public class Order {
	private Merchant merchant;
	private Customer customer;
	
	public Order(Merchant merchant, Customer customer) {
		this.merchant = merchant;
		this.customer = customer;
	}
	
	public double getMerchantToCustomerDistance() {
		GeoLocationUtilitiesImplementation geoLocationUtilities = new GeoLocationUtilitiesImplementation();
		double[] latLongMerchant = new double[2];
		latLongMerchant = geoLocationUtilities.getLatLongFromPostalcode(merchant.getPostalCode().getPostalCodeCharacters());
		double[] latLongCustomer = new double[2];
		latLongCustomer = geoLocationUtilities.getLatLongFromPostalcode(customer.getPostalCode().getPostalCodeCharacters());
		
		Haversine haversine = new Haversine();
		return haversine.getDistanceBetweenTwoLatLongs(latLongMerchant, latLongCustomer);
	}
}
