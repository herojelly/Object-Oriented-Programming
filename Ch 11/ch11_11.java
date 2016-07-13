// Gregory Jerian
// Period 4
// Project 11.11

import java.util.ArrayList;
import java.util.Collections;

public class ch11_11 {

	public static void main(String[] args) {
		// Initializes and prints original list
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);
		System.out.print("Original list: ");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		
		// sort the list
		sort(list);
		
		// prints new list
		System.out.print("\nNew list: ");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

	}
	
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}

}
