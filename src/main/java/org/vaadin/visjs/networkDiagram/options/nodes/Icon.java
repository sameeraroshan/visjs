package org.vaadin.visjs.networkDiagram.options.nodes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by roshans on 6/1/2015.
 */
public class Icon {
    Face face = Face.FontAwesome; //These options are only used when the shape is set to icon. The possible options for the face are: 'FontAwesome' and 'Ionicons'
    String code ; //This is the code of the icon, for example '\uf007'.
    int size = 50; //The size of the icon.
    String color = "#2B7CE9"; //The color of the icon.

    public static enum Face{
        @SerializedName("FontAwesome")
        FontAwesome,
        @SerializedName("Ionicons")
        Ionicons;
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
