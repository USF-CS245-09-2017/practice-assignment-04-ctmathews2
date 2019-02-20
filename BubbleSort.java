

public class BubbleSort implements SortingAlgorithm{

	public void sort(int [] a){
		int length = a.length; 
		for (int i = 0; i < length-1; i++) 
			for (int j = 0; j < length-i-1; j++) //Passes through all of the array multiple times
				if (a[j] > a[j+1]) //if the current element is bigger than the next element
				{ 
					int temp = a[j]; //swap by storing current element in temp
					a[j] = a[j+1];   //put next element in current element
					a[j+1] = temp;   //put current element(temp) in next element
				}
	} //Finished with after passing through multiple times. Last pass through should have no swaps
}