package Lists;

import java.util.ArrayList;

public class MobilePhone {

	private String mynumberString;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String mynumberString) {
		this.mynumberString = mynumberString;
		this.myContacts = new ArrayList<Contact>();
	}

	public boolean addNewContact(Contact contact) {
		if (!myContacts.contains(contact)) {
			myContacts.add(contact);
			return true;
		}
		return false;
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		int oldContactIndex = myContacts.indexOf(oldContact);
		if (oldContactIndex >= 0) {
			myContacts.set(oldContactIndex, newContact);
			return true;
		}
		return false;
	}

	public int findContact(Contact contactToFind) {
		return myContacts.indexOf(contactToFind);
	}

	public int findContact(String nameToFind) {
		for (int i = 0; i < myContacts.size(); i++) {
			Contact contact = myContacts.get(i);
			if (contact.getName().equals(nameToFind)) {
				return i; // Contact with the specified name found, return its index
			}
		}
		return -1; // Contact with the specified name not found
	}

	public Contact queryContact(String nameToFind) {
		for (Contact contact : myContacts) {
			if (contact.getName().equals(nameToFind)) {
				return contact; // Contact with the specified name found, return it
			}
		}
		return null; // Contact with the specified name not found
	}

	public void printContact() {

		System.out.println("Contact List:");
		for (Contact contact : myContacts) {
			System.out.println("Name: " + contact.getName());
			System.out.println("Phone Number: " + contact.getPhoneNumber());
			System.out.println("----------------------------");
		}

	}
}
