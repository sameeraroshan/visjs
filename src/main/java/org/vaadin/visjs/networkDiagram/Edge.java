package org.vaadin.visjs.networkDiagram;

import com.google.gson.annotations.SerializedName;
import org.vaadin.visjs.networkDiagram.options.modules.Edges;
import org.vaadin.visjs.networkDiagram.util.Color;

/**
 * Created by roshans on 10/10/14.
 */
public class Edge extends Edges{

    private String id;
    private String from;
    private String to;

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

    public Edge(int from,int to,Edge.Style style){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
    }

    public Edge(String from, String to,Edge.Style style){
        this.from =  from;
        this.to = to ;
    }

    public Edge(int from,int to,Edge.Style style, int width){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setWidth(width);
    }
    public Edge(String from, String to,Edge.Style style, int width){
        this.from =  from;
        this.to = to ;
        setWidth(width);

    }

    public Edge(int from,int to,Edge.Style style,Color color){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setColor(color);
    }

    public Edge(String from, String to,Edge.Style style,Color color){
        this.from =  from;
        this.to = to ;
        setColor(color);
    }

    public Edge(int from,int to,Edge.Style style,Color color, int width ){
        this.from = Integer.toString(from);
        this.to =Integer.toString(to) ;
        setColor(color);
        setWidth(width);
    }

    public Edge(String from, String to,Edge.Style style,Color color, int width ){
        this.from =  from;
        this.to = to ;
        setColor(color);
        setWidth(width);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public enum Style {
        @SerializedName("line")
        line,
        @SerializedName("arrow")
        arrow,
        @SerializedName("arrow-center")
        arrowCenter,
        @SerializedName("dash-line")
        dashLine;
    }
}
