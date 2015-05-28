package org.vaadin.visjs.networkDiagram.event.node;

import org.vaadin.visjs.networkDiagram.api.Event;
import elemental.json.JsonArray;
import elemental.json.JsonException;
import elemental.json.JsonObject;

/**
 * Created by roshans on 11/30/14.
 */
public class HoverEvent extends Event {
    public HoverEvent(JsonArray properties) throws JsonException {
        super();
        String nodeID = properties.getObject(0).getString("node");
        getNodeIds().add(nodeID);
    }
}
