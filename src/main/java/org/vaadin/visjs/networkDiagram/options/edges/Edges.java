package org.vaadin.visjs.networkDiagram.options.edges;

import org.vaadin.visjs.networkDiagram.Color;
import org.vaadin.visjs.networkDiagram.Edge;

/**
 * Created by roshans on 10/29/14.
 */
public class Edges {

    private float hoverWidth = 1.5f;

    private int arrowScaleFactor = 1;
    private int fontSize = 14;
    private int width = 1;
    private int widthSelectionMultiplier = 2;
    private int widthMin =1;
    private int widthMax = 15;

    private String fontColor = "#343434";
    private String fontFace = "arial";
    private String fontFill = "white";

    private boolean inheritColor = false;

    private Edge.Style style= Edge.Style.arrow;
    private Color color = new Color("#848484","#848484");
    private Dash dash;

    public float getHoverWidth() {
        return hoverWidth;
    }

    public void setHoverWidth(float hoverWidth) {
        this.hoverWidth = hoverWidth;
    }

    public int getArrowScaleFactor() {
        return arrowScaleFactor;
    }

    public void setArrowScaleFactor(int arrowScaleFactor) {
        this.arrowScaleFactor = arrowScaleFactor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidthSelectionMultiplier() {
        return widthSelectionMultiplier;
    }

    public void setWidthSelectionMultiplier(int widthSelectionMultiplier) {
        this.widthSelectionMultiplier = widthSelectionMultiplier;
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

    public String getFontFill() {
        return fontFill;
    }

    public void setFontFill(String fontFill) {
        this.fontFill = fontFill;
    }

    public boolean isInheritColor() {
        return inheritColor;
    }

    public void setInheritColor(boolean inheritColor) {
        this.inheritColor = inheritColor;
    }

    public Edge.Style getStyle() {
        return style;
    }

    public void setStyle(Edge.Style style) {
        this.style = style;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Dash getDash() {
        return dash;
    }

    public void setDash(Dash dash) {
        this.dash = dash;
    }
}
