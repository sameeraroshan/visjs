package org.vaadin.visjs.networkDiagram.options;

/**
 * Created by roshans on 6/1/2015.
 */
public class Manipulation {

    /*Toggle the manipulation system on or off. This property is optional.
    If you define any of the options below and enabled is undefined, this will be set to true.*/

    private boolean enabled = false;
    private boolean initiallyActive = false;
    private boolean addNode = true;
    private boolean addEdge = true;
    private String editNode;
    private boolean editEdge = true;
    private boolean deleteNode = true;
    private boolean deleteEdge = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isInitiallyActive() {
        return initiallyActive;
    }

    public void setInitiallyActive(boolean initiallyActive) {
        this.initiallyActive = initiallyActive;
    }

    public boolean isAddNode() {
        return addNode;
    }

    public void setAddNode(boolean addNode) {
        this.addNode = addNode;
    }

    public boolean isAddEdge() {
        return addEdge;
    }

    public void setAddEdge(boolean addEdge) {
        this.addEdge = addEdge;
    }

    public String getEditNode() {
        return editNode;
    }

    public void setEditNode(String editNode) {
        this.editNode = editNode;
    }

    public boolean isEditEdge() {
        return editEdge;
    }

    public void setEditEdge(boolean editEdge) {
        this.editEdge = editEdge;
    }

    public boolean isDeleteNode() {
        return deleteNode;
    }

    public void setDeleteNode(boolean deleteNode) {
        this.deleteNode = deleteNode;
    }

    public boolean isDeleteEdge() {
        return deleteEdge;
    }

    public void setDeleteEdge(boolean deleteEdge) {
        this.deleteEdge = deleteEdge;
    }
}
