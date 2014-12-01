package org.vaadin.visjs.networkDiagram.event.node;

import org.json.JSONObject;
import org.vaadin.visjs.networkDiagram.api.Event;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by roshans on 11/30/14.
 */
public class DoubleClickEvent extends Event {
    private int DOMx = 0;
    private int DOMy = 0;
    private int canvasX = 0;
    private int canvasY = 0;

    public DoubleClickEvent(JSONArray properties) throws JSONException {
        super();
        JSONArray edges = properties.getJSONObject(0).getJSONArray("edges");
        JSONArray nodes = properties.getJSONObject(0).getJSONArray("nodes");
        JSONObject pointer = properties.getJSONObject(0).getJSONObject("pointer");
        JSONObject canvas = pointer.getJSONObject("canvas");
        JSONObject dom = pointer.getJSONObject("DOM");

        DOMy = dom.getInt("y");
        DOMx = dom.getInt("x");
        canvasX = canvas.getInt("x");
        canvasY = canvas.getInt("y");

        for (int i = 0; i < nodes.length(); i++) {
            getNodeIds().add(nodes.getInt(i));
        }
        for (int i = 0; i < nodes.length(); i++) {
            getEdgeIds().add(edges.getString(i));
        }
    }

    public int getCanvasY() {
        return canvasY;
    }

    public void setCanvasY(int canvasY) {
        this.canvasY = canvasY;
    }

    public int getCanvasX() {
        return canvasX;
    }

    public void setCanvasX(int canvasX) {
        this.canvasX = canvasX;
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
