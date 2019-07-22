package org.avinash.linkedlist;

public class ElementDeleteOfList {

	public static void main(String... args) {

		LinkedList list = new LinkedList();
		list.data = 6;
		list.next = new LinkedList();
		list.next.data = 2;
		list.next.next = new LinkedList();
		list.next.next.data = 7;
		list.next.next.next = new LinkedList();
		list.next.next.next.data = 4;
		list.next.next.next.next = new LinkedList();
		list.next.next.next.next.data = 5;
		list.next.next.next.next.next = null;
		LinkedList temp = list;
		System.out.println("Original");
		print(temp);
		System.out.println("After deleteion");
		print(deleteGreaterElement(list, 3));

	}

	public static LinkedList deleteGreaterElement(LinkedList list, int number) {
		LinkedList temp = list;
		LinkedList prev = temp;
		while (temp != null) {
			if (temp.data > number) {
				if (temp.next != null) {
					temp.data = temp.next.data;
					temp.next = temp.next.next;
				} else {
					prev.next = null;
					temp = null;
				}

			} else {
				prev = temp;
				temp = temp.next;
			}
		}

		return list;

	}
	
	public static void print(LinkedList list) {
		LinkedList temp = list;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

class LinkedList {
	int data;
	LinkedList next;
}
