package org.vaadin.visjs.networkDiagram.options;

import org.vaadin.visjs.networkDiagram.util.Keyboard;

/**
 * Created by roshans on 6/1/2015.
 */
public class Interaction {

    boolean dragNodes	=	true;	//When true, the nodes that are not fixed can be dragged by the user.
    boolean dragView	=	true;	//When true, the view can be dragged around by the user.
    boolean hideEdgesOnDrag	=	false;	//When true, the edges are not drawn when dragging the view. This can greatly speed up responsiveness on dragging, improving user experience.
    boolean hideNodesOnDrag	=	false;	//When true, the nodes are not drawn when dragging the view. This can greatly speed up responsiveness on dragging, improving user experience.
    boolean hover	=	false;	//When true, the nodes use their hover colors when the mouse moves over them.
    boolean hoverSelectedEdges =	true;	//When true, on hovering over a node, it's connecting edges are highlighted.
    Keyboard keyboard = new Keyboard();    //Object or Boolean	Object	When true, the keyboard shortcuts are enabled with the default settings. For further customization, you can supply an object.
    boolean multiselect	=	false; //	When true, a longheld click (or touch) as well as a control-click will add to the selection.
    boolean navigationButtons	=	false;	//When true, navigation buttons are drawn on the network canvas. These are HTML buttons and can be completely customized using CSS.
    boolean selectable	=	true;	//When true, the nodes and edges can be selected by the user.
    boolean selectConnectedEdges	=	true;	//When true, on selecting a node, its connecting edges are highlighted.
    int tooltipDelay	=	300;	//When nodes or edges have a defined 'title' field, this can be shown as a pop-up tooltip. The tooltip itself is an HTML element that can be fully styled using CSS. The delay is the amount of time in milliseconds it takes before the tooltip is shown.
    boolean zoomView	=	true;	//When true, the user can zoom in.


    public boolean isDragNodes() {
        return dragNodes;
    }

    public void setDragNodes(boolean dragNodes) {
        this.dragNodes = dragNodes;
    }

    public boolean isDragView() {
        return dragView;
    }

    public void setDragView(boolean dragView) {
        this.dragView = dragView;
    }

    public boolean isHideEdgesOnDrag() {
        return hideEdgesOnDrag;
    }

    public void setHideEdgesOnDrag(boolean hideEdgesOnDrag) {
        this.hideEdgesOnDrag = hideEdgesOnDrag;
    }

    public boolean isHideNodesOnDrag() {
        return hideNodesOnDrag;
    }

    public void setHideNodesOnDrag(boolean hideNodesOnDrag) {
        this.hideNodesOnDrag = hideNodesOnDrag;
    }

    public boolean isHover() {
        return hover;
    }

    public void setHover(boolean hover) {
        this.hover = hover;
    }

    public boolean isHoverSelectedEdges() {
        return hoverSelectedEdges;
    }

    public void setHoverSelectedEdges(boolean hoverSelectedEdges) {
        this.hoverSelectedEdges = hoverSelectedEdges;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public boolean isMultiselect() {
        return multiselect;
    }

    public void setMultiselect(boolean multiselect) {
        this.multiselect = multiselect;
    }

    public boolean isNavigationButtons() {
        return navigationButtons;
    }

    public void setNavigationButtons(boolean navigationButtons) {
        this.navigationButtons = navigationButtons;
    }

    public boolean isSelectable() {
        return selectable;
    }

    public void setSelectable(boolean selectable) {
        this.selectable = selectable;
    }

    public boolean isSelectConnectedEdges() {
        return selectConnectedEdges;
    }

    public void setSelectConnectedEdges(boolean selectConnectedEdges) {
        this.selectConnectedEdges = selectConnectedEdges;
    }

    public int getTooltipDelay() {
        return tooltipDelay;
    }

    public void setTooltipDelay(int tooltipDelay) {
        this.tooltipDelay = tooltipDelay;
    }

    public boolean isZoomView() {
        return zoomView;
    }

    public void setZoomView(boolean zoomView) {
        this.zoomView = zoomView;
    }
}
