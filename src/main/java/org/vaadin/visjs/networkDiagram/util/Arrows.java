package org.vaadin.visjs.networkDiagram.util;

/**
 * Created by roshans on 5/31/2015.
 */
public class Arrows {
    private Settings to = new Settings();
    private Settings middle = new Settings();
    private Settings from = new Settings();
    public Arrows(){
        to.setEnabled(true);
    }

    public static class Settings{
        private boolean enabled = false;
        private double scaleFactor = 1;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public double getScaleFactor() {
            return scaleFactor;
        }

        public void setScaleFactor(double scaleFactor) {
            this.scaleFactor = scaleFactor;
        }
    }

    private Settings getMiddle() {
        return middle;
    }

   /* public void setMiddle(Settings middle) {
        this.middle = middle;
    }*/

    public Settings getTo() {
        return to;
    }

    /*public void setTo(Settings to) {
        this.to = to;
    }*/

    public Settings getFrom() {
        return from;
    }

    /*public void setFrom(Settings from) {
        this.from = from;
    }*/

    public void setLine(){
        to.setEnabled(false);
        middle.setEnabled(false);
        from.setEnabled(false);
    }

    public void setArrow(){
        to.setEnabled(true);
        middle.setEnabled(false);
        from.setEnabled(false);
    }

    public void setArrowCenter(){
        to.setEnabled(false);
        middle.setEnabled(true);
        from.setEnabled(false);
    }

}
