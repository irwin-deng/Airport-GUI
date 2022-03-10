/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irwin
 */
public class BaseAirport {
    private String name = "blank";
    private double latitude = -999;
    private double longitude = -999;
    private double elevation = -999;
    private String country = "blank";
    private String municipality = "blank";
    private String iata = "blank";
    
    public BaseAirport(String name, double latitude, double longitude, double elevation, String country, String municipality, String iata) {
        if(name!=null)
            this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.country = country;
        this.municipality = municipality;
        this.iata = iata;
    }
    
    public String getName() {
        return name;
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public double getLongitude() {
        return longitude;
    }

    public double getElevation() {
        return elevation;
    }
    
    public String getCountry() {
        return country;
    }
    
    public String getMunicipality() {
        return municipality;
    }
    
    public String getIata() {
        return iata;
    }
}
