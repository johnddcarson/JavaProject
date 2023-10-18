package Encapsulation;

public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = tonerLevel;
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean isDuplex() {
		return duplex;
	}

	public int addToner(int addToner) {

		int tempAmount = addToner + tonerLevel;
		if (tempAmount > 100 || tempAmount < 0) {
			return -1;
		}
		tonerLevel += addToner;
		return tonerLevel;
	}

	public int printPages(int pages) {

		int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
		pagesPrinted += jobPages;
		return jobPages;

	}

}
