package org.vaadin.visjs.networkDiagram;

/**
 * Created by roshans on 10/22/14.
 */
public class Color {

    private String hover;
    private String highlight = "#D2E5FF";
    private String border = "#2B7CE9";
    private String background = "#97C2FC";
    private String color = "#df6b1d";

    public Color() {
    }

    public Color(String backgroundColor) {
        this.background = backgroundColor;
    }

    public Color(String backgroundColor, String highlightColor) {
        this.background = backgroundColor;
        this.highlight = highlightColor;
    }

    public Color(String backgroundColor, String hoverColor, String highlightColor) {
        this.background = backgroundColor;
        this.highlight = highlightColor;
        this.hover = hoverColor;
    }

    public Color(String backgroundColor, String hoverColor, String highlightColor, String borderColor) {
        this.background = backgroundColor;
        this.hover = hoverColor;
        this.highlight = highlightColor;
        this.border = borderColor;
    }

    public String getHoverColor() {
        return hover;
    }

    public void setHoverColor(String hover) {
        this.hover = hover;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlightColor(String highlight) {
        this.highlight = highlight;
    }

    public String getBorderColor() {
        return border;
    }

    public void setBorderColor(String border) {
        this.border = border;
    }

    public String getBackgroundColor() {
        return background;
    }

    public void setBackgroundColor(String background) {
        this.background = background;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
