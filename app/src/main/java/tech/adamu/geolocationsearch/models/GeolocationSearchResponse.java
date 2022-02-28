
package tech.adamu.geolocationsearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GeolocationSearchResponse implements Serializable {

    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("postcode")
    @Expose
    private String postcode;
    @SerializedName("area")
    @Expose
    private Area area;
    @SerializedName("asn")
    @Expose
    private Asn asn;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("continent")
    @Expose
    private Continent continent;
    @SerializedName("country")
    @Expose
    private Country country;
    @SerializedName("currency")
    @Expose
    private Currency currency;
    @SerializedName("security")
    @Expose
    private Security security;
    @SerializedName("time")
    @Expose
    private Time time;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeolocationSearchResponse() {
    }

    /**
     * 
     * @param area
     * @param continent
     * @param country
     * @param city
     * @param ip
     * @param postcode
     * @param type
     * @param security
     * @param location
     * @param currency
     * @param time
     * @param asn
     * @param status
     */
    public GeolocationSearchResponse(String ip, String type, Location location, String postcode, Area area, Asn asn, City city, Continent continent, Country country, Currency currency, Security security, Time time, String status) {
        super();
        this.ip = ip;
        this.type = type;
        this.location = location;
        this.postcode = postcode;
        this.area = area;
        this.asn = asn;
        this.city = city;
        this.continent = continent;
        this.country = country;
        this.currency = currency;
        this.security = security;
        this.time = time;
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Asn getAsn() {
        return asn;
    }

    public void setAsn(Asn asn) {
        this.asn = asn;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
