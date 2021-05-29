package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String GroupName;
    private List<String> members = new ArrayList<>();

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Group{" +
                "GroupName='" + GroupName + '\'' +
                ", members=" + members +
                '}';
    }
    public void addMember(String newMember){
        this.members.add(newMember);
    }

    public void removeMember(String member){
        this.members.remove(member);
    }
    public Group(){
        this.GroupName= "Group18";
        this.members.add("Duraid");
    }
    public Group(String name){
        this.GroupName = name;
        this.members= new ArrayList<>();
    }
}
