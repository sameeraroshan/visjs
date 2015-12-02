package org.vaadin.visjs.networkDiagram.event.graph;

import org.vaadin.visjs.networkDiagram.Edge;
import org.vaadin.visjs.networkDiagram.Node;

/**
 * Created by roshans on 11/24/14.
 */
public class NetworkEvent {

    int nodeID;
    Node node;
    Edge edge;
    int DOMx = 0;
    int DOMy = 0;
    int canvasX = 0;
    int canvasY = 0;

    public int getNodeID() {
        return nodeID;
    }

    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Edge getEdge() {
        return edge;
    }

    public void setEdge(Edge edge) {
        this.edge = edge;
    }

    public NetworkEvent(){

    }

    public NetworkEvent(Node node){
        this.node = node;
    }

    public NetworkEvent(Edge edge){
        this.edge = edge;
    }

    public Node getNode(){
       return node;
    }

    public Edge edge(){
        return edge;
    }

    public int getCanvasX() {
        return canvasX;
    }

    public void setCanvasX(int canvasX) {
        this.canvasX = canvasX;
    }

    public int getCanvasY() {
        return canvasY;
    }

    public void setCanvasY(int canvasY) {
        this.canvasY = canvasY;
    }

    public int getDOMy() {
        return DOMy;
    }

    public void setDOMy(int DOMy) {
        this.DOMy = DOMy;
    }

    public int getDOMx() {
        return DOMx;
    }

    public void setDOMx(int DOMx) {
        this.DOMx = DOMx;
    }
}
