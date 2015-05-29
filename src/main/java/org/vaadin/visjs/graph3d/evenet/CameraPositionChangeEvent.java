package org.vaadin.visjs.graph3d.evenet;

import org.vaadin.visjs.graph3d.options.CameraPosition;

/**
 * Created by roshans on 2/8/2015.
 */
public class CameraPositionChangeEvent {
    public CameraPosition getCameraPosition() {
        return cameraPosition;
    }

    public void setCameraPosition(CameraPosition cameraPosition) {
        this.cameraPosition = cameraPosition;
    }

    public CameraPosition cameraPosition;
}
