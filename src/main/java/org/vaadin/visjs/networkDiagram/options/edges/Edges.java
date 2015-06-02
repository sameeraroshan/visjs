package org.vaadin.visjs.networkDiagram.options.edges;

import org.vaadin.visjs.networkDiagram.util.Arrows;
import org.vaadin.visjs.networkDiagram.util.Color;
import org.vaadin.visjs.networkDiagram.util.Font;
import org.vaadin.visjs.networkDiagram.util.Scaling;

/**
 * Created by roshans on 10/29/14.
 */
public class Edges {

    private Arrows arrows = new Arrows();
    private Color color = new Color("#848484","#848484");
    private boolean dashes = false;
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



    /*private int arrowScaleFactor = 1;
    private int fontSize = 14;
    private int widthSelectionMultiplier = 2;
    private int widthMin =1;
    private int widthMax = 15;
    private String fontColor = "#343434";
    private String fontFace = "arial";
    private String fontFill = "white";
    private boolean inheritColor = false;
    private Edge.Style style= Edge.Style.arrow;
    private Dash dash;*/

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

    public boolean isDashes() {
        return dashes;
    }

    public void setDashes(boolean dashes) {
        this.dashes = dashes;
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



    /*@Deprecated
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

    public Dash getDash() {
        return dash;
    }

    public void setDash(Dash dash) {
        this.dash = dash;
    }*/




}
