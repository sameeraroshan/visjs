package org.vaadin.visjs.networkDiagram.options.modules;

public class Interaction {
    /*
    When true, the nodes that are not fixed can be dragged by the user.
     */
    boolean dragNodes = true;
    /*
    When true, the view can be dragged around by the user.
     */
    boolean dragView = true;
    /*
    When true, the edges are not drawn when dragging the view.
    This can greatly speed up responsiveness on dragging, improving user experience.
     */
    boolean hideEdgesOnDrag = false;
    /*
    When true, the nodes are not drawn when dragging the view.
    This can greatly speed up responsiveness on dragging, improving user experience.
     */
    boolean hideNodesOnDrag = false;
    /*
    When true, the nodes use their hover colors when the mouse moves over them.
     */
    boolean hover = false;
    /*
    When true, on hovering over a node, it's connecting edges are highlighted.
     */
    boolean hoverConnectedEdges = true;
    Keyboard keyboard = new Keyboard();
    /*
    When true, a longheld click (or touch) as well as a control-click will add to the selection.
     */
    boolean multiselect = false;
    /*
    When true, navigation buttons are drawn on the network canvas.
    These are HTML buttons and can be completely customized using CSS.
     */
    boolean navigationButtons = false;
    /*
    When true, the nodes and edges can be selected by the user.
     */
    boolean selectable = true;
    /*
    When true, on selecting a node, its connecting edges are highlighted.
     */
    boolean selectConnectedEdges = true;
    /*
    When nodes or edges have a defined 'title' field, this can be shown as a pop-up tooltip.
    The tooltip itself is an HTML element that can be fully styled using CSS.
    The delay is the amount of time in milliseconds it takes before the tooltip is shown.
     */
    int tooltipDelay = 300;
    /*
    When true, the user can zoom in.
     */
    boolean zoomView = true;

    public class Keyboard {
        /*
        Toggle the usage of the keyboard shortcuts. If this option is not defined,
        it is set to true if any of the properties in this object are defined.
         */
        boolean enabled = false;
        Speed speed = new Speed();
        boolean bindToWindow = true;

        private class Speed {
            /*
            The speed at which the view moves in the x direction on pressing a key or pressing a navigation button.
             */
            int x = 1;
            /*
            The speed at which the view moves in the y direction on pressing a key or pressing a navigation button.
             */
            int y = 1;
            /*
            The speed at which the view zooms in or out pressing a key or pressing a navigation button.
             */
            float zoom = 0.02f;

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public float getZoom() {
                return zoom;
            }

            public void setZoom(float zoom) {
                this.zoom = zoom;
            }

        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public Speed getSpeed() {
            return speed;
        }

        public void setSpeed(Speed speed) {
            this.speed = speed;
        }

        public boolean isBindToWindow() {
            return bindToWindow;
        }

        public void setBindToWindow(boolean bindToWindow) {
            this.bindToWindow = bindToWindow;
        }
    }

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

    public boolean isHoverConnectedEdges() {
        return hoverConnectedEdges;
    }

    public void setHoverConnectedEdges(boolean hoverConnectedEdges) {
        this.hoverConnectedEdges = hoverConnectedEdges;
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

