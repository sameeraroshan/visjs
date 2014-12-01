package org.vaadin.visjs.networkDiagram;

import org.vaadin.visjs.networkDiagram.options.Options;
import com.vaadin.shared.ui.JavaScriptComponentState;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by roshans on 10/10/14.
 */

public class NetworkDiagramState extends JavaScriptComponentState {
    public Options options;
    public List<Node> nodes = new ArrayList<>();
    public List<Edge> edges = new ArrayList<>();
}
