package org.vaadin.visjs.networkDiagram.options.physics;

/**
 * Created by roshans on 10/29/14.
 */
public class BarnesHut {

    int gravitationalConstant =  -2000;
    float centralGravity =  0.3f;
    int springLength =  95;
    float damping =  0.09f;
    float springConstant =  0.04f;
    /*
    Accepted range: [0 .. 1]. When larger than 0, the size of the node is taken into account.
    The distance will be calculated from the radius of the encompassing circle of the node for both the gravity model.
     Value 1 is maximum overlap avoidance.
     */
    double avoidOverlap = 0.5;

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

    public double getAvoidOverlap() {
        return avoidOverlap;
    }

    public void setAvoidOverlap(double avoidOverlap) {
        this.avoidOverlap = avoidOverlap;
    }

}
