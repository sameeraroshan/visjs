package org.vaadin.visjs.networkDiagram.event.node;

import org.vaadin.visjs.networkDiagram.Node;
import org.vaadin.visjs.networkDiagram.api.Event;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roshans on 11/30/14.
 */
public class SelectEvent extends Event {
    public SelectEvent(JSONArray properties) throws JSONException {
        super();
        JSONArray edges = properties.getJSONObject(0).getJSONArray("edges");
        JSONArray nodes = properties.getJSONObject(0).getJSONArray("nodes");
        for(int i = 0 ; i<nodes.length() ; i++ ){
            getNodeIds().add(nodes.getInt(i));
        }

        for(int i=0;i<edges.length();i++){
            getEdgeIds().add(edges.getString(i));
        }
    }

}
