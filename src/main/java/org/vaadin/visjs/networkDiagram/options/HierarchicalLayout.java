package org.vaadin.visjs.networkDiagram.options;

/**
 * Created by roshans on 11/4/14.
 */
public class HierarchicalLayout {

    private boolean enabled = true;
    private int levelSeparation = 100;
    private int nodeSpacing = 100;
    private Direction direction = Direction.UD;
    private Layout layout = Layout.hubsize;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getLevelSeparation() {
        return levelSeparation;
    }

    public void setLevelSeparation(int levelSeparation) {
        this.levelSeparation = levelSeparation;
    }

    public int getNodeSpacing() {
        return nodeSpacing;
    }

    public void setNodeSpacing(int nodeSpacing) {
        this.nodeSpacing = nodeSpacing;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public static enum Direction {
        UD,
        DU,
        LR,
        RL;
    }

    public static enum  Layout{
        hubsize,
        direction;
    }
}
