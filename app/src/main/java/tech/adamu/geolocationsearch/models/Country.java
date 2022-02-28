
package tech.adamu.geolocationsearch.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Country implements Serializable {

    @SerializedName("geonameid")
    @Expose
    private Integer geonameid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("capital")
    @Expose
    private String capital;
    @SerializedName("area_size")
    @Expose
    private String areaSize;
    @SerializedName("population")
    @Expose
    private Integer population;
    @SerializedName("phone_code")
    @Expose
    private String phoneCode;
    @SerializedName("is_in_eu")
    @Expose
    private Boolean isInEu;
    @SerializedName("languages")
    @Expose
    private Languages languages;
    @SerializedName("flag")
    @Expose
    private Flag flag;
    @SerializedName("tld")
    @Expose
    private String tld;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Country() {
    }

    /**
     * 
     * @param capital
     * @param code
     * @param flag
     * @param languages
     * @param geonameid
     * @param name
     * @param phoneCode
     * @param isInEu
     * @param tld
     * @param areaSize
     * @param population
     */
    public Country(Integer geonameid, String name, String code, String capital, String areaSize, Integer population, String phoneCode, Boolean isInEu, Languages languages, Flag flag, String tld) {
        super();
        this.geonameid = geonameid;
        this.name = name;
        this.code = code;
        this.capital = capital;
        this.areaSize = areaSize;
        this.population = population;
        this.phoneCode = phoneCode;
        this.isInEu = isInEu;
        this.languages = languages;
        this.flag = flag;
        this.tld = tld;
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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(String areaSize) {
        this.areaSize = areaSize;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public Boolean getIsInEu() {
        return isInEu;
    }

    public void setIsInEu(Boolean isInEu) {
        this.isInEu = isInEu;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public String getTld() {
        return tld;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }

}
