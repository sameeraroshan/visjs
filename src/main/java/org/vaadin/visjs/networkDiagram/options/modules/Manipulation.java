package org.vaadin.visjs.networkDiagram.options.modules;

public class Manipulation {
    /*
        Toggle the manipulation system on or off. Even when false, the manipulation API through the methods will still work.
        This property is optional. If you define any of the options below and enabled is undefined, this will be set to true.
         */
    boolean enabled = false;
    /*
    Toggle whether the toolbar is visible initially or if only the edit button is visible initially.
     */
    boolean initiallyActive = true;
    /*
    You can use these options to switch certain functionalities on or off of attach a handler function to them.
    These functions are called before the action is performed. If a node is going to be added through the manipulation system,
    the addNode function will be called first. With this, you can provide a gui for your users, abort the process or anything else you want to do.
    For all except the editNode functionality, these handler functions are optional. When you supply a boolean,
    you only toggle the 'add node' button on the GUI of the manipulation system.
    The lack of handling function could effect the API when using the methods.
    When a function is supplied, it will be called when the user clicks the canvas in 'addNode' mode.
    This function will receive two variables: the properties of the node that can be created and a callback function.
    If you call the callback function with the properties of the new node, the node will be added.

        Example:
        var options = {
          manipulation: {
            addNode: function(nodeData,callback) {
              nodeData.label = 'hello world';
              callback(nodeData);
            }
          }
        }
    This function changes the label of the new node into 'hello world'.
    If you do not want the node created, do not call the callback function or call the callback function null or no argument.
     */
    boolean addNode = true;
    /*
    If boolean, toggle the availability of the 'addEdge' button in the GUI,
    the API through the methods will still work except (obviously) there will be no handler function.
    When a function is supplied, it will be called when the user drags the new edge from one node to the next in 'addEdge' mode.
    This function will receive two variables: the properties of the edge that can be created and a callback function.
    If you call the callback function with the properties of the new edge, the edge will be added.

        Example:
        var options = {
          manipulation: {
            addEdge: function(edgeData,callback) {
              if (edgeData.from === edgeData.to) {
                var r = confirm("Do you want to connect the node to itself?");
                if (r === true) {
                  callback(edgeData);
                }
              }
              else {
                callback(edgeData);
              }
            }
          }
        }

    This example code will show a popup if you connect a node to itself to ask you if that was what you wanted.
    If you do not want the edge created, do not call the callback function or call the callback function null or no argument.
     */
    boolean addEdge = true;
    /*
    Editing of nodes is only possible when a handling function is supplied. If this is not the case, editing of nodes will be disabled.
    The function will be called when a node is selected and the 'Edit Node' button on the toolbar is pressed.
    This function will be called like the addNode function with the node's data and a callback function.
     */
    String editNode="undefined";
    /*
    If boolean, toggle the editing of edges in the GUI. When a function is supplied, it will be called when an edge is selected
    and the 'Edit Edge' button on the toolbar is pressed. This function will be called in the same way the addEdge function was called.
    If the callback is not performed, the edge will remain hanging where it was released.
    To cancel, call the callback function with null as argument or without arguments.
     */
    boolean editEdge = true;
    /*
    If boolean, toggle the deletion of nodes in the GUI. If function, it will be called when a node is selected and the
    'Delete selected' button is pressed. When using a function, it will receive a callback and an object with an array
    of selected nodeIds and an array of selected edges Ids. These are the items that will be deleted if the callback is performed.
     */
    boolean deleteNode = true;
    /*
    If boolean, toggle the deletion of edges in the GUI. If function, it will be called when an edge is selected and the
    'Delete selected' button is pressed. When using a function, it will receive a callback and an object with an array
    of selected nodeIds (empty) and an array of selected edges Ids. These are the items that will be deleted if the callback is performed.
     */
    boolean deleteEdge = true;
    /*
    You can supply any styling information you'd like here. All fields described in the nodes module are allowed except
    obviously for id, x, y and fixed.

        Default:
        {
          shape:'dot',
          size:6,
          color: {
            background: '#ff0000',
            border: '#3c3c3c',
            highlight: {
              background: '#07f968',
              border: '#3c3c3c'
            }
          },
          borderWidth: 2,
          borderWidthSelected: 2
        }
     */
    Nodes controlNodeStyle;


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

    public boolean getAddNode() {
        return addNode;
    }

    public void setAddNode(boolean addNode) {
        this.addNode = addNode;
    }

    public boolean getAddEdge() {
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

    public boolean getEditEdge() {
        return editEdge;
    }

    public void setEditEdge(boolean editEdge) {
        this.editEdge = editEdge;
    }

    public boolean getDeleteNode() {
        return deleteNode;
    }

    public void setDeleteNode(boolean deleteNode) {
        this.deleteNode = deleteNode;
    }

    public boolean getDeleteEdge() {
        return deleteEdge;
    }

    public void setDeleteEdge(boolean deleteEdge) {
        this.deleteEdge = deleteEdge;
    }

    public Nodes getControlNodeStyle() {
        return controlNodeStyle;
    }

    public void setControlNodeStyle(Nodes controlNodeStyle) {
        this.controlNodeStyle = controlNodeStyle;
    }

}
