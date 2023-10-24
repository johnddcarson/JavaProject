package Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer boxedInteger = Integer.valueOf(15);

		System.out.println(boxedInteger.getClass().getName());

		LinkedList<String> placesToVisLinkList = new LinkedList<>();

		placesToVisLinkList.add("Ballymena");
		placesToVisLinkList.add("Derry");

		System.out.println(placesToVisLinkList);

		placesToVisLinkList.addFirst("Belfast");
		placesToVisLinkList.addFirst("Paris");
		placesToVisLinkList.addLast("Jordan");

		placesToVisLinkList.push("Portadown");
		System.out.println(placesToVisLinkList);
		placesToVisLinkList.removeLast();
		placesToVisLinkList.sort(Comparator.naturalOrder());
		System.out.println(placesToVisLinkList);
		ArrayList<String> johnArrayList = new ArrayList<String>();
		johnArrayList.add("Ballymena Array");
		johnArrayList.add("Ballymena ArrayList");
		johnArrayList.add("Derry Array");
		testIterator(placesToVisLinkList);
		testIterator(johnArrayList);

	}

	private static void testIterator(LinkedList<String> list) {

		var iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(list);
	}

	private static void testIterator(ArrayList<String> list) {
		System.out.println(list);
		var iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println(list);
	}

}
