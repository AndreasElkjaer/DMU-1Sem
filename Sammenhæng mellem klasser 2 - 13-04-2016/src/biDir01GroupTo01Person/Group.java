package biDir01GroupTo01Person;

public class Group {
    private String name;
    // link to Person object (--> 0..1)
    private Person person;

    public Group(String name) {
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
     * Returns the person of this group.
     * Note: Returns null, if this group has no person.
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the person of this group.
     */
    public void setPerson(Person person) {
        this.person = person;
    }
}
