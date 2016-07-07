package org.vaadin.visjs.networkDiagram;

import org.vaadin.visjs.networkDiagram.event.graph.NetworkEvent;
import org.vaadin.visjs.networkDiagram.event.graph.StabilizationProgressEvent;
import org.vaadin.visjs.networkDiagram.event.node.*;
import org.vaadin.visjs.networkDiagram.listener.BeforeClientResponseListener;
import org.vaadin.visjs.networkDiagram.listener.GraphListener;
import org.vaadin.visjs.networkDiagram.options.Options;
import org.vaadin.visjs.networkDiagram.util.Constants;
import com.google.gson.Gson;
import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.ui.JavaScriptFunction;
import elemental.json.JsonArray;
import elemental.json.JsonException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Created by roshans on 10/10/14.
 */

@JavaScript({"js/vis.min.js", "js/networkDiagram-connector.js"})
@StyleSheet({"css/vis.min.css", "css/networkDiagram.css"})
public class NetworkDiagram extends AbstractJavaScriptComponent {
    private List<Node.NodeSelectListener> nodeSelectListeners = new ArrayList<>();
    private List<Node.NodeClickListener> nodeClickListeners = new ArrayList<>();
    private List<Node.NodeDoubleClickListener> nodeDoubleClickListeners = new ArrayList<>();
    private List<Node.NodeHoverListener> nodeHoverListeners = new ArrayList<>();
    private List<Node.NodeBlurListener> nodeBlurListeners = new ArrayList<>();
    private List<Node.NodeDragStartListener> nodeDragStartListeners = new ArrayList<>();
    private List<Node.NodeDragEndListener> nodeDragEndListeners = new ArrayList<>();
    private ResizeListener resizeListener;
    private List<StabilizationStartListener> stabilizationStartListeners = new ArrayList<>();
    private List<StabilizationProgressListener> stabilizationProgressListeners = new ArrayList<>();
    private List<StabilizationDoneListener> stabilizationDoneListeners = new ArrayList<>();
    private List<BeforeClientResponseListener> beforeClientResponseListeners = new ArrayList<>();
    private StabilizedListener stabilizedListener;
    private ViewChangedListener viewChangedListener;
    private ZoomListener zoomListener;
    private Gson gson = new Gson();
    private Options options;


    public NetworkDiagram(Options options) {
        super();
        this.options = options;
        init();
    }

    public NetworkDiagram() {
        super();
        init();
    }

