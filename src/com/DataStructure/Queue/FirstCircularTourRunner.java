/*
 * Link to question description - 
 *     https://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/
*/

package com.DataStructure.Queue;

import com.DataStructure.Queue.FirstCircularTourThatVisitsAllPetrolPumps.PetrolPump;

public class FirstCircularTourRunner {

	public static void main(String[] args) {
	
		FirstCircularTourThatVisitsAllPetrolPumps obj = new FirstCircularTourThatVisitsAllPetrolPumps();
		PetrolPump[] arr = {
				new PetrolPump(4, 6),
				new PetrolPump(6, 5),
				new PetrolPump(7, 3),
				new PetrolPump(4, 5)
		};
		
		int start = FirstCircularTourThatVisitsAllPetrolPumps.Tour(arr, arr.length);
		start++;
		System.out.println(start==-1 ? "No solution":"Start: " + start);
		
		
	}

}
