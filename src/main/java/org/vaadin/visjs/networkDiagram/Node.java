package org.vaadin.visjs.networkDiagram;

import com.google.gson.annotations.SerializedName;
import org.vaadin.visjs.networkDiagram.event.node.*;
import org.vaadin.visjs.networkDiagram.listener.NodeListener;
import org.vaadin.visjs.networkDiagram.options.modules.Nodes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by roshans on 10/10/14.
 */
public class Node extends Nodes {

    private String id;
    private transient List<Edge> edgeList = new ArrayList<>();
    private transient Map<String, Edge> edgeMap = new HashMap<>();

    public Node(int id){
        this.id = Integer.toString(id);
    }

    public Node(String id){
        this.id = id;
    }
    public Node(int id, String label) {
        this.id = Integer.toString(id);
        setLabel(label);
    }

    public Node(String id, String label) {
        this.id = id;
        setLabel(label);
    }

    public Node(int id, String label, String image) {
        this.id = Integer.toString(id);
        setLabel(label);
        setImage(image);
        setShape(Shape.image);
    }

    public Node(String id, String label, String image) {
        this.id = id;
        setLabel(label);
        setImage(image);
        setShape(Shape.image);

    }

    public Node(int id, String label, Node.Shape shape, String group) {
        this.id = Integer.toString(id);
        setShape(shape);
        setLabel(label);
        setGroup(group);
    }

    public Node(String id, String label, Node.Shape shape, String group) {
        this.id = id;
        setLabel(label);
        setShape(shape);
        setGroup(group);
    }

    public Node(int id, String label, Node.Shape shape, String group, String image) {
        this.id = Integer.toString(id);
        setLabel(label);
        setShape(shape);
        setGroup(group);
        setImage(image);
        setShape(Shape.image);
    }

    public Node(String id, String label, Node.Shape shape, String group, String image) {
        this.id = id;
        setLabel(label);
        setShape(shape);
        setGroup(group);
        setImage(image);
        setShape(Shape.image);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public List<Edge> getConnectedEdges() {
        return edgeList;
    }

    public void setConnectedEdges(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public void addEdgeToList(Edge edge) {
        edgeList.add(edge);
    }

    public void removeEdgeFromList(Edge edge) {
        edgeList.remove(edge);
    }

    public Map<String, Edge> getEdgeMap() {
        return edgeMap;
    }

    public void setEdgeMap(Map<String, Edge> edgeMap) {
        this.edgeMap = edgeMap;
    }

    public static enum Shape {
        @SerializedName("ellipse")
        ellipse,
        @SerializedName("circle")
        circle,
        @SerializedName("database")
        database,
        @SerializedName("box")
        box,
        @SerializedName("text")
        text,
        @SerializedName("image")
        image,
        @SerializedName("circularImage")
        circularImage,
        @SerializedName("diamond")
        diamond,
        @SerializedName("dot")
        dot,
        @SerializedName("star")
        star,
        @SerializedName("triangle")
        triangle,
        @SerializedName("triangleDown")
        triangleDown,
        @SerializedName("square")
        square,
        @SerializedName("icon")
        icon;
    }

    public static abstract class NodeSelectListener extends NodeListener {
        public NodeSelectListener(Node node) {
            super(node);
        }

        public abstract void onFired(SelectEvent event);
    }

    public static abstract class NodeClickListener extends NodeListener {
        public NodeClickListener(Node node) {
            super(node);
        }

        public abstract void onFired(ClickEvent event);
    }

    public static abstract class NodeDoubleClickListener extends NodeListener {
        public NodeDoubleClickListener(Node node) {
            super(node);
        }

        public abstract void onFired(DoubleClickEvent event);
    }

    public static abstract class NodeHoverListener extends NodeListener {
        public NodeHoverListener(Node node) {
            super(node);
        }

        public abstract void onFired(HoverEvent event);
    }

    public static abstract class NodeBlurListener extends NodeListener {
        public NodeBlurListener(Node node) {
            super(node);
        }

        public abstract void onFired(BlurEvent event);
    }

    public static abstract class NodeDragStartListener extends NodeListener {
        public NodeDragStartListener(Node node) {
            super(node);
        }

        public abstract void onFired(DragStartEvent event);
    }

    public static abstract class NodeDragEndListener extends NodeListener {
        public NodeDragEndListener(Node node) {
            super(node);
        }

        public abstract void onFired(DragEndEvent event);
    }
}
