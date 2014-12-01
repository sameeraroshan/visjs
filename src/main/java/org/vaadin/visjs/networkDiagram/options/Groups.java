package org.vaadin.visjs.networkDiagram.options;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roshans on 10/29/14.
 */
public class Groups {

    private List<Group> groups = new ArrayList<>();

    public void addGroup(Group group){
        groups.add(group);
    }

    public void removeGroup(Group group){
        groups.remove(group);
    }

    public void clearAll(){
        groups.clear();
    }

    public List<Group> getGroups(){
        return groups;
    }

}
