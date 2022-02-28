
package tech.adamu.geolocationsearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Security implements Serializable {

    @SerializedName("is_tor")
    @Expose
    private Boolean isTor;
    @SerializedName("is_proxy")
    @Expose
    private Boolean isProxy;
    @SerializedName("is_crawler")
    @Expose
    private Boolean isCrawler;
    @SerializedName("is_threat")
    @Expose
    private Boolean isThreat;
    @SerializedName("is_thread")
    @Expose
    private Boolean isThread;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Security() {
    }

    /**
     * 
     * @param isTor
     * @param isThreat
     * @param isThread
     * @param isCrawler
     * @param isProxy
     */
    public Security(Boolean isTor, Boolean isProxy, Boolean isCrawler, Boolean isThreat, Boolean isThread) {
        super();
        this.isTor = isTor;
        this.isProxy = isProxy;
        this.isCrawler = isCrawler;
        this.isThreat = isThreat;
        this.isThread = isThread;
    }

    public Boolean getIsTor() {
        return isTor;
    }

    public void setIsTor(Boolean isTor) {
        this.isTor = isTor;
    }

    public Boolean getIsProxy() {
        return isProxy;
    }

    public void setIsProxy(Boolean isProxy) {
        this.isProxy = isProxy;
    }

    public Boolean getIsCrawler() {
        return isCrawler;
    }

    public void setIsCrawler(Boolean isCrawler) {
        this.isCrawler = isCrawler;
    }

    public Boolean getIsThreat() {
        return isThreat;
    }

    public void setIsThreat(Boolean isThreat) {
        this.isThreat = isThreat;
    }

    public Boolean getIsThread() {
        return isThread;
    }

    public void setIsThread(Boolean isThread) {
        this.isThread = isThread;
    }

}
