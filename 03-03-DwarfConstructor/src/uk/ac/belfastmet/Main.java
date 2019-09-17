package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

		dwarfs.add(new Dwarf("Sleepy", "Disney"));
		dwarfs.add(new Dwarf("Happy", "Disney"));
		dwarfs.add(new Dwarf("Grumpy", "Disney"));
		dwarfs.add(new Dwarf("Dopey", "Disney"));
		dwarfs.add(new Dwarf("Bashful", "Disney"));
		dwarfs.add(new Dwarf("Doc", "Disney"));
		dwarfs.add(new Dwarf("Sneezy", "Disney"));

		dwarfs.add(new Dwarf("Thorin", "Tolkien"));
		dwarfs.add(new Dwarf("Balin", "Tolkien"));
		dwarfs.add(new Dwarf("Dwalin", "Tolkien"));
		dwarfs.add(new Dwarf("Fifu", "Tolkien"));

		System.out.println("The Tolkien dwarfs are:");
		for (String dwarf : dwarfs) {
			if (dwarf.getAuthor() == "Tolkien") {
				System.out.println(dwarf.getName());
			}
		}

	}

}
