/**
 * Created by roshans on 08/02/14.
 */

window.org_vaadin_visjs_Graph3d = function () {

    var data = new vis.DataSet();
    var graph;
    var options;
    var container;
    var self = this;

    this.init = function(o){
        options = JSON.parse(o);
        container = this.getElement();

        var steps = 50;  // number of datapoints will be steps*steps
        var axisMax = 314;
        var axisStep = axisMax / steps;
            for (var x = 0; x < axisMax; x+=axisStep) {
              for (var y = 0; y < axisMax; y+=axisStep) {
                var value = custom(x, y);
                data.add({
                  x: x,
                  y: y,
                  z: value,
                  style: value
                });
              }
            }

            var options = {
                  width:  '600px',
                  height: '600px',
                  style: 'surface',
                  showPerspective: true,
                  showGrid: true,
                  showShadow: false,
                  keepAspectRatio: true,
                  verticalRatio: 0.5
                };


             graph = new vis.Graph3d(container, data, options);
             graph.on('cameraPositionChange', function(){
                self.onCameraPositionChange(graph.getCameraPosition());
             });

    };

    function custom(x, y) {
        return (Math.sin(x/50) * Math.cos(y/50) * 50 + 50);
      };
    this.draw = function(){

    };
    this.setOptions = function (options) {
        graph.setOptions(JSON.parse(options));
    };

    this.setSize = function(wh){
        graph.setSize(JSON.parse(wh));
    };

    this.setCameraPosition  = function(cp){
        graph.setCameraPosition (JSON.parse(cp));
    };

    this.animationStart = function () {
        graph.animationStart();
    };
    this.animationStop() = function () {
        graph.animationStop();
    };

    this.setData = function (d) {
        graph.setData(JSON.parse(d))
    };

    this.addData = function (e) {
       // data.add(JSON.parse(e));
    };
    this.removeData = function (e) {
        data.remove(JSON.parse(e));
    };

    this.updateData = function(n){
        data.update(JSON.parse(n));
    };

    this.clearData = function(){
        data.clear();
    };

};
