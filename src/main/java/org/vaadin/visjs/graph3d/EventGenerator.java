package org.vaadin.visjs.graph3d;

import org.json.JSONArray;
import org.json.JSONException;
import org.vaadin.visjs.Graph3d;
import org.vaadin.visjs.graph3d.evenet.CameraPositionChangeEvent;
import org.vaadin.visjs.graph3d.options.CameraPosition;

/**
 * Created by roshans on 2/8/2015.
 */
public class EventGenerator {
    CameraPositionChangeEvent event = new CameraPositionChangeEvent();
    CameraPosition position = new CameraPosition();

    public CameraPositionChangeEvent getCameraPositionChangeEvent(JSONArray properties) {
        try {
            position.setHorizontal((float) properties.getJSONObject(0).getDouble("horizontal"));
            position.setVertical((float) properties.getJSONObject(0).getDouble("vertical"));
            position.setDistance((float) properties.getJSONObject(0).getDouble("distance"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        event.setCameraPosition(position);
        return event;
    }
}
