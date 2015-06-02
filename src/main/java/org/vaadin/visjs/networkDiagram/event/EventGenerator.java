package org.vaadin.visjs.networkDiagram.event;

import org.vaadin.visjs.networkDiagram.event.node.*;
import elemental.json.JsonArray;
import elemental.json.JsonException;

/**
 * Created by roshans on 11/30/14.
 */
public class EventGenerator {


    public static SelectEvent getNodeSelectEvent(JsonArray properties) {
        SelectEvent selectEvent = null;
        try {
            selectEvent = new SelectEvent(properties);
        } catch (JsonException e) {
            e.printStackTrace();
        }
        return selectEvent;
    }

    public static ClickEvent getNodeClickEvent(JsonArray properties){
        ClickEvent clickEvent = null;
        try {
            clickEvent = new ClickEvent(properties);
        } catch (JsonException e) {
            e.printStackTrace();
        }
        return clickEvent;
    }

    public static DoubleClickEvent getNodeDoubleClickEvent(JsonArray properties){
        DoubleClickEvent doubleClickEvent = null;
        try {
            doubleClickEvent = new DoubleClickEvent(properties);
        } catch (JsonException e) {
            e.printStackTrace();
        }
        return doubleClickEvent;
    }

    public static HoverEvent getNodeHoverEvent(JsonArray properties){
        HoverEvent hoverEvent = null;
        try {
            hoverEvent = new HoverEvent(properties);
        } catch (JsonException e) {
            e.printStackTrace();
        }
        return hoverEvent;
    }


    public static BlurEvent getNodeBlurEvent(JsonArray properties) {
        BlurEvent blurEvent = null;
        try {
            blurEvent = new BlurEvent(properties);
        } catch (JsonException e) {
            e.printStackTrace();
        }
        return blurEvent;
    }

    public static DragStartEvent getNodeDragStartEvent(JsonArray properties) {
        DragStartEvent dragStartEvent = null;
        try {
            dragStartEvent = new DragStartEvent(properties);
        } catch (JsonException e) {
            e.printStackTrace();
        }
        return dragStartEvent;
    }

    public static DragEndEvent getNodeDragEndEvent(JsonArray properties) {
        DragEndEvent dragEndEvent = null;
        try {
            dragEndEvent = new DragEndEvent(properties);
        } catch (JsonException e) {
            e.printStackTrace();
        }
        return dragEndEvent;
    }
}
