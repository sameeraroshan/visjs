package org.vaadin.visjs.networkDiagram.options.physics;

/**
 * Created by roshans on 10/29/14.
 */
public class Physics {

    private BarnesHut barnesHut;
    private Repulsion repulsion;
    private HierarchicalRepulsion hierarchicalRepulsion;

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


}
