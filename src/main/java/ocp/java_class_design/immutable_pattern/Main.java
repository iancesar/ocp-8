package ocp.java_class_design.immutable_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Ian");
        Person p2 = new Person("Jorge");

        List<Person> members = new ArrayList<>();
        members.add(p1);
        members.add(p2);

        Group group = new Group(members);

        System.out.println(group.getMembers().toString());


    }

}
