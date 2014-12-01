package org.vaadin.visjs.networkDiagram;

import org.vaadin.visjs.networkDiagram.event.node.*;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by roshans on 11/30/14.
 */
public class EventGenerator {


    public static SelectEvent getNodeSelectEvent(JSONArray properties) {
        SelectEvent selectEvent = null;
        try {
            selectEvent = new SelectEvent(properties);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return selectEvent;
    }

    public static ClickEvent getNodeClickEvent(JSONArray properties){
        ClickEvent clickEvent = null;
        try {
            clickEvent = new ClickEvent(properties);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return clickEvent;
    }

    public static DoubleClickEvent getNodeDoubleClickEvent(JSONArray properties){
        DoubleClickEvent doubleClickEvent = null;
        try {
            doubleClickEvent = new DoubleClickEvent(properties);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return doubleClickEvent;
    }

    public static HoverEvent getNodeHoverEvent(JSONArray properties){
        HoverEvent hoverEvent = null;
        try {
            hoverEvent = new HoverEvent(properties);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hoverEvent;
    }


    public static BlurEvent getNodeBlurEvent(JSONArray properties) {
        BlurEvent blurEvent = null;
        try {
            blurEvent = new BlurEvent(properties);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return blurEvent;
    }

    public static DragStartEvent getNodeDragStartEvent(JSONArray properties) {
        DragStartEvent dragStartEvent = null;
        try {
            dragStartEvent = new DragStartEvent(properties);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return dragStartEvent;
    }

    public static DragEndEvent getNodeDragEndEvent(JSONArray properties) {
        DragEndEvent dragEndEvent = null;
        try {
            dragEndEvent = new DragEndEvent(properties);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return dragEndEvent;
    }
}
