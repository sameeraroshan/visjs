package org.vaadin.visjs.networkDiagram.event.node;

import org.vaadin.visjs.networkDiagram.api.Event;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by roshans on 11/30/14.
 */
public class DragStartEvent extends Event {
    public DragStartEvent(JSONArray properties) throws JSONException {
        super();
        JSONArray nodes = properties.getJSONObject(0).getJSONArray("nodeIds");
        for (int i = 0; i < nodes.length(); i++) {
            getNodeIds().add(nodes.getString(i));
        }
    }
}
