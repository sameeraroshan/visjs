package org.vaadin.visjs.networkDiagram.event.node;

import org.vaadin.visjs.networkDiagram.api.Event;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by roshans on 11/30/14.
 */
public class BlurEvent extends Event {
    public BlurEvent(JSONArray properties) throws JSONException {
        super();
        int nodeID = properties.getJSONObject(0).getInt("node");
        getNodeIds().add(nodeID);
    }
}
