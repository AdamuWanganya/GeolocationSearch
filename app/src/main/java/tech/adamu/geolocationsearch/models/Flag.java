
package tech.adamu.geolocationsearch.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Flag implements Serializable {

    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("emoji")
    @Expose
    private String emoji;
    @SerializedName("unicode")
    @Expose
    private String unicode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Flag() {
    }

    /**
     * 
     * @param file
     * @param emoji
     * @param unicode
     */
    public Flag(String file, String emoji, String unicode) {
        super();
        this.file = file;
        this.emoji = emoji;
        this.unicode = unicode;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

}
