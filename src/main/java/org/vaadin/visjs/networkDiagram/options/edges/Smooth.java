package org.vaadin.visjs.networkDiagram.options.edges;

import com.google.gson.annotations.SerializedName;

/**
 * Created by roshans on 6/1/2015.
 */
public class Smooth {

    private boolean enabled = true;
    private Type type = Type.dynamic;
    private double roundness = 0.5;

    public static  enum Type{
        @SerializedName("dynamic")
        dynamic,
        @SerializedName("continuous")
        continuous,
        @SerializedName("discrete")
        discrete,
        @SerializedName("diagonalCross")
        diagonalCross,
        @SerializedName("straightCross")
        straightCross,
        @SerializedName("horizontal")
        horizontal,
        @SerializedName("vertical")
        vertical,
        @SerializedName("curvedCW")
        curvedCW,
        @SerializedName("curvedCCW")
        curvedCCW;
    }


    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getRoundness() {
        return roundness;
    }

    public void setRoundness(double roundness) {
        this.roundness = roundness;
    }

}
