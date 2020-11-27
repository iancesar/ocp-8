package ocp.java_class_design.immutable_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {

    private final List<Person> members;

    public Group(List<Person> members) {
        this.members = new ArrayList<>(members);
    }

    public List<Person> getMembers() {
        return Collections.unmodifiableList(members);
    }
}
