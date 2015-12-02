package org.vaadin.visjs.networkDiagram.util;


public class Arrows {

    ArrowOptions to = new ArrowOptions();
    ArrowOptions middle = new ArrowOptions();
    ArrowOptions from = new ArrowOptions();

    private class ArrowOptions {
        boolean enabled = false;
        float scaleFactor = 1;

        public ArrowOptions(boolean enabled, float scaleFactor) {
            this.enabled = enabled;
            this.scaleFactor = scaleFactor;
        }

        public ArrowOptions() {

        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public float getScaleFactor() {
            return scaleFactor;
        }

        public void setScaleFactor(float scaleFactor) {
            this.scaleFactor = scaleFactor;
        }

    }


    public ArrowOptions getMiddle() {
        return middle;
    }

    public void setMiddle(ArrowOptions middle) {
        this.middle = middle;
    }

    public ArrowOptions getTo() {
        return to;
    }

    public void setTo(ArrowOptions to) {
        this.to = to;
    }

    public ArrowOptions getFrom() {
        return from;
    }

    public void setFrom(ArrowOptions from) {
        this.from = from;
    }
}
