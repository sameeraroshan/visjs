package org.vaadin.visjs.networkDiagram.options.nodes;

import org.vaadin.visjs.networkDiagram.util.Color;
import org.vaadin.visjs.networkDiagram.options.edges.Shadow;
import org.vaadin.visjs.networkDiagram.util.Font;
import org.vaadin.visjs.networkDiagram.Node;
import org.vaadin.visjs.networkDiagram.util.Scaling;

/**
 * Created by roshans on 10/29/14.
 */
public class Nodes {

    private int borderWidth = 1;
    private int borderWidthSelected;
    private String brokenImage;
    private Color color;
    private Font font =  new Font();
    private String group;
    private boolean hidden = false;
    private Icon icon = new Icon();
    private String image;
    private String label;
    private int level;   //When using the hierarchical layout, the level determines where the node is going to be positioned.
    private int mass = 1; //The barnesHut physics model (which is enabled by default) is based on an inverted gravity model.
                    // By increasing the mass of a node, you increase it's repulsion. Values lower than 1 are not recommended.
    private boolean physics = true;   //When false, the node is not part of the physics simulation. It will not move except for from manual dragging.
    private Scaling scaling = new Scaling();
    private Shadow shadow = new Shadow();
    private Node.Shape shape = Node.Shape.ellipse;
    private int size = 25;   //The size is used to determine the size of node shapes that do not have the label inside of them. These shapes are: image, circularImage, diamond, dot, star, triangle, triangleDown, square and icon
    private String title;  //Title to be displayed when the user hovers over the node. The title can be an HTML element or a string containing plain text or HTML.
    private int value;    //When a value is set, the nodes will be scaled using the options in the scaling object defined above.

    /*int x;  //This gives a node an initial x position. When using the hierarchical layout, either the x or y position is set by the layout engine depending on the type of view.
            // The other value remains untouched. When using stabilization, the stabilized position may be different from the initial one.
             // To lock the node to that position use the physics or fixed options.
    int y; //This gives a node an initial y position. When using the hierarchical layout, either the x or y position is set by the layout engine depending on the type of view.
            // The other value remains untouched.
            // When using stabilization, the stabilized position may be different from the initial one. To lock the node to that position use the physics or fixed options.*/

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public int getBorderWidthSelected() {
        return borderWidthSelected;
    }

    public void setBorderWidthSelected(int borderWidthSelected) {
        this.borderWidthSelected = borderWidthSelected;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Node.Shape getShape() {
        return shape;
    }

    public void setShape(Node.Shape shape) {
        this.shape = shape;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        setShape(Node.Shape.image);
        this.image = image;
    }

    public String getBrokenImage() {
        return brokenImage;
    }

    public void setBrokenImage(String brokenImage) {
        this.brokenImage = brokenImage;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }


    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isPhysics() {
        return physics;
    }

    public void setPhysics(boolean physics) {
        this.physics = physics;
    }

    public Scaling getScaling() {
        return scaling;
    }

    public void setScaling(Scaling scaling) {
        this.scaling = scaling;
    }

    public Shadow getShadow() {
        return shadow;
    }

    public void setShadow(Shadow shadow) {
        this.shadow = shadow;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /*public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }*/

}
