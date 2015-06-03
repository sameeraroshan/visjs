package org.vaadin.visjs.networkDiagram.options.edges;

import org.vaadin.visjs.networkDiagram.util.Arrows;
import org.vaadin.visjs.networkDiagram.util.Color;
import org.vaadin.visjs.networkDiagram.util.Font;
import org.vaadin.visjs.networkDiagram.util.Scaling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roshans on 10/29/14.
 */
public class Edges {

    private Arrows arrows = new Arrows();
    private Color color = new Color("#848484","#848484");
    //private List<Dashes> dashes = new ArrayList<>();
    private boolean dashes;
    private Font font = new Font();
    private boolean hidden = false;
    private float hoverWidth = 0.5f;
    private String label;
    private int length;
    private boolean physics;
    private Scaling scaling = new Scaling();
    private int selectionWidth =1;
    private int selfReferenceSize;
    private Shadow shadow = new Shadow();
    private Smooth smooth = new Smooth();
    private String title;
    private int value;
    private int width = 1;

    public float getHoverWidth() {
        return hoverWidth;
    }

    public void setHoverWidth(float hoverWidth) {
        this.hoverWidth = hoverWidth;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Arrows getArrows() {
        return arrows;
    }

    public void setArrows(Arrows arrows) {
        this.arrows = arrows;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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

    public int getSelectionWidth() {
        return selectionWidth;
    }

    public void setSelectionWidth(int selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public int getSelfReferenceSize() {
        return selfReferenceSize;
    }

    public void setSelfReferenceSize(int selfReferenceSize) {
        this.selfReferenceSize = selfReferenceSize;
    }

    public Shadow getShadow() {
        return shadow;
    }

    public void setShadow(Shadow shadow) {
        this.shadow = shadow;
    }

    public Smooth getSmooth() {
        return smooth;
    }

    public void setSmooth(Smooth smooth) {
        this.smooth = smooth;
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

    /*public List<Dashes> getDashes() {
        return dashes;
    }

    public void setDashes(List<Dashes> dashes) {
        this.dashes = dashes;
    }*/

    public boolean isDashes() {
        return dashes;
    }

    public void setDashes(boolean dashes) {
        this.dashes = dashes;
    }

}
