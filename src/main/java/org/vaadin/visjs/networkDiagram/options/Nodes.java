package org.vaadin.visjs.networkDiagram.options;

import org.vaadin.visjs.networkDiagram.Color;
import org.vaadin.visjs.networkDiagram.Node;

/**
 * Created by roshans on 10/29/14.
 */
public class Nodes {

    int borderWidth = 1;
    int borderWidthSelected;
    Color color;
    String fontColor = "black";
    String fontFace  = "verdana";
    int fontSize = 14;
    String fontFill;
    Node.Shape shape = Node.Shape.ellipse;
    String image;
    String brokenImage;
    int mass = 1;
    int widthMin = 16;
    int widthMax = 64;
    int radius = 10;
    int radiusMin = 10;
    int radiusMax = 30;

    public int getRadiusMax() {
        return radiusMax;
    }

    public void setRadiusMax(int radiusMax) {
        this.radiusMax = radiusMax;
    }

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

    public String getFontFill() {
        return fontFill;
    }

    public void setFontFill(String fontFill) {
        this.fontFill = fontFill;
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

    public int getWidthMin() {
        return widthMin;
    }

    public void setWidthMin(int widthMin) {
        this.widthMin = widthMin;
    }

    public int getWidthMax() {
        return widthMax;
    }

    public void setWidthMax(int widthMax) {
        this.widthMax = widthMax;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadiusMin() {
        return radiusMin;
    }

    public void setRadiusMin(int radiusMin) {
        this.radiusMin = radiusMin;
    }
}
