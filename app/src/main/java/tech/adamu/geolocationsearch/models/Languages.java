
package tech.adamu.geolocationsearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Languages implements Serializable {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("es")
    @Expose
    private String es;
    @SerializedName("haw")
    @Expose
    private String haw;
    @SerializedName("fr")
    @Expose
    private String fr;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Languages() {
    }

    /**
     * 
     * @param en
     * @param fr
     * @param es
     * @param haw
     */
    public Languages(String en, String es, String haw, String fr) {
        super();
        this.en = en;
        this.es = es;
        this.haw = haw;
        this.fr = fr;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getHaw() {
        return haw;
    }

    public void setHaw(String haw) {
        this.haw = haw;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

}
