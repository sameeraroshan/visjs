package org.vaadin.visjs.graph3d.options;

/**
 * Created by roshans on 2/8/2015.
 */
public class CameraPosition {
    float horizontal = 1.0f;
    float vertical = 0.5f;
    float distance = 1.7f;

    public float getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(float horizontal) {
        this.horizontal = horizontal;
    }

    public float getVertical() {
        return vertical;
    }

    public void setVertical(float vertical) {
        this.vertical = vertical;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
}
