package HashChallange;

import java.util.HashSet;
import java.util.Set;

public class Contact {

	private String name;
	private Set<String> emails = new HashSet<>();
	private Set<String> phones = new HashSet<>();

	public Contact(String name) {
		this(name, null);
	}

	public Contact(String name, String email) {
		this(name, email, 0);
	}

	public Contact(String name, long phone) {
		this(name, null, phone);

	}

	public Contact(String name, String email, long phone) {
		this.name = name;
		if (email != null) {
			emails.add(email);
		}
		if (phone > 0) {
			String p = String.valueOf(phone);
			phones.add(p);
		}

	}

	protected String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", emails=" + emails + ", phones=" + phones + "]";
	}

	@Override
	public boolean equals(Object o) {
		Contact contact = (Contact) o;

		return getName().equals(contact.getName());
	}

	@Override
	public int hashCode() {
		return 33 * getName().hashCode();
	}

	public Contact merContactData(Contact contact) {

		Contact newContact = new Contact(name);
		newContact.emails = new HashSet<>(this.emails);
		newContact.phones = new HashSet<>(this.phones);
		newContact.emails.addAll(contact.emails);
		newContact.phones.addAll(contact.phones);

		return newContact;
	}

	public void addEmail(String companyName) {

		String[] names = name.split(" ");
		String email = names[0].toLowerCase() + "." + names[1].toLowerCase() + "@" + companyName.toLowerCase() + ".com";

		emails.add(email);

	}

	public void addphone(String number) {

		phones.add(number);
	}

	public void replaceEmailIfExists(String oldEmail, String newEmail) {

		if (emails.contains(oldEmail)) {
			emails.remove(oldEmail);
			emails.add(newEmail);
		}
	}

}
