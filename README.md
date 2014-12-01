visjs
=====

visjs vaadin addon

===
When using a DataSet, the network is automatically updating to changes in the DataSet.
Nodes support the properties listed below. Each node can be configured individually using the properties highlighted in green over at the Nodes configuration.

Name	Type	Required	Description
group	Number | String	no	A group number or name. The type can be number, string, or an other type. All nodes with the same group get the same color schema.
allowedToMoveX	Boolean	no	If allowedToMoveX is false, then the node will not move in the X direction from its position.
allowedToMoveY	Boolean	no	If allowedToMoveY is false, then the node will not move in the Y direction from its position.
id	Number | String	yes	A unique id for this node. Nodes may not have duplicate id's. Id's do not need to be consecutive. An id is normally a number, but may be any type.
level	number	no	This level is used in the hierarchical layout. If this is not selected, the level does not do anything.
label	string	no	Text label to be displayed in the node or under the image of the node. Multiple lines can be separated by a newline character \n .
title	string | function | Element	no	Title to be displayed when the user hovers over the node. The title can be an HTML element or a string containing plain text or HTML. When title is a function, the returned result is displayed as tooltip, and returning undefined will prevent the tooltip from being displayed.
value	number	no	A value for the node. The radius of the nodes will be scaled automatically from minimum to maximum value. Only applicable when the shape of the node is dot. If a radius is provided for the node too, it will override the radius calculated from the value.
x	number	no	Horizontal position in pixels. The horizontal position of the node will be fixed unless combined with the allowedToMoveX:true option. The vertical position y may remain undefined.
y	number	no	Vertical position in pixels. The vertical position of the node will be fixed unless combined with the allowedToMoveY:true option. The horizontal position x may remain undefined.
