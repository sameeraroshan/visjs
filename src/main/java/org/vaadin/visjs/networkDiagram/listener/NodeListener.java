package org.vaadin.visjs.networkDiagram.listener;

import org.vaadin.visjs.networkDiagram.Node;

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
