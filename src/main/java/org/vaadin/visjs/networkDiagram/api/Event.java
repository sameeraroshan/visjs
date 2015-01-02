package org.vaadin.visjs.networkDiagram.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roshans on 11/30/14.
 */
public abstract class Event {
    private List<String> nodeIds;
    private List<String> edgeIds;
    public Event(){
        nodeIds = new ArrayList<>();
        edgeIds = new ArrayList<>();
    }

    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public List<String> getEdgeIds() {
        return edgeIds;
    }

    public void setEdgeIds(List<String> edgeIds) {
        this.edgeIds = edgeIds;
    }
}

