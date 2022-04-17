package com.reversedstringarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserMainCode {
	public static void getElementPosition(ArrayList<String> list)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int upperlimit = scanner.nextInt();// getting number of elements that you are going to enter
		System.out.println("Enter the elements");
		for (int i = 0; i < upperlimit; i++) 
		{
			list.add(scanner.next());// getting the elements of fist arraylist 
		}
		Collections.sort(list, Collections.reverseOrder());//to sort the given array in reverse alphabetical order
		System.out.println("sorted array in reverse alphabetical order:"+list);
		System.out.println("Enter the element which u need to search");
		String colour=scanner.next();
	    System.out.println(list.indexOf(colour)+1);//+1 is given here to ensure the index position starting from 1,as it was given in question
		
	}

}
