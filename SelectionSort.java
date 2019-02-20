

public class SelectionSort implements SortingAlgorithm{

	public void sort(int [] a){
		int lenght = a.length; 

		for (int i = 0; i < length-1; i++) //Go through array
		{ 
			int min = i; //Start of subarray
			for (int j = i+1; j < length; j++) //Go through sub array (the part of the array that isnt sorted)
				if (a[j] < a[min]) //Find min value and get its index
					min = j; 

			int temp = a[min]; //Place the the min value at the start of the subarray
			a[min] = a[i]; 
			a[i] = temp; 
		} 
	}
}