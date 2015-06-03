package org.vaadin.visjs.networkDiagram.options;

/**
 * Created by roshans on 6/1/2015.
 */
public class Configure {


    private boolean enabled = true;
    private boolean filter = true;
    private boolean showButton = true;
    private String container;

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public boolean isShowButton() {
        return showButton;
    }

    public void setShowButton(boolean showButton) {
        this.showButton = showButton;
    }
}
