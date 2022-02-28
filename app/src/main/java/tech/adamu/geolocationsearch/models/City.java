
package tech.adamu.geolocationsearch.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class City implements Serializable {

    @SerializedName("geonameid")
    @Expose
    private Integer geonameid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("population")
    @Expose
    private Integer population;

    /**
     * No args constructor for use in serialization
     * 
     */
    public City() {
    }

    /**
     * 
     * @param geonameid
     * @param name
     * @param population
     */
    public City(Integer geonameid, String name, Integer population) {
        super();
        this.geonameid = geonameid;
        this.name = name;
        this.population = population;
    }

    public Integer getGeonameid() {
        return geonameid;
    }

    public void setGeonameid(Integer geonameid) {
        this.geonameid = geonameid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

}
