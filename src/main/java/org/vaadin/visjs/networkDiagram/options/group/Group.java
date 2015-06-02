package org.vaadin.visjs.networkDiagram.options.group;

import org.vaadin.visjs.networkDiagram.util.Color;
import org.vaadin.visjs.networkDiagram.Node;

/**
 * Created by roshans on 10/29/14.
 */
public class Group {

    private Color color;
    private String image;
    private String fontColor = "black";
    private String fontFace = "sans";
    private int fontSize = 14;
    private Node.Shape shape = Node.Shape.ellipse;
    private int radius = 5;
    private int borderWidth = 3;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontFace() {
        return fontFace;
    }

    public void setFontFace(String fontFace) {
        this.fontFace = fontFace;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public Node.Shape getShape() {
        return shape;
    }

    public void setShape(Node.Shape shape) {
        this.shape = shape;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
