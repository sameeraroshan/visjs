package org.vaadin.visjs.networkDiagram.util;

/**
 * Created by roshans on 6/1/2015.
 */
public class Keyboard {

    private boolean enabled = false;
    private boolean bindToWindow = true;
    private Speed speed = new Speed();

    public static class Speed{
        int x = 1;
        int y = 1;
        double zoom = 0.02;

    }
}
