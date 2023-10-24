package Lists;

public class MobilePhoneMain {

	public static void main(String[] args) {

		Contact contact1 = new Contact("Heahter Carson", "12345678");
		Contact contact2 = new Contact("Katrina Carson", "9876543");
		Contact contact3 = new Contact("Jason Carson", "9876543");

		MobilePhone johnMobilePhone = new MobilePhone("07757986633");

		johnMobilePhone.addNewContact(contact1);
		johnMobilePhone.addNewContact(contact1);
		johnMobilePhone.addNewContact(contact2);
		johnMobilePhone.printContact();
		johnMobilePhone.updateContact(contact1, contact3);
		johnMobilePhone.printContact();

	}

}
