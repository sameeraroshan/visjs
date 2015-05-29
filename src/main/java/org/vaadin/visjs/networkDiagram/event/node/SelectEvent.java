package org.vaadin.visjs.networkDiagram.event.node;

import org.vaadin.visjs.networkDiagram.Node;
import org.vaadin.visjs.networkDiagram.api.Event;
import elemental.json.JsonArray;
import elemental.json.JsonException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roshans on 11/30/14.
 */
public class SelectEvent extends Event {
    public SelectEvent(JsonArray properties) throws JsonException {
        super();
        JsonArray edges = properties.getObject(0).getArray("edges");
        JsonArray nodes = properties.getObject(0).getArray("nodes");
        for(int i = 0 ; i<nodes.length() ; i++ ){
            getNodeIds().add(nodes.getString(i));
        }

        for(int i=0;i<edges.length();i++){
            getEdgeIds().add(edges.getString(i));
        }
    }

}
