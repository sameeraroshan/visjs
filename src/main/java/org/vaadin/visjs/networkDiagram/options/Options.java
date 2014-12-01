package org.vaadin.visjs.networkDiagram.options;

import org.vaadin.visjs.networkDiagram.options.cluster.Cluster;
import org.vaadin.visjs.networkDiagram.options.edges.Edges;
import org.vaadin.visjs.networkDiagram.options.physics.Physics;

import java.util.List;

/**
 * Created by roshans on 10/10/14.
 */
public class Options {

    private boolean clickToUse = false;
    private boolean configurePhysics = false;
    private boolean hover = false;
    private boolean dragNetwork = true;
    private boolean dragNodes = true;
    private boolean hideNodesOnDrag = false;
    private boolean hideEdgesOnDrag = false;
    private boolean selectable = true;
    private boolean stabilize = true;
    private boolean zoomable = true;

    private String height = "100%";
    private String width = "100%";

    private int stabilizationIterations = 1000;

    private Physics physics;
    private Options options;
    private SmoothCurves smoothCurves;
    private Edges edges;
    private Nodes nodes;
    private Cluster clustering;

    private HierarchicalLayout hierarchicalLayout;

    public boolean isClickToUse() {
        return clickToUse;
    }

    public void setClickToUse(boolean clickToUse) {
        this.clickToUse = clickToUse;
    }

    public boolean isConfigurePhysics() {
        return configurePhysics;
    }

    public void setConfigurePhysics(boolean configurePhysics) {
        this.configurePhysics = configurePhysics;
    }

    public boolean isHover() {
        return hover;
    }

    public void setHover(boolean hover) {
        this.hover = hover;
    }

    public boolean isDragNetwork() {
        return dragNetwork;
    }

    public void setDragNetwork(boolean dragNetwork) {
        this.dragNetwork = dragNetwork;
    }

    public boolean isDragNodes() {
        return dragNodes;
    }

    public void setDragNodes(boolean dragNodes) {
        this.dragNodes = dragNodes;
    }

    public boolean isHideNodesOnDrag() {
        return hideNodesOnDrag;
    }

    public void setHideNodesOnDrag(boolean hideNodesOnDrag) {
        this.hideNodesOnDrag = hideNodesOnDrag;
    }

    public boolean isHideEdgesOnDrag() {
        return hideEdgesOnDrag;
    }

    public void setHideEdgesOnDrag(boolean hideEdgesOnDrag) {
        this.hideEdgesOnDrag = hideEdgesOnDrag;
    }

    public boolean isSelectable() {
        return selectable;
    }

    public void setSelectable(boolean selectable) {
        this.selectable = selectable;
    }

    public boolean isStabilize() {
        return stabilize;
    }

    public void setStabilize(boolean stabilize) {
        this.stabilize = stabilize;
    }

    public boolean isZoomable() {
        return zoomable;
    }

    public void setZoomable(boolean zoomable) {
        this.zoomable = zoomable;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public int getStabilizationIterations() {
        return stabilizationIterations;
    }

    public void setStabilizationIterations(int stabilizationIterations) {
        this.stabilizationIterations = stabilizationIterations;
    }

    public Physics getPhysics() {
        return physics;
    }

    public void setPhysics(Physics physics) {
        this.physics = physics;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public SmoothCurves getSmoothCurves() {
        return smoothCurves;
    }

    public void setSmoothCurves(SmoothCurves smoothCurves) {
        this.smoothCurves = smoothCurves;
    }

    public Edges getEdges() {
        return edges;
    }

    public void setEdges(Edges edges) {
        this.edges = edges;
    }

    public Nodes getNodes() {
        return nodes;
    }

    public void setNodes(Nodes nodes) {
        this.nodes = nodes;
    }

    public Cluster getClustering() {
        return clustering;
    }

    public void setClustering(Cluster clustering) {
        this.clustering = clustering;
    }

    public HierarchicalLayout getHierarchicalLayout() {
        return hierarchicalLayout;
    }

    public void setHierarchicalLayout(HierarchicalLayout hierarchicalLayout) {
        this.hierarchicalLayout = hierarchicalLayout;
    }
}
