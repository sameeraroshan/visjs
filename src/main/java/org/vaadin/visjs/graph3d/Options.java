package org.vaadin.visjs.graph3d;

import org.vaadin.visjs.Graph3d;
import org.vaadin.visjs.graph3d.options.BackgroundColor;
import org.vaadin.visjs.graph3d.options.CameraPosition;

/**
 * Created by roshans on 2/8/2015.
 */
public class Options {
    int animationInterval = 1000;
    boolean animationPreload;
    boolean animationAutoStart;
    BackgroundColor backgroundColor = new BackgroundColor();
    CameraPosition cameraPosition = new CameraPosition();
    String height = "400px";
    boolean keepAspectRatio = true;
    boolean showAnimationControls= true;
    boolean showGrid = true;
    boolean showPerspective = true;
    boolean showShadow;
    Graph3d.Style style = Graph3d.Style.dot;
    String tooltip = "function (point) {return 'value: <b>' + point.z + '</b>'; }";
    int valueMax;
    int valueMin;
    float verticalRatio = 0.5f;
    String width = "400px";
    int xBarWidth;
    String xCenter = "55%";
    int xMax;
    int xMin;
    int xStep;
    String xValueLabel;
    int yBarWidth;
    String yCenter = "45%";
    int yMax;
    int yMin;
    int yStep;
    String yValueLabel;
    int zMin;
    int zMax;
    int zStep;
    String zValueLabel;
    String xLabel = "x";
    String yLabel = "y";
    String zLabel = "z";
    String filterLabel = "time";
    String legendLabel = "value";

    public int getAnimationInterval() {
        return animationInterval;
    }

    public void animationInterval(int animationInterval) {
        this.animationInterval = animationInterval;
    }

    public boolean isAnimationPreload() {
        return animationPreload;
    }

    public void animationPreload(boolean animationPreload) {
        this.animationPreload = animationPreload;
    }

    public boolean isAnimationAutoStart() {
        return animationAutoStart;
    }

    public void animationAutoStart(boolean animationAutoStart) {
        this.animationAutoStart = animationAutoStart;
    }

    public BackgroundColor getBackgroundColor() {
        return backgroundColor;
    }

    public void backgroundColor(BackgroundColor backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public CameraPosition getCameraPosition() {
        return cameraPosition;
    }

    public void cameraPosition(CameraPosition cameraPosition) {
        this.cameraPosition = cameraPosition;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public boolean isKeepAspectRatio() {
        return keepAspectRatio;
    }

    public void keepAspectRatio(boolean keepAspectRatio) {
        this.keepAspectRatio = keepAspectRatio;
    }

    public boolean isShowAnimationControls() {
        return showAnimationControls;
    }

    public void showAnimationControls(boolean showAnimationControls) {
        this.showAnimationControls = showAnimationControls;
    }

    public boolean isShowGrid() {
        return showGrid;
    }

    public void showGrid(boolean showGrid) {
        this.showGrid = showGrid;
    }

    public boolean isShowPerspective() {
        return showPerspective;
    }

    public void showPerspective(boolean showPerspective) {
        this.showPerspective = showPerspective;
    }

    public boolean isShowShadow() {
        return showShadow;
    }

    public void showShadow(boolean showShadow) {
        this.showShadow = showShadow;
    }

    public Graph3d.Style getStyle() {
        return style;
    }

    public void setStyle(Graph3d.Style style) {
        this.style = style;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public int getValueMax() {
        return valueMax;
    }

    public void setValueMax(int valueMax) {
        this.valueMax = valueMax;
    }

    public int getValueMin() {
        return valueMin;
    }

    public void setValueMin(int valueMin) {
        this.valueMin = valueMin;
    }

    public float getVerticalRatio() {
        return verticalRatio;
    }

    public void setVerticalRatio(float verticalRatio) {
        this.verticalRatio = verticalRatio;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public int getxBarWidth() {
        return xBarWidth;
    }

    public void setxBarWidth(int xBarWidth) {
        this.xBarWidth = xBarWidth;
    }

    public String getxCenter() {
        return xCenter;
    }

    public void setxCenter(String xCenter) {
        this.xCenter = xCenter;
    }

    public int getxMax() {
        return xMax;
    }

    public void setxMax(int xMax) {
        this.xMax = xMax;
    }

    public int getxMin() {
        return xMin;
    }

    public void setxMin(int xMin) {
        this.xMin = xMin;
    }

    public int getxStep() {
        return xStep;
    }

    public void setxStep(int xStep) {
        this.xStep = xStep;
    }

    public String getxValueLabel() {
        return xValueLabel;
    }

    public void setxValueLabel(String xValueLabel) {
        this.xValueLabel = xValueLabel;
    }

    public int getyBarWidth() {
        return yBarWidth;
    }

    public void setyBarWidth(int yBarWidth) {
        this.yBarWidth = yBarWidth;
    }

    public String getyCenter() {
        return yCenter;
    }

    public void setyCenter(String yCenter) {
        this.yCenter = yCenter;
    }

    public int getyMax() {
        return yMax;
    }

    public void setyMax(int yMax) {
        this.yMax = yMax;
    }

    public int getyMin() {
        return yMin;
    }

    public void setyMin(int yMin) {
        this.yMin = yMin;
    }

    public int getyStep() {
        return yStep;
    }

    public void setyStep(int yStep) {
        this.yStep = yStep;
    }

    public String getyValueLabel() {
        return yValueLabel;
    }

    public void setyValueLabel(String yValueLabel) {
        this.yValueLabel = yValueLabel;
    }

    public int getzMin() {
        return zMin;
    }

    public void setzMin(int zMin) {
        this.zMin = zMin;
    }

    public int getzMax() {
        return zMax;
    }

    public void setzMax(int zMax) {
        this.zMax = zMax;
    }

    public int getzStep() {
        return zStep;
    }

    public void setzStep(int zStep) {
        this.zStep = zStep;
    }

    public String getzValueLabel() {
        return zValueLabel;
    }

    public void setzValueLabel(String zValueLabel) {
        this.zValueLabel = zValueLabel;
    }

    public String getxLabel() {
        return xLabel;
    }

    public void setxLabel(String xLabel) {
        this.xLabel = xLabel;
    }

    public String getyLabel() {
        return yLabel;
    }

    public void setyLabel(String yLabel) {
        this.yLabel = yLabel;
    }

    public String getzLabel() {
        return zLabel;
    }

    public void setzLabel(String zLabel) {
        this.zLabel = zLabel;
    }

    public String getFilterLabel() {
        return filterLabel;
    }

    public void setFilterLabel(String filterLabel) {
        this.filterLabel = filterLabel;
    }

    public String getLegendLabel() {
        return legendLabel;
    }

    public void setLegendLabel(String legendLabel) {
        this.legendLabel = legendLabel;
    }
}
