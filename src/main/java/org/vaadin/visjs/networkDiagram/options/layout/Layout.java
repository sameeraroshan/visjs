package org.vaadin.visjs.networkDiagram.options.layout;

/**
 * Created by roshans on 6/1/2015.
 */
public class Layout {
    // When NOT using the hierarchical layout, the nodes are randomly positioned initially.
    // This means that the settled result is different every time. If you provide a random seed manually, the layout will be the same every time.
    // Ideally you try with an undefined seed, reload until you are happy with the layout and use the getSeed() method to ascertain the seed.
    private int randomSeed ;
    private HierarchicalLayout hierarchical;

    public HierarchicalLayout getHierarchical() {
        return hierarchical;
    }

    public void setHierarchical(HierarchicalLayout hierarchical) {
        this.hierarchical = hierarchical;
    }

    public int getRandomSeed() {
        return randomSeed;
    }

    public void setRandomSeed(int randomSeed) {
        this.randomSeed = randomSeed;
    }

}
