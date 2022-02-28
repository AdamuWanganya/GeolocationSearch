
package tech.adamu.geolocationsearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Time implements Serializable {

    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("gtm_offset")
    @Expose
    private Integer gtmOffset;
    @SerializedName("gmt_offset")
    @Expose
    private Integer gmtOffset;
    @SerializedName("is_daylight_saving")
    @Expose
    private Boolean isDaylightSaving;
    @SerializedName("code")
    @Expose
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Time() {
    }

    /**
     * 
     * @param code
     * @param isDaylightSaving
     * @param timezone
     * @param gmtOffset
     * @param gtmOffset
     */
    public Time(String timezone, Integer gtmOffset, Integer gmtOffset, Boolean isDaylightSaving, String code) {
        super();
        this.timezone = timezone;
        this.gtmOffset = gtmOffset;
        this.gmtOffset = gmtOffset;
        this.isDaylightSaving = isDaylightSaving;
        this.code = code;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Integer getGtmOffset() {
        return gtmOffset;
    }

    public void setGtmOffset(Integer gtmOffset) {
        this.gtmOffset = gtmOffset;
    }

    public Integer getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(Integer gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public Boolean getIsDaylightSaving() {
        return isDaylightSaving;
    }

    public void setIsDaylightSaving(Boolean isDaylightSaving) {
        this.isDaylightSaving = isDaylightSaving;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
