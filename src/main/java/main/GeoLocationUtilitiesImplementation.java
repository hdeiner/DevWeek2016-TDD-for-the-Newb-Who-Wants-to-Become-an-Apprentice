package main;

import us.monoid.web.JSONResource;
import us.monoid.web.Resty;

import java.net.URI;
import java.net.URL;

public class GeoLocationUtilitiesImplementation implements GeoLocationUtilitiesInterface {
    public double[] getLatLongFromPostalcode(String postalCode) {
        double[] results = new double[2];
        Resty r = new Resty();
        try {
            URL url = new URL("http://api.postcodes.io/postcodes/" + postalCode);
            URI uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
            JSONResource response = r.json(uri);
            results[0] = Double.parseDouble(response.get("result.latitude").toString());
            results[1] = Double.parseDouble(response.get("result.longitude").toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }

}