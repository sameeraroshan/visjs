package org.vaadin.visjs.networkDiagram;

import org.vaadin.visjs.networkDiagram.options.edges.Dashes;
import com.google.gson.annotations.SerializedName;
import org.vaadin.visjs.networkDiagram.options.edges.Edges;
import org.vaadin.visjs.networkDiagram.util.Arrows;
import org.vaadin.visjs.networkDiagram.util.Color;

/**
 * Created by roshans on 10/10/14.
 */
public class Edge extends Edges {

    private String from;
    private String to;
    private String id;

    public Edge(int from, int to) {
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
    }

    public Edge(String from, String to) {
        this.from =  from;
        this.to = to ;
    }

    public Edge(int from, int to , int width) {
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setWidth(width);
    }

    public Edge(String from, String to , int width) {
        this.from =  from;
        this.to = to ;
        setWidth(width);
    }

    public Edge(int from,int to,Color color){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setColor(color);
    }

    public Edge(String from, String to,Color color){
        this.from =  from;
        this.to = to ;
        setColor(color);
    }

    public Edge(int from,int to,Color color,int width ){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setColor(color);
        setWidth(width);
    }

    public Edge(String from, String to,Color color,int width ){
        this.from =  from;
        this.to = to ;
        setColor(color);
        setWidth(width);
    }

    @Deprecated
    public Edge(int from,int to,Edge.Style style){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setStyle(style);
    }

    public Edge(int from,int to,Arrows arrows){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setArrows(arrows);
    }

    @Deprecated
    public Edge(String from, String to,Edge.Style style){
        this.from =  from;
        this.to = to ;
        setStyle(style);
    }


    public Edge(String from, String to,Arrows arrows){
        this.from =  from;
        this.to = to ;
        setArrows(arrows);
    }

    @Deprecated
    public Edge(int from,int to,Edge.Style style, int width){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setStyle(style);
        setWidth(width);
    }


    public Edge(int from,int to,Arrows arrows, int width){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setArrows(arrows);
        setWidth(width);
    }

    @Deprecated
    public Edge(String from, String to,Edge.Style style, int width){
        this.from =  from;
        this.to = to ;
        setStyle(style);
        setWidth(width);
    }


    public Edge(String from, String to,Arrows arrows, int width){
        this.from =  from;
        this.to = to ;
        setArrows(arrows);
        setWidth(width);
    }


    @Deprecated
    public Edge(int from,int to,Edge.Style style,Color color){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setStyle(style);
        setColor(color);
    }

    public Edge(int from,int to,Arrows arrows,Color color){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setArrows(arrows);
        setColor(color);
    }

    @Deprecated
    public Edge(String from, String to,Edge.Style style,Color color){
        this.from =  from;
        this.to = to ;
        setStyle(style);
        setColor(color);
    }


    public Edge(String from, String to,Arrows arrows,Color color){
        this.from =  from;
        this.to = to ;
        setArrows(arrows);
        setColor(color);
    }

    @Deprecated
    public Edge(int from,int to,Edge.Style style,Color color, int width ){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setStyle(style);
        setColor(color);
        setWidth(width);
    }

    public Edge(int from,int to,Arrows arrows,Color color, int width ){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setArrows(arrows);
        setColor(color);
        setWidth(width);
    }

    @Deprecated
    public Edge(String from, String to,Edge.Style style,Color color, int width ){
        this.from =  from;
        this.to = to ;
        setStyle(style);
        setColor(color);
        setWidth(width);
    }

    public Edge(String from, String to,Arrows arrows,Color color, int width ){
        this.from =  from;
        this.to = to ;
        setArrows(arrows);
        setColor(color);
        setWidth(width);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }


    public static enum Style {
        @SerializedName("line")
        line,
        @SerializedName("arrow")
        arrow,
        @SerializedName("arrow-center")
        arrowCenter,
        @SerializedName("dash-line")
        dashLine;
    }


    private void setStyle(Style style){
        Arrows arrows = getArrows();
        switch (style){
            case line:
                arrows.setLine();
                break;
            case arrow:
                arrows.setArrow();
                break;
            case arrowCenter:
                arrows.setArrowCenter();
                break;
            case dashLine:
                setDashes(true);
                break;
        }
    }
}
