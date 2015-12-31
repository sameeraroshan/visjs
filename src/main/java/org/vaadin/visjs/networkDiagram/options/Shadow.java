package org.vaadin.visjs.networkDiagram.options;

public class Shadow {


    /*
        Toggle the casting of shadows. If this option is not defined,
        it is set to true if any of the properties in this object are defined.
         */
    private boolean enabled = false;
    /*
    The blur size of the shadow.
     */
    private int size = 10;
    /*
    The x offset.
     */
    private int x = 5;
    /*
    The y offset.
     */
    private int y = 5;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

}
