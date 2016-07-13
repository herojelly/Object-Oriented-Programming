// Gregory Jerian
// Period 4
// Project 11.7

import java.util.ArrayList;
import java.util.Collections;

public class ch11_7 {

	public static void main(String[] args) {
		// Initializes and prints original list
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.print("Original list: ");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		
		// shuffles the list
		shuffle(list);
		
		// prints new list
		System.out.print("\nNew list: ");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}
	
	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
	}

}
