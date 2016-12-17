package biDirManyGroupsToManyPersons;

import java.util.ArrayList;

public class Person {
    private String name;
    // link to Group objects (--> 0..*)
    private ArrayList<Group> groups = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns a list of this person's groups.
     */
    public ArrayList<Group> getGroups() {
        return new ArrayList<>(groups);
    }

    /**
     * Adds the group to this person.
     */
    public void addGroup(Group group) {
        groups.add(group);
    }

    /**
     * Removes the group from this person.
     */
    public void removeGroup(Group group) {
        groups.remove(group);
    }

}
