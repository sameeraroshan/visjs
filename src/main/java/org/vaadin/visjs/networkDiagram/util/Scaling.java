package org.vaadin.visjs.networkDiagram.util;

/**
 * Created by roshans on 6/1/2015.
 */
public class Scaling {
    int min = 1;
    int max = 15;
    String customScalingFunction;
    Label label = new Label();


    public static class Label{
        boolean enabled = false;
        int min = 1;
        int max = 15;
        int maxVisible = 30;
        int drawThreshold = 5;
    }

}
