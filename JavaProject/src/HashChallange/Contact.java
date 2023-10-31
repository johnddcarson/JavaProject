package HashChallange;

import java.util.HashSet;
import java.util.Set;

public class Contact {

	private String name;
	private Set<String> emails = new HashSet<String>();
	private Set<String> phones = new HashSet<String>();

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

	public Contact merContactData(Contact contact) {

		Contact newContact = new Contact(name);
		newContact.emails = new HashSet<>(this.emails);
		newContact.phones = new HashSet<>(this.phones);
		newContact.emails.addAll(contact.emails);
		newContact.phones.addAll(contact.phones);

		return newContact;

	}

}
