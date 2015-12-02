package org.vaadin.visjs.networkDiagram.util;


import com.google.gson.annotations.SerializedName;

public class Font {

    private String color = "#343434";
    private int size = 14;
    private String face = "arial";
    private String background;
    private int strokeWidth = 2;
    private String strokeColor = "#ffffff";
   /* private Align align = Align.horizontal;

    enum Align{
        @SerializedName("horizontal")
        horizontal,
        @SerializedName("top")
        top,
        @SerializedName("middle")
        middle,
        @SerializedName("bottom")
        bottom
    }*/


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

}
