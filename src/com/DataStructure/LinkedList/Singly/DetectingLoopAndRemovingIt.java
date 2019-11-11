package com.DataStructure.LinkedList.Singly;

public class DetectingLoopAndRemovingIt {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(16);
		list.insert(43);
		list.insert(67);
		list.insert(82);
		list.insert(17);
		list.insert(39);
		list.insert(48);
		System.out.println("Original List: ");
		list.show();
		
		list.createloop();
		
		Boolean loopDetected = list.loopDetection();
		System.out.println("Loop Detected: " + loopDetected);  
		
		list.show();
		

	}

}
