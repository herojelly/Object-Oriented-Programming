// Gregory Jerian
// Period 4
// Project 4.41
// Expected input is any number of ints. Input ends with number 0.

import java.util.Scanner;

public class ch4_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, max = -15, count = 0;
		System.out.println("This program reads integers, finds the largest of them, and counts its occurences.");
		System.out.print("Enter any number of integers. Input ends with number 0: ");
		n = input.nextInt();
		while (n != 0){
			if (n > max){
				max = n;
				count = 1;
			}
			else if (n == max)
				count++;
			n = input.nextInt();
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurence count of the largest number is " + count);
	}

}
