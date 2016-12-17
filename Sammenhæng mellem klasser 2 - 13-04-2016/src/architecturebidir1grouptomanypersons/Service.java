package architecturebidir1grouptomanypersons;

public class Service {
	/**
	 * Creates a new person linked to the group.
	 */
	public static Person createPerson(String name, Group group) {

		Person person = new Person(name, group);
		// set the bidirectional link
		group.addPerson(person);
		// add the person to storage
		Storage.addPerson(person);
		return person;
	}

	/**
	 * Deletes the person.
	 */
	public static void deletePerson(Person person) {
		// remove an existing link from a group to the person
		Group group = person.getGroup();
		if (group != null) {
			group.removePerson(person);
		}
		// remove person from storage
		Storage.removePerson(person);
	}

	/**
	 *
	 * Connects the person and the group.
	 */
	public static void connectPersonToGroup(Person person, Group group) {
		// remove an existing link from a group to the person
		Group oldGroup = person.getGroup();
		if (oldGroup != null) {
			oldGroup.removePerson(person);
		}
		// set the new connection both ways
		person.setGroup(group);
		group.addPerson(person);
	}

}
