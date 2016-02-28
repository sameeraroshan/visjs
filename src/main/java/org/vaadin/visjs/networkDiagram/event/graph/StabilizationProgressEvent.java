package org.vaadin.visjs.networkDiagram.event.graph;

import elemental.json.JsonArray;

public class StabilizationProgressEvent {

    int iterations = 0;
    int total = 0;
    public StabilizationProgressEvent(JsonArray properties){

        try {
            iterations = (int) properties.getObject(0).getNumber("iterations");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            total = (int) properties.getObject(0).getNumber("total");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
