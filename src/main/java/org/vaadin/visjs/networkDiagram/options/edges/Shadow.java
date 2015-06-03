package org.vaadin.visjs.networkDiagram.options.edges;

/**
 * Created by roshans on 6/1/2015.
 */
public class Shadow {

    private boolean enabled = false; //Toggle the casting of shadows. If this option is not defined, it is set to true if any of the properties in this object are defined.
    private int size = 10; //The blur size of the shadow.
    private int x = 5; //The x offset.
    private int y = 5;  //The y offset.

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
