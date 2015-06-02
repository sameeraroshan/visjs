package org.vaadin.visjs.networkDiagram.options.physics;

/**
 * Created by roshans on 10/29/14.
 */
public class Repulsion {


    int nodeDistance = 100;
    float centralGravity = 0.1f;
    int springLength = 50;
    float springConstant = 0.05f;
    float damping = 0.09f;

    public int getSpringLength() {
        return springLength;
    }

    public void setSpringLength(int springLength) {
        this.springLength = springLength;
    }

    public int getNodeDistance() {
        return nodeDistance;
    }

    public void setNodeDistance(int nodeDistance) {
        this.nodeDistance = nodeDistance;
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
