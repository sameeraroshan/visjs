package org.vaadin.visjs.networkDiagram.event.node;

import org.vaadin.visjs.networkDiagram.api.Event;
import elemental.json.JsonArray;
import elemental.json.JsonException;
import elemental.json.JsonObject;

/**
 * Created by roshans on 11/30/14.
 */
public class ClickEvent extends Event {

    private int DOMx = 0;
    private int DOMy = 0;
    private int canvasX = 0;
    private int canvasY = 0;

    public ClickEvent(JsonArray properties) throws JsonException {
        super();
        JsonArray edges = properties.getObject(0).getArray("edges");
        JsonArray nodes = properties.getObject(0).getArray("nodes");
        JsonObject pointer = properties.getObject(0).getObject("pointer");
        JsonObject canvas = pointer.getObject("canvas");
        JsonObject dom = pointer.getObject("DOM");

        /*
         DOMy = dom.getInt("y");
         DOMx = dom.getInt("x");
         canvasX = canvas.getInt("x");
         canvasY = canvas.getInt("y");
         */
        DOMy = (int) dom.getNumber("y");
        DOMx = (int) dom.getNumber("x");
        canvasX = (int) canvas.getNumber("x");
        canvasY = (int) canvas.getNumber("y");

        for (int i = 0; i < nodes.length(); i++) {
            getNodeIds().add(nodes.getString(i));
        }

        for (int i = 0; i < edges.length(); i++) {
            getEdgeIds().add(edges.getString(i));
        }
    }

    public int getDOMx() {
        return DOMx;
    }

    public void setDOMx(int DOMx) {
        this.DOMx = DOMx;
    }

    public int getDOMy() {
        return DOMy;
    }

    public void setDOMy(int DOMy) {
        this.DOMy = DOMy;
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

}
