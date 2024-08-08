//WJP to perform Merge sort using recursion 
package javahackathon1;
public class Question29 {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n=arr.length;
        System.out.println("Given array is");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array is");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

	}
	public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergeSort(arr, left, mid);	// Sort first and second halves recursively
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);	//// Merge the sorted halves
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        
        // Merge the temporary arrays back into arr[left..right]
        int i = 0, j = 0; // Initial indexes of first and second subarrays
        int k = left; // Initial index of merged subarray
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}