
package tech.adamu.geolocationsearch.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class Continent implements Serializable {

    @SerializedName("geonameid")
    @Expose
    private Integer geonameid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Continent() {
    }

    /**
     * 
     * @param code
     * @param geonameid
     * @param name
     */
    public Continent(Integer geonameid, String name, String code) {
        super();
        this.geonameid = geonameid;
        this.name = name;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
