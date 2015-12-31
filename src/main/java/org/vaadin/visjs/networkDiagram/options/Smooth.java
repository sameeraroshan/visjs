package org.vaadin.visjs.networkDiagram.options;

import com.google.gson.annotations.SerializedName;

/*
When true, the edge is drawn as a dynamic quadratic bezier curve. The drawing of these curves takes longer than
that of straight curves but it looks better.
There is a difference between dynamic smooth curves and static smooth curves. The dynamic smooth curves
have an invisible support node that takes part in the physics simulation. If you have a lot of edges,
you may want to consider picking a different type of smooth curves than dynamic for better performance.
 */
public class Smooth {

    private boolean enabled =  true;
    private Type type = Type.dynamic;
    /*
    Accepted range: 0 .. 1.0
    This parameter tweaks the roundness of the smooth curves for all types EXCEPT dynamic.
     */
    private float roundness =  0.5f;


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

    public float getRoundness() {
        return roundness;
    }

    public void setRoundness(float roundness) {
        this.roundness = roundness;
    }

    /*
    Possible options: 'dynamic',
     'continuous', 'discrete',
     'diagonalCross', 'straightCross',
     'horizontal', 'vertical', 'curvedCW',
     'curvedCCW', 'cubicBezier'.
      Take a look at VISjs example 26 to see what these look like and pick the one that you like best!
    When using dynamic, the edges will have an invisible support node guiding the shape.
    This node is part of the physics simulation.
     */
    public enum Type{
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
        curvedCCW,
        @SerializedName("cubicBezier")
        cubicBezier
    }
}
