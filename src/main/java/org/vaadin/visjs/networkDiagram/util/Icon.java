package org.vaadin.visjs.networkDiagram.util;


import com.google.gson.annotations.SerializedName;

public class Icon {
    private Face face = Face.FontAwesome;
    private String code;
    private int size = 50;
    private String color = "#2B7CE9";

    public enum Face{
        @SerializedName("FontAwesome")
        FontAwesome,
        @SerializedName("Ionicons")
        Ionicons
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
