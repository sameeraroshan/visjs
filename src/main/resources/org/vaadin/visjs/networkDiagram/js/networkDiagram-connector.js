/**
 * Created by roshans on 10/10/14.
 */

window.org_vaadin_visjs_networkDiagram_NetworkDiagram = function () {

    var nodes;
    var edges;
    var graph;
    var options = {"clickToUse" :"false"};
    var container;
    var self = this;

    this.init = function(o){
        options = JSON.parse(o);
        nodes = new vis.DataSet();
        edges = new vis.DataSet();
        container = this.getElement();
        graph = new vis.Network(container,{ nodes: nodes, edges: edges } , options);

            graph.on('select',function(properties){
                self.onSelect(properties);
                });
            graph.on('click',function(properties){
                self.onClick(properties);
                 });
             graph.on('doubleClick',function(properties){
                     self.onDoubleClick(properties);
                });
             graph.on('hoverNode',function(properties){
                      self.onHoverNode(properties);
                });
             graph.on("blurNode",function(properties){
                    self.onBlurNode(properties);
                });
             graph.on('resize',function(properties){
                    self.onResize(properties);
                });
             graph.on('dragStart',function(properties){
                    self.onDragStart(properties);
                });
             graph.on('dragEnd',function(properties){
                    self.onDragEnd(properties);
                });
             graph.on('startStabilization',function(properties){
                    self.onStartStabilization(properties);
                });
             graph.on('stabilized',function(properties){
                     self.onStabilized(properties);
                });
             graph.on('viewChanged',function(properties){
                self.onViewChanged(properties);
                });

            graph.on('zoom',function(properties){
                self.onZoom(properties);
                });

            graph.draw();
    };

    this.updateOptions = function (o) {
        options = JSON.parse(o);
        graph.redraw();
    };

    this.addNodes = function (n) {
        nodes.add(JSON.parse(n));
    };

    this.addEdges = function (e) {
        edges.add(JSON.parse(e));

    };

    this.drawConnections = function () {
        graph.redraw();
    };

    this.removeNode = function(n){
        nodes.remove(JSON.parse(n));
    };

    this.removeEdge = function(e){
        edges.remove(JSON.parse(e));
    };

    this.updateNode = function(n){
        nodes.update(JSON.parse(n));
    };

    this.updateEdge = function(e){
        edges.update(JSON.parse(e));
    };
};
