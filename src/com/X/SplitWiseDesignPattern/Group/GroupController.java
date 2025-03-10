package com.X.SplitWiseDesignPattern.Group;

import com.X.SplitWiseDesignPattern.User.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {

    private List<Group> groups;

    public GroupController(){
        this.groups = new ArrayList<>();
    }

    public List<Group> getGroups() {
        return groups;
    }

//    CREATE GROUP
    public void createNewGroup(String groupID, String groupName, User createdByUser){
        Group group = new Group();
        group.setGroupID(groupID);
        group.setGroupName(groupName);
        group.addMember(createdByUser);

        groups.add(group);
    }

//    GET GROUP
    public Group getGroup(String groupID){
        for (Group group:groups){
            if (group.getGroupID().equals(groupID)){
                return group;
            }
        }
        return null;
    }
}
