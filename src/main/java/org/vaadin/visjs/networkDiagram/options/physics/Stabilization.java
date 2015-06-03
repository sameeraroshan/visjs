package org.vaadin.visjs.networkDiagram.options.physics;

/**
 * Created by roshans on 6/1/2015.
 */
public class Stabilization {
    
    boolean enabled = true;
    int iterations = 10000;
    int updateInterval = 50;
    boolean onlyDynamicEdges = false;
    boolean fit = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public int getUpdateInterval() {
        return updateInterval;
    }

    public void setUpdateInterval(int updateInterval) {
        this.updateInterval = updateInterval;
    }

    public boolean isOnlyDynamicEdges() {
        return onlyDynamicEdges;
    }

    public void setOnlyDynamicEdges(boolean onlyDynamicEdges) {
        this.onlyDynamicEdges = onlyDynamicEdges;
    }

    public boolean isFit() {
        return fit;
    }

    public void setFit(boolean fit) {
        this.fit = fit;
    }

}
