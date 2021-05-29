package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("CyberBugs");
        group1.addMember("Berk");
        group1.addMember("Maria");
        group1.addMember("Duraid");
        group1.addMember("Ali");
        group1.addMember("Bashir");
        group1.addMember("Maria");
        group1.addMember("Parvin");
        group1.addMember("Pavel");

        System.out.println(group1);
        System.out.println(group1.getMembers().size());
        group1.addMember("Irwen");
        group1.removeMember("Ali");

        //Group2
        Group group2= new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephoe", "Wakshum", "Akram", "Bulent", "Andrea", "Andrei"));

        System.out.println("Group2 members = " + group2.getMembers());


        if(group2.getMembers().contains("Akram")){
            System.out.println("Akram is in the group");
        }else{
            System.out.println("Akram is not in the group");
        }


        group1.removeMember("Pavel");
        System.out.println(group1);
    }
}
