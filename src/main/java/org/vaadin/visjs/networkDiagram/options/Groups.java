package org.vaadin.visjs.networkDiagram.options;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by roshans on 10/29/14.
 */
public class Groups {

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
