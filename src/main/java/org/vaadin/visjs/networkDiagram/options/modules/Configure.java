package org.vaadin.visjs.networkDiagram.options.modules;

public class Configure {
    /*
    Toggle the configuration interface on or off. This is an optional parameter.
    If left undefined and any of the other properties of this object are defined, this will be set to true.
     */
    private boolean enabled = false;
    /*
    When a boolean, true gives you all options, false will not show any. If a string is supplied, any combination of the
    following is allowed: nodes, edges, layout, interaction, manipulation, physics, selection, renderer. Feel free to
    come up with a fun seperating character. Finally, when supplied an array of strings, any of the previously mentioned
    fields are accepted.When supplying a function, you receive two arguments. The option and the path of the option
    within the options object. If it returns true, the options will be shown in the configurator. Example:
     */
    private String filter = "nodes,edges";
    /*
    This allows you to put the configure list in another HTML container than below the network.
     */
    private String container;
    /*
    Show the generate options button at the bottom of the configurator.
     */
    private boolean showButton=true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public boolean isShowButton() {
        return showButton;
    }

    public void setShowButton(boolean showButton) {
        this.showButton = showButton;
    }

}