    protected void init() {
        addStyleName("vis-network-diagram");
        addFunction(Constants.ON_SELECT, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                SelectEvent event = EventGenerator.getNodeSelectEvent(properties);
                fireNodeSelectEvent(event);
            }
        });
        addFunction(Constants.ON_CLICK, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                ClickEvent event = EventGenerator.getNodeClickEvent(properties);
                fireNodeClickEvent(event);
            }
        });
        addFunction(Constants.ON_DOUBLE_CLICK, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                DoubleClickEvent event = EventGenerator.getNodeDoubleClickEvent(properties);
                fireNodeDoubleClickEvent(event);
            }
        });
        addFunction(Constants.ON_HOVER_NODE, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                HoverEvent event = EventGenerator.getNodeHoverEvent(properties);
                fireNodeHoverEvent(event);
            }
        });
        addFunction(Constants.ON_BLUR_NODE, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                BlurEvent event = EventGenerator.getNodeBlurEvent(properties);
                fireNodeBlurEvent(event);
            }
        });
        addFunction(Constants.ON_DRAG_START, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                DragStartEvent event = EventGenerator.getNodeDragStartEvent(properties);
                fireNodeDragStartEvent(event);
            }
        });
        addFunction(Constants.ON_DRAG_END, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                DragEndEvent event = EventGenerator.getNodeDragEndEvent(properties);
                fireNodeDragEndEvent(event);
            }
        });
        addFunction(Constants.ON_START_STABILIZATION, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                //System.out.println("onStartStabilization" + properties);
                //fireGraphStabilizationStartEvent();
            }
        });

        addFunction(Constants.ON_STABILIZATION_PROGRESS, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                System.out.println("onStartStabilization" + properties);
                StabilizationProgressEvent event = new StabilizationProgressEvent(properties);
                fireGraphStabilizationProgressEvent(event);
            }
        });

        addFunction(Constants.ON_STABILIZATION_ITERATIONS_DONE, new JavaScriptFunction() {
            @Override
            public void call(JsonArray jsonArray) {
               // NetworkEvent event = new NetworkEvent();
               // fireGraphStabilizationStartEvent(event);
            }
        });
        addFunction(Constants.ON_STABILIZED, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                //System.out.println("onStabilized" + properties);
                //fireGraphStabilizedEvent();
            }
        });
        addFunction(Constants.ON_VIEW_CHANGED, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                //System.out.println("onViewChanged" + properties);
                //fireGraphViewChangedEvent();
            }
        });
        addFunction(Constants.ON_ZOOM, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                //System.out.println("onZoom" + properties);
                //fireGraphZoomEvent();
            }
        });
        addFunction(Constants.ON_RESIZE, new JavaScriptFunction() {
            @Override
            public void call(final JsonArray properties) throws JsonException {
                //System.out.println("onResize" + properties);
                //fireGraphResizeEvent();
            }
        });



        callFunction("init", gson.toJson(options));
    }



    /**
     * This is called when the component is focused again after initialization. This is the fix made to report display component
     * not loading issue when tabs are changed and refocused to the same tab. This also fixed the issue with reloading
     * and drawing issue when moved to browser window. Solution is provided by VAADIN support
     *
     * @param initial
     */
    @Override
    public void beforeClientResponse(boolean initial) {
        super.beforeClientResponse(initial);
        draw();
        fireBeforeClientResponseEvent(initial);
    }



    public void reDraw(){
        callFunction("reDraw");
    }

    public void draw(){
        callFunction("draw");
    }


    public void stabilize() {
        callFunction("stabilize");
    }

    public NetworkDiagramState getState() {
        return (NetworkDiagramState) super.getState();
    }

    public void fitToScreen(){
        callFunction("fitToScreen");
    }


    public void updateOptions(Options options) {
        this.options = options;
        getState().updates++;
        callFunction("setOptions", gson.toJson(options));
    }
    @Deprecated
    /*
    adding one by one for large number of nodes make browser freeze
     */
    public void addNode(Node... node) {
        getState().updates++;
        callFunction("addNodes", gson.toJson(node));
    }

    public void addNodes(List<Node> nodes) {
        getState().updates++;
        callFunction("addNodes", gson.toJson(nodes));
    }

    public void addNodes(Collection<Node> nodes) {
        getState().updates++;
        callFunction("addNodes", gson.toJson(nodes));
    }
    @Deprecated
    /*
    adding one by one for large number of edges make browser freeze
     */
    public void addEdge(Edge... edges) {
        getState().updates++;
        callFunction("addEdges", gson.toJson(edges));
    }

    public void addEdges(List<Edge> edges) {
        getState().updates++;
        callFunction("addEdges", gson.toJson(edges));
    }
    public void addEdges(Collection<Edge> edges) {
        getState().updates++;
        callFunction("addEdges", gson.toJson(edges));
    }

    public void removeNode(Node... node) {
        getState().updates++;
        callFunction("removeNode", gson.toJson(node));
    }

    public void removeEdge(Edge... edges) {
        getState().updates++;
        callFunction("removeEdge", gson.toJson(edges));
    }

    public void updateNode(Node... node) {
        getState().updates++;
        callFunction("updateNode", gson.toJson(node));
    }

    public void updateEdge(Edge... edges) {
        getState().updates++;
        callFunction("updateEdge", gson.toJson(edges));
    }

    @Deprecated
    public void updateEdge(List<Edge> edges) {
        updateEdges(edges);
    }

    public void updateEdges(List<Edge> edges) {
        callFunction("updateEdge", gson.toJson(edges));
    }

    @Deprecated
    public void updateNode(List<Node> nodes) {
        updateNodes(nodes);
    }

    public void updateNodes(List<Node> nodes) {
        callFunction("updateNode", gson.toJson(nodes));
    }

    public void clearNodes() {
        callFunction("clearNodes");
    }

    public void clearEdges() {
        callFunction("clearEdges");
    }

    public void destroyNetwork() {
        callFunction("destroyNetwork");
    }

    public void clear() {
        clearEdges();
        clearNodes();
    }

    public void drawConnections() {
        callFunction("drawConnections");
    }

    public void addNodeSelectListener(Node.NodeSelectListener listener) {
        nodeSelectListeners.add(listener);
    }

    public void removeNodeSelectListener(Node.NodeSelectListener listener) {
        nodeSelectListeners.remove(listener);
    }

    public void removeNodeClickListeners(Node.NodeClickListener listener) {
        nodeClickListeners.remove(listener);
    }

    public void addNodeClickListener(Node.NodeClickListener nodeClickListener) {
        this.nodeClickListeners.add(nodeClickListener);
    }

    public void removeNodeDoubleClickListener(Node.NodeDoubleClickListener listener) {
        nodeDoubleClickListeners.remove(listener);
    }

    public void addNodeDoubleClickListener(Node.NodeDoubleClickListener listener) {
        nodeDoubleClickListeners.add(listener);
    }

    public void removeNodeHoverListener(Node.NodeHoverListener listener) {
        nodeHoverListeners.remove(listener);
    }

    public void addNodeHoverListener(Node.NodeHoverListener listener) {
        this.nodeHoverListeners.add(listener);
    }

    public void removeNodeBlurListener(Node.NodeBlurListener listener) {
        nodeBlurListeners.remove(listener);
    }

    public void addNodeBlurListener(Node.NodeBlurListener listener) {
        this.nodeBlurListeners.add(listener);
    }

    public void removeNodeDragStartListener(Node.NodeDragStartListener listener) {
        nodeDragStartListeners.remove(listener);
    }

    public void addNodeDragStartListener(Node.NodeDragStartListener listener) {
        this.nodeDragStartListeners.add(listener);
    }

    public void removeNodeDragEndListener(Node.NodeDragEndListener listener) {
        nodeDragEndListeners.remove(listener);
    }

    public void addNodeDragEndListener(Node.NodeDragEndListener listener) {
        this.nodeDragEndListeners.add(listener);
    }

    //adding and removing graph listeners

    public void addResizeListener(ResizeListener resizeListener) {
        this.resizeListener = resizeListener;
    }

    public void addStabilizationStartListener(StabilizationStartListener stabilizationStartListener) {
        this.stabilizationStartListeners.add(stabilizationStartListener);
    }

    public void addStabilizationProgressListener(StabilizationProgressListener listener){
        this.stabilizationProgressListeners.add(listener);
    }

    public void addStabilizationDoneListener(StabilizationDoneListener stabilizationDoneListener) {
        this.stabilizationDoneListeners.add(stabilizationDoneListener);
    }

    public void addStabilizedListener(StabilizedListener stabilizedListener) {
        this.stabilizedListener = stabilizedListener;
    }

    public void addViewChangedListener(ViewChangedListener viewChangedListener) {
        this.viewChangedListener = viewChangedListener;
    }

    public void addZoomListener(ZoomListener zoomListener) {
        this.zoomListener = zoomListener;
    }

    public void removeResizeListener() {
        this.resizeListener = null;
    }

    public void removeStabilizationStartListener(StabilizationStartListener listener) {
        this.stabilizationStartListeners.remove(listener);
    }

    public void removeStabilizationProgressListener(StabilizationProgressListener listener){
        this.stabilizationProgressListeners.remove(listener);
    }

    public void removeStabilizationDoneListener(StabilizationDoneListener listener) {
        this.stabilizationDoneListeners.remove(listener);
    }


    public void removeStabilizedListener() {
        this.stabilizedListener = null;
    }

    public void removeViewChangedListener() {
        this.viewChangedListener = null;
    }

    public void removeZoomListener() {
        this.zoomListener = null;
    }

    public void addBeforeClientResponseListener(BeforeClientResponseListener listener){
        beforeClientResponseListeners.add(listener);
    }

    public void removeBeforeClientResponseListener(BeforeClientResponseListener listener){
        beforeClientResponseListeners.remove(listener);
    }

    //listeners for entire graph

    public static abstract class ResizeListener extends GraphListener {

    }

    public static abstract class StabilizationStartListener extends GraphListener {
    }

    public static abstract class StabilizationProgressListener {
        public abstract void onFired(StabilizationProgressEvent event);
    }


    public static abstract class StabilizationDoneListener extends GraphListener {

    }

    public static abstract class StabilizedListener extends GraphListener {
    }

    public static abstract class ViewChangedListener extends GraphListener {
    }

    public static abstract class ZoomListener extends GraphListener {
    }




    public void fireGraphResizeEvent(NetworkEvent event) {
        if (resizeListener != null) {
            resizeListener.onFired(event);
        }
    }

    public void fireGraphStabilizationStartEvent(NetworkEvent event) {
        for (StabilizationStartListener listener : stabilizationStartListeners) {
            listener.onFired(event);
        }
    }

    private void fireGraphStabilizationProgressEvent(StabilizationProgressEvent event) {
        for (StabilizationProgressListener listener : stabilizationProgressListeners) {
            listener.onFired(event);
        }
    }

    public void fireGraphStabilizationDoneEvent(NetworkEvent event) {
        for (StabilizationDoneListener listener : stabilizationDoneListeners) {
            listener.onFired(event);
        }
    }

    public void fireGraphStabilizedEvent(NetworkEvent event) {
        if (stabilizedListener != null) {
            stabilizedListener.onFired(event);
        }
    }

    public void fireGraphViewChangedEvent(NetworkEvent event) {
        if (viewChangedListener != null) {
            viewChangedListener.onFired(event);
        }
    }

    public void fireGraphZoomEvent(NetworkEvent event) {
        if (zoomListener != null) {
            zoomListener.onFired(event);
        }
    }

    public void fireNodeSelectEvent(SelectEvent event) {
        for (String nodeID : event.getNodeIds()) {
            for (Node.NodeSelectListener listener : nodeSelectListeners) {
                if (listener.getNode().getId().equals(nodeID)) {
                    listener.onFired(event);
                }
            }
        }
    }

    public void fireNodeClickEvent(ClickEvent event) {
        for (String nodeID : event.getNodeIds()) {
            for (Node.NodeClickListener listener : nodeClickListeners) {
                if (listener.getNode().getId().equals(nodeID)) {
                    listener.onFired(event);
                }
            }
        }
    }

    public void fireNodeDoubleClickEvent(DoubleClickEvent event) {
        for (String nodeID : event.getNodeIds()) {
            for (Node.NodeDoubleClickListener listener : nodeDoubleClickListeners) {
                if (listener.getNode().getId().equals(nodeID)) {
                    listener.onFired(event);
                }
            }
        }
    }

    public void fireNodeHoverEvent(HoverEvent event) {
        for (String nodeID : event.getNodeIds()) {
            for (Node.NodeHoverListener listener : nodeHoverListeners) {
                if (listener.getNode().getId().equals(nodeID)) {
                    listener.onFired(event);
                }
            }
        }

    }

    public void fireNodeBlurEvent(BlurEvent event) {
        for (String nodeID : event.getNodeIds()) {
            for (Node.NodeBlurListener listener : nodeBlurListeners) {
                if (listener.getNode().getId().equals(nodeID)) {
                    listener.onFired(event);
                }
            }
        }
    }

    public void fireNodeDragStartEvent(DragStartEvent event) {
        for (String nodeID : event.getNodeIds()) {
            for (Node.NodeDragStartListener listener : nodeDragStartListeners) {
                if (listener.getNode().getId().equals(nodeID)) {
                    listener.onFired(event);
                }
            }
        }
    }

    public void fireNodeDragEndEvent(DragEndEvent event) {
        for (String nodeID : event.getNodeIds()) {
            for (Node.NodeDragEndListener listener : nodeDragEndListeners) {
                if (listener.getNode().getId().equals(nodeID)) {
                    listener.onFired(event);
                }
            }
        }
    }

    public void fireBeforeClientResponseEvent(boolean initial ){
        for(BeforeClientResponseListener listener: beforeClientResponseListeners){
            listener.beforeClientResponse(initial);
        }
    }
}
