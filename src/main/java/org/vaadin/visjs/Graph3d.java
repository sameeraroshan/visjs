package org.vaadin.visjs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.ui.JavaScriptFunction;
import org.json.JSONArray;
import org.json.JSONException;
import org.vaadin.visjs.graph3d.DataPoint;
import org.vaadin.visjs.graph3d.EventGenerator;
import org.vaadin.visjs.graph3d.Options;
import org.vaadin.visjs.graph3d.Size;
import org.vaadin.visjs.graph3d.evenet.CameraPositionChangeEvent;
import org.vaadin.visjs.graph3d.options.CameraPosition;
import org.vaadin.visjs.graph3d.util.Constants;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by roshans on 2/8/2015.
 */
@JavaScript({"js/vis.min.js","js/graph3d-connector.js"})
@StyleSheet({"css/vis.css","css/graph3d.css"})
public class Graph3d extends AbstractJavaScriptComponent {
    private Gson gson = new Gson();
    private EventGenerator eventGenerator = new EventGenerator();
    private List<CameraPositionChangeListener> cameraPositionChangeListeners = new ArrayList<>();

    public Graph3d(Options options) {
        super();
        addFunction(Constants.ON_CAMERA_POSITION_CHANGE, new JavaScriptFunction() {
            @Override
            public void call(final JSONArray properties) throws JSONException {
                CameraPositionChangeEvent event = eventGenerator.getCameraPositionChangeEvent(properties);
                fireCameraPositionChangeEvent(event);
            }
        });
        Gson gson = new Gson();
        String json = gson.toJson(options);
        callFunction("init", json);
    }

    public void draw(){
        callFunction("draw");
    }

    private void fireCameraPositionChangeEvent(CameraPositionChangeEvent event) {
        for (CameraPositionChangeListener listener : cameraPositionChangeListeners) {
            listener.onFired(event);
        }
    }

    public Graph3dState getState() {
        return (Graph3dState) super.getState();
    }

    public void animationStart() {
        callFunction("animationStart");
    }

    public void animationStop() {
        callFunction("animationStop");
    }

    public void setData(DataPoint... data) {
        callFunction("setData", gson.toJson(data));
    }

    public void addData(DataPoint... data) {
        callFunction("addData", gson.toJson(data));
    }

    public void removeData(DataPoint... data) {
        callFunction("removeData", gson.toJson(data));
    }

    public void updateData(DataPoint... data) {
        callFunction("updateData", gson.toJson(data));
    }

    public void clearData(DataPoint... data) {
        callFunction("clearData", gson.toJson(data));
    }

    public void setOptions(Options options) {
        callFunction("setOptions", gson.toJson(options));
    }

    public void setSize(Size size) {
        callFunction("setSize", gson.toJson(size));
    }

    public void setCameraPosition(CameraPosition position) {
        callFunction("setCameraPosition", gson.toJson(position));
    }

    public CameraPosition getCameraPosition() {
        return null;
    }

    public void addCameraPositionChangeListener(CameraPositionChangeListener listener) {
        cameraPositionChangeListeners.add(listener);
    }

    public void removeCameraPositionChangeListener(CameraPositionChangeListener listener) {
        cameraPositionChangeListeners.remove(listener);
    }

    public static abstract class CameraPositionChangeListener {
        public abstract void onFired(CameraPositionChangeEvent event);
    }

    public static enum Style {
        @SerializedName("bar")
        bar,
        @SerializedName("bar-color")
        barColor,
        @SerializedName("bar-size")
        barSize,
        @SerializedName("dot")
        dot,
        @SerializedName("dot-line")
        dotLine,
        @SerializedName("dot-color")
        dotColor,
        @SerializedName("dot-size")
        dotSize,
        @SerializedName("line")
        line,
        @SerializedName("grid")
        grid,
        @SerializedName("surface")
        surface;
    }


}
