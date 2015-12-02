package org.vaadin.visjs.networkDiagram.listener;

import org.vaadin.visjs.networkDiagram.event.graph.NetworkEvent;

/**
 * Created by roshans on 11/25/14.
 */
public abstract class GraphListener {

    public abstract void onFired(NetworkEvent event);
}
