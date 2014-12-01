package org.vaadin.visjs.networkDiagram.options.physics;

/**
 * Created by roshans on 10/29/14.
 */
public class BarnesHut {

    boolean enabled = true;

    int gravitationalConstant =  -2000;
    int springLength =  95;

    float centralGravity =  0.1f;
    float springConstant =  0.04f;
    float damping =  0.09f;


    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getGravitationalConstant() {
        return gravitationalConstant;
    }

    public void setGravitationalConstant(int gravitationalConstant) {
        this.gravitationalConstant = gravitationalConstant;
    }

    public int getSpringLength() {
        return springLength;
    }

    public void setSpringLength(int springLength) {
        this.springLength = springLength;
    }

    public float getCentralGravity() {
        return centralGravity;
    }

    public void setCentralGravity(float centralGravity) {
        this.centralGravity = centralGravity;
    }

    public float getSpringConstant() {
        return springConstant;
    }

    public void setSpringConstant(float springConstant) {
        this.springConstant = springConstant;
    }

    public float getDamping() {
        return damping;
    }

    public void setDamping(float damping) {
        this.damping = damping;
    }
}
