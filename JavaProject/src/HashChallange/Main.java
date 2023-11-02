package HashChallange;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		List<Contact> emails = ContactData.getData("email");
		List<Contact> phones = ContactData.getData("phone");
		// printData("Phone List", phones);
		// printData("Email List", emails);

		Set<Contact> emailContacts = new HashSet<>(emails);
		Set<Contact> phoneContacts = new HashSet<>(phones);
		// printData("Email", emailContacts);
		// printData("Phone", phoneContacts);

		Contact contact = new Contact("John Carson");

		int index = emails.indexOf(new Contact("Robin Hood"));
		Contact robinHood = emails.get(index);
		robinHood.addEmail("SherwoodForest");
		robinHood.replaceEmailIfExists("robin.hood@sherwoodforest.com", "robin.hood@sherwoodhoodsforest.com");
		System.out.println();
		System.out.println(robinHood);

		int index2 = emails.indexOf(new Contact("Daffy Duck"));
		Contact daffyContact = emails.get(index2);
		daffyContact.addphone("123456");
		System.out.println(index2);
		// System.out.println("Test");

		// printData("Email", emailContacts);
		// printData("Phone", phoneContacts);

		Set<Contact> unionAB = new HashSet<>();

		unionAB.addAll(phoneContacts);
		unionAB.addAll(emailContacts);

		// unionAB.forEach(System.out::println);

		// printData("Union List", unionAB);

		Set<Contact> interSetAB = new HashSet<>(emailContacts);
		interSetAB.retainAll(phoneContacts);
		interSetAB.retainAll(emailContacts);

		// printData("interSetAB List", interSetAB);

		Set<String> boyNames = new HashSet<>();
		Set<String> boyNames2 = new HashSet<>();

		boyNames.addAll(Arrays.asList("John", "Jack", "James", "John"));
		boyNames2.addAll(Arrays.asList("John", "Jack", "James", "Peter", "Roma", "Tiernan"));
		boyNames.forEach(System.out::println);
		System.out.println();
		boyNames2.forEach(System.out::println);

		Set<String> uniboyNames = new HashSet<>();
		System.out.println();
		uniboyNames.addAll(boyNames);
		uniboyNames.addAll(boyNames2);
		uniboyNames.forEach(System.out::println);

		Set<String> retainNames = new HashSet<>();
		System.out.println();
		retainNames.retainAll(boyNames);
		retainNames.retainAll(boyNames2);
		retainNames.forEach(System.out::println);

	}

	public static void printData(String header, Collection<Contact> contacts) {

		System.out.println("----------------------------------------------");
		System.out.println(header);
		System.out.println("----------------------------------------------");
		contacts.forEach(System.out::println);
	}
}
