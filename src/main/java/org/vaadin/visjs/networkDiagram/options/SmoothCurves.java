package org.vaadin.visjs.networkDiagram.options;

import com.google.gson.annotations.SerializedName;

/**
 * Created by roshans on 10/29/14.
 */
public class SmoothCurves {

    boolean dynamic = true;
    Type type = Type.continuous;
    float roundness = 0.5f;

    public static enum Type {
        @SerializedName("continuous")
        continuous,
        @SerializedName("discrete")
        discrete,
        @SerializedName("straightCross")
        straightCross,
        @SerializedName("horizontal")
        horizontal,
        @SerializedName("vertical")
        vertical
    }

    public boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public float getRoundness() {
        return roundness;
    }

    public void setRoundness(float roundness) {
        this.roundness = roundness;
    }


}
