
package tech.adamu.geolocationsearch.models;


import android.content.SharedPreferences;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class Asn implements Serializable {

    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("organisation")
    @Expose
    private String organisation;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Asn() {
    }

    /**
     * 
     * @param number
     * @param organisation
     */
    public Asn(Integer number, String organisation) {
        super();
        this.number = number;
        this.organisation = organisation;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

}
