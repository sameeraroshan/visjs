package org.vaadin.visjs.networkDiagram.options.physics;

/**
 * Created by roshans on 6/1/2015.
 */
public class ForceAtlas2Based {


    private int gravitationalConstant = -50;
    private double centralGravity = 0.01;
    private int springLength = 100;
    private double springConstant = 0.08;
    private double damping = 0.4;
    private double avoidOverlap = 0;


    public int getGravitationalConstant() {
        return gravitationalConstant;
    }

    public void setGravitationalConstant(int gravitationalConstant) {
        this.gravitationalConstant = gravitationalConstant;
    }

    public double getCentralGravity() {
        return centralGravity;
    }

    public void setCentralGravity(double centralGravity) {
        this.centralGravity = centralGravity;
    }

    public int getSpringLength() {
        return springLength;
    }

    public void setSpringLength(int springLength) {
        this.springLength = springLength;
    }

    public double getSpringConstant() {
        return springConstant;
    }

    public void setSpringConstant(double springConstant) {
        this.springConstant = springConstant;
    }

    public double getDamping() {
        return damping;
    }

    public void setDamping(double damping) {
        this.damping = damping;
    }

    public double getAvoidOverlap() {
        return avoidOverlap;
    }

    public void setAvoidOverlap(double avoidOverlap) {
        this.avoidOverlap = avoidOverlap;
    }
}
