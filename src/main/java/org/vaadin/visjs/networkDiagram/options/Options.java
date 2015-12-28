package org.vaadin.visjs.networkDiagram.options;

import org.vaadin.visjs.networkDiagram.options.cluster.Cluster;
import org.vaadin.visjs.networkDiagram.options.modules.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roshans on 10/10/14.
 */
public class Options {
    private boolean autoResize = true;
    private String height = "100%";
    private String width = "100%";
    private String locale = "en";
    private Locales locales = new Locales();
    private boolean clickToUse = false;
    private Configure configure = new Configure();
    private Edges edges =  new Edges();
    private Nodes nodes = new Nodes();
    private Groups groups;
    private Layout layout = new Layout();
    private Interaction interaction = new Interaction();
    private Manipulation manipulation= new Manipulation();
    private Physics physics = new Physics();


    public boolean isAutoResize() {
        return autoResize;
    }

    public void setAutoResize(boolean autoResize) {
        this.autoResize = autoResize;
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

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Locales getLocales() {
        return locales;
    }

    public void setLocales(Locales locales) {
        this.locales = locales;
    }

    public boolean isClickToUse() {
        return clickToUse;
    }

    public void setClickToUse(boolean clickToUse) {
        this.clickToUse = clickToUse;
    }

    public Configure getConfigure() {
        return configure;
    }

    public void setConfigure(Configure configure) {
        this.configure = configure;
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

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public Interaction getInteraction() {
        return interaction;
    }

    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
    }

    public Manipulation getManipulation() {
        return manipulation;
    }

    public void setManipulation(Manipulation manipulation) {
        this.manipulation = manipulation;
    }

    public Physics getPhysics() {
        return physics;
    }

    public void setPhysics(Physics physics) {
        this.physics = physics;
    }

}
