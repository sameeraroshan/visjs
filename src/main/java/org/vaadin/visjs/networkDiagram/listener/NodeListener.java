package org.vaadin.visjs.networkDiagram.listener;

import org.vaadin.visjs.networkDiagram.Node;
import org.vaadin.visjs.networkDiagram.api.Event;
import org.vaadin.visjs.networkDiagram.event.NetworkEvent;

/**
 * Created by roshans on 11/24/14.
 */
public abstract class NodeListener {
    Node node;

    public NodeListener(Node node){
        this.node = node;
    }

    public Node getNode(){
        return node;
    }
}
