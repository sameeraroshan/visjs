package org.vaadin.visjs.networkDiagram.options.physics;

import org.vaadin.visjs.networkDiagram.options.physics.BarnesHut;
import org.vaadin.visjs.networkDiagram.options.physics.HierarchicalRepulsion;
import org.vaadin.visjs.networkDiagram.options.physics.Repulsion;

/**
 * Created by roshans on 10/29/14.
 */
public class Physics {

    private BarnesHut barnesHut;
    private ForceAtlas2Based forceAtlas2Based;
    private Repulsion repulsion;
    private HierarchicalRepulsion hierarchicalRepulsion;
    double maxVelocity = 50;
    double minVelocity = 0.1;
    Solver solver = Solver.barnesHut;
    Stabilization stabilization = new Stabilization();
    double timestep = 0.5;

    public BarnesHut getBarnesHut() {
        return barnesHut;
    }

    public void setBarnesHut(BarnesHut barnesHut) {
        this.barnesHut = barnesHut;
    }

    public Repulsion getRepulsion() {
        return repulsion;
    }

    public void setRepulsion(Repulsion repulsion) {
        this.repulsion = repulsion;
    }

    public HierarchicalRepulsion getHierarchicalRepulsion() {
        return hierarchicalRepulsion;
    }

    public void setHierarchicalRepulsion(HierarchicalRepulsion hierarchicalRepulsion) {
        this.hierarchicalRepulsion = hierarchicalRepulsion;
    }

    public static enum Solver{
        barnesHut,
        repulsion,
        hierarchicalRepulsion,
        forceAtlas2Based;
    }


    public ForceAtlas2Based getForceAtlas2Based() {
        return forceAtlas2Based;
    }

    public void setForceAtlas2Based(ForceAtlas2Based forceAtlas2Based) {
        this.forceAtlas2Based = forceAtlas2Based;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public double getMinVelocity() {
        return minVelocity;
    }

    public void setMinVelocity(double minVelocity) {
        this.minVelocity = minVelocity;
    }

    public Solver getSolver() {
        return solver;
    }

    public void setSolver(Solver solver) {
        this.solver = solver;
    }

    public Stabilization getStabilization() {
        return stabilization;
    }

    public void setStabilization(Stabilization stabilization) {
        this.stabilization = stabilization;
    }

    public double getTimestep() {
        return timestep;
    }

    public void setTimestep(double timestep) {
        this.timestep = timestep;
    }

}
