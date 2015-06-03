package org.vaadin.visjs.networkDiagram.util;

/**
 * Created by roshans on 5/31/2015.
 */
public class Arrows {
    private Settings to;
    private Settings middle;
    private Settings from;

    public static class Settings{
        private boolean enabled = true;
        private double scaleFactor = 1;
    }

    public Settings getMiddle() {
        return middle;
    }

    public void setMiddle(Settings middle) {
        this.middle = middle;
    }

    public Settings getTo() {
        return to;
    }

    public void setTo(Settings to) {
        this.to = to;
    }

    public Settings getFrom() {
        return from;
    }

    public void setFrom(Settings from) {
        this.from = from;
    }
}
