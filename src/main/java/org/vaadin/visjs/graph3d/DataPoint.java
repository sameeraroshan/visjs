package org.vaadin.visjs.graph3d;

/**
 * Created by roshans on 2/8/2015.
 */
public class DataPoint {

    int id;
    double x;
    double y;
    double z;
    double style;
    String filter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getStyle() {
        return style;
    }

    public void setStyle(double style) {
        this.style = style;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
