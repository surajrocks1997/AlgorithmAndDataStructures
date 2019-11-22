/*
 * Link to question description - 
 *     https://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/
*/

package com.DataStructure.Queue;

public class FirstCircularTourThatVisitsAllPetrolPumps {

	static class PetrolPump{
		int petrol;
		int distance;
		
		public PetrolPump(int petrol, int distance) {
			super();
			this.petrol = petrol;
			this.distance = distance;
		}
	}

	public static int Tour(PetrolPump[] arr, int length) {
		int start = 0;
		int end = 1;
		int petrolRemaining = arr[start].petrol - arr[start].distance;
		
		while(end != start) {
			if(petrolRemaining > 0 && end != start) {
				petrolRemaining = petrolRemaining + arr[end].petrol - arr[end].distance;
				end = (end + 1) % length;
			}
			else {
				start++;
				petrolRemaining = arr[start].petrol - arr[start].distance;
				end = start + 1;
			}
		}
		if(start == length-1 && petrolRemaining < 0) {
			return -2;
		}
		else
			return start;
	}
}
