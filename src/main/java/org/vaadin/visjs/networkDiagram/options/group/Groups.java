package org.vaadin.visjs.networkDiagram.options.group;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by roshans on 10/29/14.
 */
public class Groups {

    private boolean useDefaultGroups = true; //If your nodes have groups defined that are not in the Groups module, the module loops over the groups it does have,
                                            // allocating one for each unknown group. When all are used, it goes back to the first group.
                                                // By setting this to false, the default groups will not be used in this cycle.

    private Map<String, Group> groups = new HashMap();

    @Deprecated
    public void addGroup(Group group){
        addGroup("default",group);
    }

    public void addGroup(String name, Group group){
        groups.put(name, group);
    }

    @Deprecated
    public void removeGroup(Group group){
        groups.remove("default");
    }

    public void removeGroup(String name){
        groups.remove(name);
    }

    public void clearAll(){
        groups.clear();
    }

    @Deprecated
    public List<Group> getGroups(){
        return (List<Group>) groups.values();
    }

    public Map<String,Group> getGroupsMap(){
        return groups;
    }

}
