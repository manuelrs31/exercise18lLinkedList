package com.exercise18LinkedList.app;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Iterator;
public class LinkedListApp {

	public static void main(String[] args) 
	{
		final int elements = 100;
		
		LinkedList<Byte> myList = new LinkedList<Byte>();
		ArrayList<Short> myList2 = new ArrayList<Short>();
		Stack<Integer> myList3 = new Stack<Integer>();
		PriorityQueue<Double> myList4 = new PriorityQueue<Double>();
		HashMap<Integer, String> miDiccionario = new HashMap<Integer, String>();
		
		Random numbers = new Random();
		
		myList.add((byte)5);
		myList.add((byte)10);
		myList.add((byte)20);
		myList.add((byte)30);
		myList.add((byte)40);
		myList.set(0, (byte)2); // this is slower than arrayList
	//	myList.get(1);
		System.out.println(myList.get(1));
	/*	System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList.remove()); */
		System.out.println(myList);
		Byte number =2;
		System.out.println(myList.size());
		System.out.println(myList.isEmpty());
		System.out.println(myList.contains(number));
		myList.clear();
		System.out.println(myList);
	
		for (int i=0; i<elements; i++)
		{
			myList.add((byte)numbers.nextInt(100));
		}
		System.out.println(myList);
		
		Iterator miIterator = myList.descendingIterator();
		while (miIterator.hasNext())
		{
			System.out.println(miIterator.next());
		}
		
		for (Byte minumber : myList)
		{
			System.out.println(minumber);
		}
		
		
		myList2.add((short)5);
		myList2.add((short)10);
		myList2.add((short)20);
		myList2.add((short)30);
		myList2.add((short)40);
		System.out.println(myList2);
		
		myList2.set(0, (short)2);
		
		System.out.println(myList2.get(2));
		System.out.println(myList2);
		System.out.println(myList2.remove(2));
		System.out.println(myList2);
		miIterator = myList2.iterator();
		while(miIterator.hasNext())
		{
			System.out.println(miIterator.next());
		}
		for(Short miShort:myList2)
		{
			System.out.println(miShort);
		}
		
	

	}

}
